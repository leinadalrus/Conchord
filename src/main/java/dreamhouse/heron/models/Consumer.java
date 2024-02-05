package dreamhouse.heron.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Consumer
{
  private @Id Long id;
  private String username;

  Consumer() {}

  Consumer(String username)
  {
    this.username = username;
  }

  public Long getId()
  {
    return this.id;
  }

  public String getUsername()
  {
    return this.username;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(this.id, this.username);
  }
}
