package dreamhouse.conchord.controllers;

import dreamhouse.conchord.models.Character;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CharacterController
{
  private final Character character;

  CharacterController(Character character)
  {
    this.character = character;
  }
}
