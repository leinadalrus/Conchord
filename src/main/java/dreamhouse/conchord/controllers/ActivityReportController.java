package dreamhouse.conchord.controllers;

import dreamhouse.conchord.models.ActivityReport;
import dreamhouse.conchord.models.Ship;
import dreamhouse.conchord.stores.ActivityReportRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActivityReportController
{
  private final ActivityReportRepository activityReportRepository;

  public ActivityReportController(ActivityReportRepository activityReportRepository)
  {
    this.activityReportRepository = activityReportRepository;
  }

  @GetMapping(name = "/ships")
  public List<Ship> ships(ActivityReport activityReport, Model model)
  {
    model.addAttribute("get", new ArrayList<Ship>());
    return activityReport.getShips();
  }

  @GetMapping(name = "/activityReports/title")
  public String title(ActivityReport activityReport)
  {
    return activityReport.getTitle();
  }

  @GetMapping(name = "/activityReports/description")
  public String description(ActivityReport activityReport)
  {
    return activityReport.getDescription();
  }
}