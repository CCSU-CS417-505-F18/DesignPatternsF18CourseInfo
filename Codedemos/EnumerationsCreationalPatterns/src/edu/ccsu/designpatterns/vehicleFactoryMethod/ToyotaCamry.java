package edu.ccsu.cs417.vehicleFactoryMethod;

/**
 * Specific car information
 */
public class ToyotaCamry extends Car{

  public ToyotaCamry(BaseEngine engine,Transmission transmission) {
    // 4 seats, 4 doors
    super(engine,transmission, 4, 4);
  }
}
