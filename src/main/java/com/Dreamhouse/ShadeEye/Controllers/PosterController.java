package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosterController
{
  @GetMapping("/:poster*/:id")
  public String Poster(String _poster)
  {
    return _poster;
  }
}
