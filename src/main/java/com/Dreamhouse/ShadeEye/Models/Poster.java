package com.Dreamhouse.ShadeEye.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poster
{
  private @Id @GeneratedValue(strategy= GenerationType.AUTO) Long id;
  private String title;
  private String description;
  private String author;
  private String dateCreated;

  private Poster() {}

  public Poster(String _title, String _description, String _author, String _dateCreated)
  {
    this.title = _title;
    this.description = _description;
    this.author = _author;
    this.dateCreated = _dateCreated;
  }
}
