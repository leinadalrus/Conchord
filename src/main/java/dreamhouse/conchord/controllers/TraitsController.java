package dreamhouse.conchord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dreamhouse.conchord.models.Traits;
import dreamhouse.conchord.stores.TraitsRepository;

@Controller
public class TraitsController
{
  private final TraitsRepository repository;

  public TraitsController(TraitsRepository repository)
  {
    this.repository = repository;
  }

  @GetMapping("/trait")
  public String getTraitWith(Model model)
  {
    model.addAttribute("get", new Traits());
    return "trait";
  }

  @PostMapping("/trait/add")
  public String addTraitWith(
    @ModelAttribute
    Traits trait, Model model
  )
  {
    model.addAttribute("create", trait);
    return "trait";
  }
}
