package com.Dreamhouse.ShadeEye.Advisors;

import com.Dreamhouse.ShadeEye.Exceptions.PosterNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PosterNotFoundAdvice
{
  @ResponseBody
  @ExceptionHandler(PosterNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String posterNotFoundHandler(PosterNotFoundException ex)
  {
    return ex.getMessage();
  }
}
