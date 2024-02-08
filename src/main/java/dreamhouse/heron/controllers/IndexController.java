package dreamhouse.heron.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class IndexController
{
  @GetMapping(value = "/")
  public String index(@RequestParam(value = "name") String filename)
  {
    return filename;
  }
}
