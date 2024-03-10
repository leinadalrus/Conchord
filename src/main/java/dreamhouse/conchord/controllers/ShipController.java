package dreamhouse.conchord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import dreamhouse.conchord.models.Ship;

public class ShipController
{
  private final Ship ship;

  public ShipController(Ship ship)
  {
    this.ship = ship;
  }

  @GetMapping("/ship")
  public String getShipWith(Model model)
  {
    model.addAttribute("get", new Ship());
    return "ship";
  }

  @PostMapping("/ship/create")
  public String createShipWith(
    @ModelAttribute
    Ship ship, Model model
  )
  {
    model.addAttribute("create", character);
    return "ship";
  }
}
