package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
  @GetMapping("/")
  public String Index(String _index)
  {
    return _index;
  }
}
