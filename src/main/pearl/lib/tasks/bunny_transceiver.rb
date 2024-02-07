require 'bunny'

# Subscribers
module Transceivers
  # Subcriber
  class BunnyTransceiver
    def create_connection hostname
      # create instances of the connection
      @connection = Bunny.new(hostname: hostname)
      @connection.start

      @channel = @connection.create_channel
      # create instances over returning local variables
      # return connection
    end
    # end create_connection

    # since channel creation is an instance
    # the method below is unecessary:
    # def connect_channel hostname
    #   connection = create_connection(hostname)
    #   channel = connection.create_channel
    #   return connection, channel
    # end

    def start_messaging message
      @queue = channel.queue(
        message,
        :exclusive => false,
        :auto_delete => true
      )

      # todo(message): template modifier/manipulator
      # change the message into a generative random uuid
      @exchange = channel.default_exchange.direct(message)
    end
    # end queue_message

    def exchange_route_for message
      # todo(message): template modifier/manipulator
      # change the message into a generative random uuid
      exchange.publish(message, routing_key: queue_message(message).name)
      puts queue.name, message
    end
    # end exchange_route_for message

    def destroy_channel channel
      # channel is tied to its instance. don't call for its instance
      channel.close
    end
    # end destroy_channel

    def close_connection connection
      connection.close
    end

    private

    # class members as trivial getter methods over `@@` class variables
    # this is similar to getters methods but as syntactic sugar
    # the colon `:` before the member means class attribute
    # if after the `:` colon that means its deconstructurer
    # to to be confused to C++'s namespace: "module" `::` "class"
    attr_reader :channel, :exchange, :queue, :connection

    # this "template" instance hasn't been declared yet-
    # -therefore an `attr_writer` (and `attr_accessor`) is invalid
    # attr_writer :template # uncomment for later [?]

    # for postgresql database driver
    # note: but the JSON-RPC would suffice-
    # -and substitute for these implicit parameters
    # def channel_params; end
    # def message_attrs; end
  end
  # end RabbitTransceiver
end
#end module Transceivers

