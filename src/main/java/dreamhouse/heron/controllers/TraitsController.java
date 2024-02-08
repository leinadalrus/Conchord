package dreamhouse.heron.controllers;

import dreamhouse.heron.stores.TraitsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dreamhouse.heron.models.Character;

@Controller
public class TraitsController
{
  private final TraitsRepository repository;

  public TraitsController(TraitsRepository repository)
  {
    this.repository = repository;
  }

  @GetMapping("/character/create")
  public String newCharacterSheetWith(Model model)
  {
    model.addAttribute("create", new Character());
    return "create";
  }

  @PostMapping("/character/create")
  public String submitCharactSheetCalled(
    @ModelAttribute
    Character character, Model model
  )
  {
    model.addAttribute("create", character);
    return "result";
  }
}
