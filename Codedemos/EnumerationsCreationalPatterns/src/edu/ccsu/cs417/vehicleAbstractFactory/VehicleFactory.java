package edu.ccsu.cs417.vehicleAbstractFactory;

/**
 * Abstract factory for creating vehicles
 */
public interface VehicleFactory {
  public Vehicle makeVehicle(String parameters);
}
