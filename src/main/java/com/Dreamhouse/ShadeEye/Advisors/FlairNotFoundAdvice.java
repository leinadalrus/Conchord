package com.Dreamhouse.ShadeEye.Advisors;

import com.Dreamhouse.ShadeEye.Exceptions.FlairNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FlairNotFoundAdvice
{
  @ResponseBody
  @ExceptionHandler(FlairNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String flairNotFoundHandler(FlairNotFoundException ex)
  {
    return ex.getMessage();
  }
}