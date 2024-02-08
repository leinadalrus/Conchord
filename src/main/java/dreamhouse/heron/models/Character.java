package dreamhouse.heron.models;

public class Character {
  private Long id;
  private String name;
  private Traits traits;

  public Character(String newName, Traits traitInstance)
  {
    this.name = newName;
  }

  public Character() {
  }
  
  public Long getId()
  {
    return this.id;
  }

  public String getName()
  {
    return this.name;
  }
  
  public Traits getTraits()
  {
    return this.traits;
  }
}
