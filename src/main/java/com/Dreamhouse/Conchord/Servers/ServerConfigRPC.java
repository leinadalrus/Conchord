package com.Dreamhouse.Conchord.Servers;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"server", "rpc"})
@Configuration
public class ServerConfigRPC
{
  @Bean
  public Queue queue()
  {
    return new Queue("conchord.rpc.requests");
  }

  @Bean
  public TopicExchange topicExchange(String routingKey)
  {
    return new TopicExchange(routingKey);
  }

  @Bean
  public Binding bindTopic(TopicExchange topicEx, Queue q)
  {
    return BindingBuilder.bind(q).to(topicEx).with("rpc");
  }
}
