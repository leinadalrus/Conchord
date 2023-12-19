package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Data.Avatar;
import com.Dreamhouse.ShadeEye.Data.Emblem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlairController
{
  private Avatar avatar;
  private Emblem emblem;

  @GetMapping("/api/:user*/:pilot*/:flair*")
  public String Flair(String _flair)
  {
    return _flair;
  }
}
