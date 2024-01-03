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
      System.out.println(
        "This app uses Spring Profiles to control its behavior.\n");
      System.out.println(
        "Sample usage: java -jar rabbit - tutorials.jar --spring.profiles.active = hello - world, sender");
    };
  }

  @Profile("!usage_message")
  @Bean
  public CommandLineRunner concord()
  {
    return new NervesConcordRunner();
  }
}
