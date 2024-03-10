package dreamhouse.conchord.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import dreamhouse.conchord.models.Commander;
import dreamhouse.conchord.stores.CommanderRepository;

@RestController
public class CommanderController
{
  private final CommanderRepository repository;

  CommanderController(CommanderRepository repository)
  {
    this.repository = repository;
  }

  @GetMapping("/commander")
  public String getCommanderAs(Model model)
  {
    model.addAttribute("get", new Commander());
    return "commander";
  }

  @PostMapping("/character/create")
  public String createCommanderWith(
    @ModelAttribute
    Commander commander, Model model
  )
  {
    model.addAttribute("post", commander);
    return "commander";
  }
}
