package com.Dreamhouse.Conchord.Kernels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

public class NervesConcordRunner implements CommandLineRunner
{
  @Value("${conchord.client.duration:0}")
  private int duration;

  @Autowired
  private ConfigurableApplicationContext configurableApplicationContext;

  @Override
  public void run(String... arg0) throws Exception
  {
    System.out.println("Ready ... running for " + duration + "ms");
    Thread.sleep(duration);
    configurableApplicationContext.close();
  }
}
