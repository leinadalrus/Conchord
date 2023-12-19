package com.Dreamhouse.Sumika.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
  @GetMapping("/user")
  public String User(String _user)
  {
    return _user;
  }
}
