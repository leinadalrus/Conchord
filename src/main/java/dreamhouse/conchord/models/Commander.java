package dreamhouse.conchord.models;

public class Commander extends Character
{
  String faction;
  String company;
  String title;
  String lastName;
  String firstName;

  public Commander(
    String faction,
    String company,
    String title,
    String lastName,
    String firstName
  )
  {
    this.faction = faction;
    this.company = company;
    this.title = title;
    this.lastName = lastName;
    this.firstName = firstName;
  }
  
  public Commander() {}
}
