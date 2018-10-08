package edu.ccsu.cs417.vehicleAbstractFactory;

/**
 * Concrete factory
 */
public class FordExcursion extends Car{
    public FordExcursion(Engine engine, Transmission transmission){
    // 4 seats, 2 doors
    super(engine,transmission,6,4);
  }
}
