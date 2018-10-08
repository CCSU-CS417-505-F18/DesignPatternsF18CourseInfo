package edu.ccsu.cs417.builder.vehicle;

/**
 * Decorator to add turbo charger to an engine
 */
public class Turbo implements Engine{
  private final Engine decoratedEngine;
  public Turbo(Engine engine){
    this.decoratedEngine = engine;
  }

  @Override
  public double getSpeed() {
    return decoratedEngine.getSpeed() * 1.2;
  }

  public String toString(){
    return "Turbo"+decoratedEngine.toString();
  }
}
