package dreamhouse.conchord.models;

public class Character
{
  private Long id;
  private String nickname;
  private Traits traits;

  public Character(String newName, Traits traitInstance)
  {
    this.nickname = newName;
    this.traits = traitInstance;
  }

  public Character()
  {
  }

  public Long getId()
  {
    return this.id;
  }

  public String getName()
  {
    return this.nickname;
  }

  public Traits getTraits()
  {
    return this.traits;
  }
}
