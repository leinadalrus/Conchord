package com.Dreamhouse.Sumika.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosterController
{
  @GetMapping("/poster")
  public String Index(String _poster)
  {
    return _poster;
  }
}
