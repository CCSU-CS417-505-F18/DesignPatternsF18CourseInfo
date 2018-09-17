package edu.ccsu.cs417.vehicleFactoryMethod;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Vehicle movement strategy
 */
public interface MovementStrategy {
  public void move(Direction d);
}
