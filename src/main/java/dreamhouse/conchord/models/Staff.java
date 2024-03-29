package dreamhouse.conchord.models;

import java.util.ArrayList;

public class Staff
{
  private final ArrayList<Character> characters;
  private final Ship ship;

  public Staff(ArrayList<Character> characters, Ship ship)
  {
    this.characters = characters;
    this.ship = ship;
  }

  public ArrayList<Character> getCharacters()
  {
    return this.characters;
  }

  public Ship getShip()
  {
    return this.ship;
  }
}
