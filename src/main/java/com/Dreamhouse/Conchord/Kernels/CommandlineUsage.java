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
                         "--spring.profiles.active=rpc,server \\" +
                         "--conchord.client.duration=60000");

      System.out.println("java -jar target/Conchord.jar \\" +
                         "--spring.profiles.active=rpc,client \\");
    };
  }

  @Profile("!usage_message")
  @Bean
  public CommandLineRunner conchord()
  {
    return new NervesConcordRunner();
  }
}
