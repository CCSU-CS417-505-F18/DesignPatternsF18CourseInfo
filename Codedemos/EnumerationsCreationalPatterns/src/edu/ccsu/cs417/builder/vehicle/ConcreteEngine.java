package edu.ccsu.cs417.builder.vehicle;

/**
 * Simple concrete engine
 */
public class ConcreteEngine implements Engine{
  @Override
  public double getSpeed() {
    return 1;
  }

  public String toString(){
    return "Engine";
  }
}
