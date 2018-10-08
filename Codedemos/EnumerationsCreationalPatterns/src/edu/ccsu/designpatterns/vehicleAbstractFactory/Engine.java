package edu.ccsu.designpatterns.vehicleAbstractFactory;

/**
 * Engine for a motorized vehicle
 */
public class Engine {
  private final double horsePower;
  private final double soundMultiplier;
  public Engine(double horsePower,double soundMultiplier){
    this.horsePower = horsePower;
    this.soundMultiplier = soundMultiplier;
  }

  public double getEngineSound(){
    return horsePower * soundMultiplier;
  }
}
