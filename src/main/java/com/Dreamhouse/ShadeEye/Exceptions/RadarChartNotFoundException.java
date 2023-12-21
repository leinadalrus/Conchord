package com.Dreamhouse.ShadeEye.Exceptions;

public class RadarChartNotFoundException extends RuntimeException
{
  RadarChartNotFoundException(Long id)
  {
    super("Could not find given ID for the radar-chart:\t" + id);
  }
}
