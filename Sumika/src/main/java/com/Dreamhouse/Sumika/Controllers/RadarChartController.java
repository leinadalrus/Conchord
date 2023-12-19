package com.Dreamhouse.Sumika.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadarChartController
{
  @GetMapping("/radar-chart")
  public String Index(String _radarChart)
  {
    return _radarChart;
  }
}
