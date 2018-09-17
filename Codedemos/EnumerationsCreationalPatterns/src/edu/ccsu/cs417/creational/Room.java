package edu.ccsu.cs417.creational;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Room class
 */
public interface Room extends MapSite{
  public int getRoomNumber();
  public MapSite getSide(Direction direction);
  public void setSide(Direction direction, MapSite side);
}
