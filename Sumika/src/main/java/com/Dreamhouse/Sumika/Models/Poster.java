package com.Dreamhouse.Sumika.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Poster
{
  private @Id
  @GeneratedValue int id;
  private String titleName;
  private String description;
  private String author;
  private String dateCreated;

  public Poster()
  {
  }

  public int GetID()
  {
    return this.id;
  }

  public String GetTitleName()
  {
    return this.titleName;
  }

  public void SetTitleName(String _titleName)
  {
    this.titleName = _titleName;
  }

  public String GetDescription()
  {
    return this.description;
  }

  public void SetDescription(String _description)
  {
    this.description = _description;
  }

  public String GetDateCreated()
  {
    return this.dateCreated;
  }

  public String GetAuthor()
  {
    return this.author;
  }
}
