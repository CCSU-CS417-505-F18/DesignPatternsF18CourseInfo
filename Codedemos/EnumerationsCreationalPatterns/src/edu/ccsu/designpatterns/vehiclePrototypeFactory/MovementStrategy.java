package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Vehicle movement strategy
 */
public interface MovementStrategy extends Cloneable{
  public void move(Direction d);
  public MovementStrategy clone();
}
