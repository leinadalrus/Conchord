package com.Dreamhouse.Sumika.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PilotController
{
  @GetMapping("/:user*/:pilot*")
  public String Pilot(String _pilot)
  {
    return _pilot;
  }
}
