package com.Dreamhouse.ShadeEye.Advisors;

import com.Dreamhouse.ShadeEye.Exceptions.RadarChartNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RadarChartNotFoundAdvice
{
  @ResponseBody
  @ExceptionHandler(RadarChartNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String radarChartNotFoundHandler(RadarChartNotFoundException ex)
  {
    return ex.getMessage();
  }
}
