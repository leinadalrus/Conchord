package DreamHouse.Conchord.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.geo.Box;
import org.springframework.data.geo.Point;

@Entity
public class Card
{
  private @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
  private Box dimensions;
  private Point position;

  public Card(Box _dimensions, Point _position)
  {
    this.dimensions = _dimensions;
    this.position = _position;
  }

  public Long getID() {return this.id;}

  public void setID(Long id) {this.id = id;}

  public Box getDimensions() {return this.dimensions;}

  public void setDimensions(Box dimensions) {this.dimensions = dimensions;}

  public Point getPosition()
  {
    return this.position;
  }

  public void setPosition(Point position)
  {
    this.position = position;
  }
}
