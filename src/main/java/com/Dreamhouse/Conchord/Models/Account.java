package com.Dreamhouse.Conchord.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account
{
  private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
  private final String username, password;

  public Account(String username, String password)
  {
    this.username = username;
    this.password = password;
  }

  public String getUsername()
  {
    return this.username;
  }

  public String getPassword()
  {
    return this.password;
  }
}
