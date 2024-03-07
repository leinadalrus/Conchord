package dreamhouse.conchord.models;

public class Commander extends Character
{
  String company;
  String division
  String title;
  String lastName;
  String firstName;

  public Commander(
    String company,
    String division,
    String title,
    String lastName,
    String firstName
  )
  {
    this.company = company;
    this.division = division;
    this.title = title;
    this.lastName = lastName;
    this.firstName = firstName;
  }
  
  public Commander() {}
}
