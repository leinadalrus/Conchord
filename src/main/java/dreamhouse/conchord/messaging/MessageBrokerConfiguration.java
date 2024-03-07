package dreamhouse.conchord.messaging;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Component
@EnableWebSocketMessageBroker
public class MessageBrokerConfiguration implements WebSocketMessageBrokerConfigurer
{
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry)
  {
    registry.addEndpoint("/api").withSockJS();
  }

  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry)
  {
    registry.enableSimpleBroker("/subject");
    registry.setApplicationDestinationPrefixes("/app");
  }
}