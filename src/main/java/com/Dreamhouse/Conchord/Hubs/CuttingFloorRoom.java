package com.Dreamhouse.Conchord.Hubs;

import com.Dreamhouse.Conchord.Handlers.HubChannelSender;
import com.Dreamhouse.Conchord.Handlers.HubChannelReceiver;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.core.parameters.P;

@Profile({"cutting-floor", "hello-world"})
@Configuration
public class CuttingFloorRoom
{
  @Profile("receiver")
  private static class CuttingFloorConfig
  {
    @Bean
    public Queue autoDeleteQueues()
    {
      return new AnonymousQueue();
    }

    @Bean
    Binding bindDirectExchange(
      DirectExchange directExchange, Queue autoDeleteQueue
    )
    {
      return BindingBuilder.bind(autoDeleteQueue).to(directExchange).with(
        "branch");
    }

    @Bean
    public HubChannelReceiver receiver()
    {
      return new HubChannelReceiver();
    }
  }

  @Bean
  public Queue ping()
  {
    return new Queue("Ping");
  }

  @Profile("receiver")
  @Bean
  public HubChannelReceiver receiver()
  {
    return new HubChannelReceiver();
  }

  @Profile("sender")
  @Bean
  public HubChannelSender sender()
  {
    return new HubChannelSender();
  }

  @Bean
  public DirectExchange directExchange()
  {
    return new DirectExchange("concord.direct");
  }
}
