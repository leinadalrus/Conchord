package com.Dreamhouse.ShadeEye.Channels;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

//
// For convenience, this POJO also has a CountDownLatch.
// This lets it signal that the message has been received.
//This is something you are not likely to implement in a production application.
//

@Component
public class CuttingFloor
{
  private String INITIAL_ANNOUNCEMENT_MESSAGE = "";
  private final CountDownLatch countDownLatch = new CountDownLatch(1);

  public CuttingFloor(final String NEXT_ANNOUNCEMENT_MESSAGE)
  {
    this.INITIAL_ANNOUNCEMENT_MESSAGE = NEXT_ANNOUNCEMENT_MESSAGE;
  }

  public void receiveMessage(String message)
  {
    System.out.println("Received <<\t" + message + "\t<< end.");
    this.countDownLatch.countDown();
  }

  public String getInitialAnnouncement()
  {
    return this.INITIAL_ANNOUNCEMENT_MESSAGE;
  }

  public CountDownLatch getCountDownLatch()
  {
    return this.countDownLatch;
  }
}
