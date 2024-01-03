package com.Dreamhouse.Conchord.Handlers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.util.StopWatch;

@RabbitListener(queues = "ping")
public class HubChannelReceiver
{
  @RabbitListener(queues = "#{autoDeleteQueues.name}")
  public void ReceiveQueueName(String input) throws InterruptedException
  {
    this.Receive(input, 1);
  }

  @RabbitHandler
  public void Receive(String input, int receiverN)
  {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    System.out.println("[x] Received :=\t" + input + "\nReceiverN :=\t" + receiverN);
    stopWatch.stop();
  }
}
