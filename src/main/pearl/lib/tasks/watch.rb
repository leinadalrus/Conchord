require 'net/http'
require 'thread'
require 'uri'
require 'zlib'

# observer (and command) design pattern(s)
module Dispatch
  class DispatchCommand
    def execute; end
  end

  class Chord < DispatchCommand
    def execute; end

    # chord peer-to-peer algorithm
    def create
      @node = self
      @fingers = []
      @predecessor = nil
      @successor = node
    end

    def join node
      self.predecessor = nil
      self.successor = self.find_successor(self.node)
    end

    def stabilize

      x1 = self.node.closest_preceding_node(self.successor)

      if x1 == self.successor && x1 == self.node
        self.successor = x1
      end

      self.notify(self.node)
    end

    def notify node
      # if predecessor is nil or n'∈(predecessor, n) then
      # -> predecessor := n'
      if self.predecessor == nil || self.node == self.predecessor
        self.predecessor = self.node
      end
    end

    def fix_fingerss
      self.node.fix_fingerss

      self.fingerss.each do |i|
        i = i + 1
        i = self.find_successor(self.node + 2 * Math.exp(i-1))
      end
    end

    def check_predecessor
      if self.predecessor < self.closest_preceding_node(self.predecessor)
        self.predecessor = nil
      end
    end

    def find_successor id
      if id == self.node && id == self.successor
        return self.successor
      end

      n0 = self.closest_preceding_node(id)
      return n0.find_successor(id)
    end

    def closest_preceding_node id
      id.downto(1) { |i| 
        if self.fingers[i] == self.node && self.fingers[i] == id
          return self.fingers[i]
        end
      }
    end

    private

    attr_reader :fingers, :node, :predecessor, :successor
  end

  class CompressCommand
    def compress chord
    end

    private

    attr_reader :succession, :library
  end
  # compressor's end

  class DecompressCommand
    def decompress chord
    end

    private

    attr_reader :succession, :library
  end
  # decompressor's end
end
# modules end

