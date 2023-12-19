package com.Dreamhouse.ShadeEye.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Deckbuilder
{
  private @Id @GeneratedValue Long id;
  private String title;
  private String description;

  private Deckbuilder() {}

  public Deckbuilder(String _title, String _description)
  {
    this.title = _title;
    this.description = _description;
  }
}
