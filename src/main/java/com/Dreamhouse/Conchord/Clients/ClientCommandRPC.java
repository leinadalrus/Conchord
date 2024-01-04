package com.Dreamhouse.Conchord.Clients;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class ClientCommandRPC
{
  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private TopicExchange topicExchange;

  @Scheduled(fixedDelay = 1000,
             initialDelay = 1000)
  public void send()
  {
    String response = (String) this.rabbitTemplate.convertSendAndReceive(this.topicExchange.getName(),
                                                                         "rpc");
    System.out.println("Got:\t'" + response);
  }
}
