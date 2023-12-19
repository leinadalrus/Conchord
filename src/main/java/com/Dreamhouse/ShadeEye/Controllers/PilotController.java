package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PilotController
{
  @GetMapping("/:user*/:pilot*/:id")
  public String Pilot(String _pilot)
  {
    return _pilot;
  }
}
