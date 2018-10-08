package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Base abstract class
 */
public abstract class VehicleBase implements Vehicle{
  private MovementStrategy movementStrategy;

  public VehicleBase(MovementStrategy movementStrategy){
    this.movementStrategy = movementStrategy;
  }

  protected void setMovementStrategy(MovementStrategy movementStrategy){
    this.movementStrategy = movementStrategy;
  }

  protected MovementStrategy getMovementStrategy(){
    return movementStrategy;
  }

  public void move(Direction d){
    movementStrategy.move(d);
  }

  public abstract VehicleBase clone();
}
