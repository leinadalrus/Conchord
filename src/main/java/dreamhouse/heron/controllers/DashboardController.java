package dreamhouse.heron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class DashboardController
{
  @RequestMapping(value = "{page}")
  public String dashboard(@PathVariable String page)
  {
    return page;
  }
}
