package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalancedFrameController
{
  @GetMapping("/:user*/:pilot*/:balanced-frame*/:id")
  public String BalancedFrame(String _balancedFrame)
  {
    return _balancedFrame;
  }
}
