package dreamhouse.conchord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

import dreamhouse.conchord.models.Staff;

@RestController
public class StaffController
{
  private final Staff staff;

  StaffController(Staff staff)
  {
    this.staff = staff;
  }

  @GetMapping("/staff")
  public String getStaffWith(Model model)
  {
    model.addAttribute("get", new Staff());
    return "staff";
  }

  @PostMapping("/staff/add")
  public String addStaffAs(
    @ModelAttribute
    Staff staff, Model model
  )
  {
    model.addAttribute("create", staff);
    return "staff";
  }
}

