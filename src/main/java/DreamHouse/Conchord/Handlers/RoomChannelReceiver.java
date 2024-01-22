package DreamHouse.Conchord.Handlers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.util.StopWatch;

@RabbitListener(queues = "ping")
public class RoomChannelReceiver
{
  private void work(String input) throws InterruptedException
  {
    for (var ch : input.toCharArray())
    {
      if (ch == '.') Thread.sleep(1000);
    }
  }

  @RabbitListener(queues = "#{autoDeleteQueues.name}")
  public void ReceiveQueueName(String input, int receiverNum)
  throws InterruptedException
  {
    this.Receive(input, receiverNum);
  }

  @RabbitHandler
  public void Receive(String input, int receiverN) throws InterruptedException
  {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    System.out.println("[x] Received :=\t" +
                       input +
                       "\nReceiverN :=\t" +
                       receiverN);
    this.work(input);
    stopWatch.stop();
  }
}
