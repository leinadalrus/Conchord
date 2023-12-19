package com.Dreamhouse.Sumika.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalancedFrameController
{
  @GetMapping("/:user*/:pilot*/:balanced-frame*")
  public String BalancedFrame(String _balancedFrame)
  {
    return _balancedFrame;
  }
}
