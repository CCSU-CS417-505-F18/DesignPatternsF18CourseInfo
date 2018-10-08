package edu.ccsu.cs417.vehicleAbstractFactory;

/**
 * Specific car information
 */
public class ToyotaCamry extends Car{

  public ToyotaCamry(Engine engine,Transmission transmission) {
    // 4 seats, 4 doors
    super(engine,transmission, 4, 4);
  }
}
