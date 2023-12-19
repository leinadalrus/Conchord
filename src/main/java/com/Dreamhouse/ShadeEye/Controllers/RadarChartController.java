package com.Dreamhouse.ShadeEye.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadarChartController
{
  @GetMapping("/:poster*/:id")
  public String RadarChart(String _radarChart)
  {
    return _radarChart;
  }
}
