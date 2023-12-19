package com.Dreamhouse.Sumika.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class UserProfile
{
  private @Id
  @GeneratedValue int id;
  private String username;

  public UserProfile(int id, String username)
  {
  }

  public int GetID()
  {
    return this.id;
  }

  public void SetID(int _id)
  {
    this.id = _id;
  }

  public String GetUsername()
  {
    return this.username;
  }

  public void SetUsername(String _username)
  {
    this.username = _username;
  }

  @Override
  public boolean equals(Object _object)
  {
    if (this == _object) return true;
    if (_object == null || getClass() != _object.getClass()) return false;

    UserProfile user = (UserProfile) _object;

    return (Objects.equals(this.id, user.id) && Objects.equals(this.username, user.username));
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, username);
  }

  @Override
  public String toString()
  {
    return "UserProfile{" + "id=" + this.id + ", username=\'" + this.username + '\'' + '}';
  }
}
