package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Vehicle interface that extends cloneable
 */
public interface Vehicle extends Cloneable{
  public void move(Direction d);
  public double getVehicleSoundLevel();
  public Vehicle clone();
}
