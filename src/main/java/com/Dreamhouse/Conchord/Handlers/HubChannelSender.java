package com.Dreamhouse.Conchord.Handlers;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.atomic.AtomicInteger;

public class HubChannelSender
{
  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Autowired
  private TopicExchange topicExchange;

  @Autowired
  private Queue queue;

  AtomicInteger atomicIndex = new AtomicInteger(0);

  @Scheduled(fixedDelay = 1000,
             initialDelay = 1000L)
  public void Send(String input, String[] keys)
  {
    StringBuilder stringBuilder = new StringBuilder(input);
    String message = stringBuilder.toString();

    if (this.atomicIndex.incrementAndGet() == keys.length)
      this.atomicIndex.set(0);

    for (var key : keys)
    {
      key = String.valueOf(this.atomicIndex.get());
      stringBuilder.append(key).append(' ');
      rabbitTemplate.convertAndSend(this.topicExchange.getName(), key, message);

      System.out.println("Sent:\t" + message);
    }
  }
}
