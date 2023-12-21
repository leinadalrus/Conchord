package com.Dreamhouse.ShadeEye.Exceptions;

public class PosterNotFoundException extends RuntimeException
{
  PosterNotFoundException(Long id)
  {
    super("Could not find given ID for the poster:\t" + id);
  }
}
