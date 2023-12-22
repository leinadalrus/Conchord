package com.Dreamhouse.ShadeEye.Messengers;

import com.Dreamhouse.ShadeEye.Channels.CuttingFloor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;

public class CuttingFloorMessenger
{
  public static final String topicExchangeName = "Canopy_At_Amstel_Exchange";
  static final String queueName = "Canopy_At_Amstel";

  @Bean
  Queue queue()
  {
    return new Queue(CuttingFloorMessenger.queueName, false);
  }

  @Bean
  TopicExchange exchangeTopic()
  {
    return new TopicExchange(CuttingFloorMessenger.topicExchangeName);
  }

  @Bean
  Binding binding(Queue queue, TopicExchange exchange)
  {
    return BindingBuilder.bind(queue).to(exchange).with("env.localhost.#");
  }

  @Bean
  SimpleMessageListenerContainer container(
    ConnectionFactory connectionFactory,
    MessageListenerAdapter messageListenerAdapter
  )
  {
    SimpleMessageListenerContainer listenerContainer = new SimpleMessageListenerContainer();
    listenerContainer.setConnectionFactory(connectionFactory);
    listenerContainer.setQueueNames(CuttingFloorMessenger.queueName);
    listenerContainer.setMessageListener(messageListenerAdapter);

    return listenerContainer;
  }

  @Bean
  MessageListenerAdapter listenerAdapter(CuttingFloor channelReceiver)
  {
    return new MessageListenerAdapter(channelReceiver, "receiveMessage");
  }
}
