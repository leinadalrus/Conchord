package dreamhouse.conchord.handlers;

import dreamhouse.conchord.models.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Consumer.class)
public class ConsumerEventHandler
{
  private final SimpMessagingTemplate simpMessenger;
  private final EntityLinks entityLinks;

  @AutoWired
  public ConsumerEventHandler(SimpMessagingTemplate template, EntityLinks entityLinks)
  {
    this.simpMessenger = template;
    this.entityLinks = entityLinks;
  }
}