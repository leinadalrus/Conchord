package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController
{
  @RequestMapping(value = "/")
  public String Index()
  {
    return "index";
  }
}
