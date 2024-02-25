package dreamhouse.conchord.controllers;

import dreamhouse.conchord.models.Commander;
import dreamhouse.conchord.stores.CommanderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CommanderController
{
  private final CommanderRepository repository;

  CommanderController(CommanderRepository repository)
  {
    this.repository = repository;
  }
}
