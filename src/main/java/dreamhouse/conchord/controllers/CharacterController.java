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

  @GetMapping("/character")
  public String getCharacterSheetWith(Model model)
  {
    model.addAttribute("get", new Character());
    return "character";
  }

  @PostMapping("/character/create")
  public String createCharacterSheetAs(
    @ModelAttribute
    Character character, Model model
  )
  {
    model.addAttribute("create", character);
    return "character";
  }
}
