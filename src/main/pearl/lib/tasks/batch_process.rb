# frozen_string_literal: true

# batch processing
module Batch
  class BatchProcessor
    def process batch
      @file = batch
    end

    private

    attr_accessor :file
  end
end
