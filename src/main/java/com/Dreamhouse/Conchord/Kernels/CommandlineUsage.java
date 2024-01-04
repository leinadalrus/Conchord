package com.Dreamhouse.Conchord.Kernels;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class CommandlineUsage
{
  @Profile("usage_message")
  @Bean
  public CommandLineRunner usage()
  {
    return args -> {
      System.out.println("java -jar target/Conchord.jar \\" +
                         "--spring.profiles.active=topics,receiver \\" +
                         "--concord.client.duration=60000");
      System.out.println("java -jar target/Conchord.jar \\" +
                         "--spring.profiles.active=topics,sender \\" +
                         "--concord.client.duration=60000");
    };
  }

  @Profile("!usage_message")
  @Bean
  public CommandLineRunner concord()
  {
    return new NervesConcordRunner();
  }
}
