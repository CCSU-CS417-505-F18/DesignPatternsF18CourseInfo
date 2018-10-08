package edu.ccsu.cs417.vehiclePrototypeFactory;

/**
 * Concrete transmission class
 */
public class ToyotaTransmission implements Transmission{
  public ToyotaTransmission clone(){
    return new ToyotaTransmission();
  }
}
