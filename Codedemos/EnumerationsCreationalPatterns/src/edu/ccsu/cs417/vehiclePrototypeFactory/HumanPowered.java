package edu.ccsu.cs417.vehiclePrototypeFactory;

import edu.ccsu.cs417.enumeration.Direction;

/**
 * Movement powered by human
 */
public class HumanPowered implements MovementStrategy{

  @Override
  public void move(Direction d) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  public HumanPowered clone(){
    return new HumanPowered();
  }
}
