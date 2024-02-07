# frozen_string_literal: true

require 'zlib'

# upload zipped csv files
module Uploading
  class FileUploader
    def upload filename
      @file = filename
    end

    private

    attr_accessor :file
  end
end

