package edu.ccsu.designpatterns.vehiclePrototypeFactory;



/**
 * Concrete vehicle class
 */
public class Car extends VehicleBase{
  private Engine engine;
  private Transmission transmission;
  private int seats;
  private int doors;
  public Car(Engine engine, Transmission transmission, int seats, int doors){
    super(new EnginePowered());
    this.engine = engine;
    this.transmission = transmission;
    this.seats = seats;
    this.doors = doors;
  }

  @Override
  public double getVehicleSoundLevel() {
    return engine.getEngineSound();
  }

  public int getNumberDoors(){
    return doors;
  }

  public Car clone(){
    return new Car(engine.clone(),transmission.clone(),seats,doors);
  }
}
