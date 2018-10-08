package edu.ccsu.designpatterns.vehicleAbstractFactory;

/**
 * Concrete vehicle class
 */
public class Car extends VehicleBase{
  public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public int getSeats() {
		return seats;
	}

	public int getDoors() {
		return doors;
	}

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
}
