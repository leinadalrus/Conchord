package com.Dreamhouse.ShadeEye.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Flair
{
  private @Id
  @GeneratedValue(strategy = GenerationType.AUTO) Long id;
  public String mediaImageURI;

  public Flair(String _mediaImageURI)
  {
    this.mediaImageURI = _mediaImageURI;
  }
}
