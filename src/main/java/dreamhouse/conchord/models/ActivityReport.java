package dreamhouse.conchord.models;

import java.util.ArrayList;
import java.util.List;

public class ActivityReport
{
  private String title;
  private String description;
  private List<Ship> ships;

  public ActivityReport() {}

  public ActivityReport(String title, String description, List<Ship> ships)
  {
    this.title = title;
    this.description = description;
    this.ships = ships;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getDescription()
  {
    return this.description;
  }

  public List<Ship> getShips()
  {
    return this.ships;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setShips(ArrayList<Ship> ships)
  {
    this.ships = ships;
  }
}
