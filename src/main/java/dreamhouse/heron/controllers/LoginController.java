package dreamhouse.heron.controllers;

import dreamhouse.heron.models.Consumer;
import dreamhouse.heron.stores.ConsumerRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LoginController
{
  private final ConsumerRepository repository;

  public LoginController(ConsumerRepository repository)
  {
    this.repository = repository;
  }

  @GetMapping("/login/{user}")
  public String getLogin(
    @PathVariable
    Consumer consumer, User user
  )
  {
    user.getAuthorities();
    for (var permissions : user.getAuthorities())
    {
      return permissions.getAuthority();
    }

    return user.getUsername().equals(consumer.getUsername()) ?
           repository.findByName(consumer.getUsername())
                     .describeConstable()
                     .orElseThrow() :
           user.getUsername();
  }

  @PostMapping("/login/{id}")
  public Optional<Consumer> setExcepted(
    @PathVariable
    Long id
  )
  {
    return repository.findById(id).map(repository::save);
  }
  // NOTE(HTTP): POST methods are 1-to-1, PUT methods are many-to-many
}
