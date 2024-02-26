package dreamhouse.conchord.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class IndexController
{
  @GetMapping(value = "/")
  public String index()
  {
    String index = "index";
    return index;
  }
}
