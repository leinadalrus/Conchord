package DreamHouse.Conchord.Clients;

import DreamHouse.Conchord.Pages.Rooms.CuttingFloorRoom;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"client", "rpc"})
@Configuration
public class ClientConfigRPC
{
  @Bean
  public CuttingFloorRoom cuttingFloorRoom()
  {
    return new CuttingFloorRoom();
  }
  // TODO: Change this to a proper Client class-declaration ...

  @Bean
  public TopicExchange topicExchange(String routingKey)
  {
    return new TopicExchange(routingKey);
  }
}
