package com.Dreamhouse.Conchord.Models;

import org.springframework.data.geo.Box;
import org.springframework.data.geo.Point;

public class Card extends Poster
{
  private Long id;
  private Box dimensions;
  private Point position;
  private Poster poster;

  public Card(Box _dimensions, Point _position)
  {
    super("BalancedFrame", "A pilot's go-to frame.", "John Doe", "2023-12-01");
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
