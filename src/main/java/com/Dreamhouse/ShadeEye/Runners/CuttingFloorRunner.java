package com.Dreamhouse.ShadeEye.Runners;

import com.Dreamhouse.ShadeEye.Channels.CuttingFloor;
import com.Dreamhouse.ShadeEye.Messengers.CuttingFloorMessenger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CuttingFloorRunner implements CommandLineRunner
{
  private final RabbitTemplate rabbitTemplate;
  private final CuttingFloor receiver;

  public CuttingFloorRunner(CuttingFloor receiver, RabbitTemplate rabbitTemplate) {
    this.receiver = receiver;
    this.rabbitTemplate = rabbitTemplate;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Sending message...");
    rabbitTemplate.convertAndSend(CuttingFloorMessenger.topicExchangeName, "env.localhost.test", "Hello from RabbitMQ!");
    receiver.getCountDownLatch().await(10000, TimeUnit.MILLISECONDS);
  }
}
