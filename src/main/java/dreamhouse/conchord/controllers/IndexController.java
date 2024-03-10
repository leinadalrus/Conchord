package dreamhouse.conchord.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
  @RequestMapping(value = "/")
  public String index()
  {
    String index = "index";
    return index;
  }
}
