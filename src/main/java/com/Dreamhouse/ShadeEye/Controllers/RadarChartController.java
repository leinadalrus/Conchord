package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Models.RadarChart;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RadarChartController
{
  @GetMapping("/radar-chart/{id}")
  public String Flair(@RequestParam("id") String id)
  {
    return id;
  }

  @PostMapping("/radar-chart/{ids}")
  public ResponseEntity<RadarChart> updateRadarCharts(@PathVariable List<String> ids)
  {
    RadarChart radarChart = new RadarChart();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(radarChart, headers, HttpStatus.OK);
  }

  @PutMapping("/radar-chart/{id}")
  public ResponseEntity<RadarChart> createRadarChart(@PathVariable String id)
  {
    RadarChart radarChart = new RadarChart();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(radarChart, headers, HttpStatus.OK);
  }

  @DeleteMapping("/radar-chart/{id}")
  public ResponseEntity<String> destroyRadarChart(@PathVariable String id)
  {
    return ResponseEntity.noContent().build();
  }
}
