package com.Dreamhouse.ShadeEye.Exceptions;

public class FlairNotFoundException extends RuntimeException
{
  FlairNotFoundException(Long id)
  {
    super("Could not find given ID for the flair:\t" + id);
  }
}