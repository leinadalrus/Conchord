require 'bunny'
require 'new/http'
require 'uri'

require './bunny_transceiver.rb'

# Client
module Clients
  class BunnyReceiver
    attr_accessor :uuid, :uri, :response, :lock, :condition,
      :connection, :channel, :keyname, :acknowledge, :exchange

    def exchange_with exchange_name
      @transceiver = Bunny.new(automatically_recover: true)
      @transceiver.start

      @channel = connection.create_channel
      @exchange = channel.default_exchange.direct(exchange_name)

      return self.relegate_exchange_of self.keyname
    end

    def fetch_some address, port
      @uri = URI.parse(address)
      @response = Net::HTTP.get_response(uri)

      exchange.publish(
        address,
        routing_key: keyname,
        correlation_id: port,
        reply_to: acknowledge.name
      )

      puts response.body

      return response
    end

    def destroy_init type
      type.close
      # close self connection
      type = nil # nullify self variable
    end
    def relegate_exchane_init
      @lock = Mutex.new
      @condition = ConditionVariable.new
      @acknowledge = channel.queue('', exclusive: true)
    end

    def relegate_exchange_with keyname
      my = self

      acknowledge.subscribe(block: true) do |_deliver, properties, context|
        if properties[:correlation_id] == my.uuid
          my.response

          my.lock.synchronize { my.condition.signal }
        end

        puts context
      end
    end

    def relegate_exchange_of keyname
      this = self
      this.relegate_exchange_init
      this.relegate_exchange_with(keyname)

    rescue Interrupt => _
      # currying local methods
      this.destroy_init(this.channel_with)
      this.destroy_init(this.connect_to)
    end
  end
end

