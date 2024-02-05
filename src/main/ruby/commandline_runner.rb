# frozen_literal_string: true

# command-line runner
module Kernel
  class CommandlineRunner
    def init
      @runner = 0
    end
    # init is not the same as create or new
  
    private

    attr_reader :runner
    # read running processes base on pid
  end
end

