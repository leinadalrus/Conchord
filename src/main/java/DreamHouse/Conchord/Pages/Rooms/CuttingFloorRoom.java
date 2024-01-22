package DreamHouse.Conchord.Pages.Rooms;

import DreamHouse.Conchord.Handlers.RoomChannelSender;
import DreamHouse.Conchord.Handlers.RoomChannelReceiver;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"conchord", "topics"})
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
    Binding bindTopic(
        TopicExchange topicExchange, Queue autoDeleteQueue, String routingKey
    )
    {
      return BindingBuilder.bind(autoDeleteQueue)
                           .to(topicExchange)
                           .with(routingKey);
    }

    @Bean
    Binding bindTopics(
        TopicExchange topicsExchange, Queue autoDeleteQueue, String routingKey
    )
    {
      return BindingBuilder.bind(autoDeleteQueue)
                           .to(topicsExchange)
                           .with(routingKey);
    }

    @Profile("receiver")
    @Bean
    public RoomChannelReceiver receiver()
    {
      return new RoomChannelReceiver();
    }
  }

  @Profile("sender")
  @Bean
  public RoomChannelSender sender()
  {
    return new RoomChannelSender();
  }

  @Bean
  public TopicExchange topicExchange()
  {
    return new TopicExchange("conchord.topic");
  }

  @Bean
  public Queue ping()
  {
    return new Queue("ping");
  }
}
