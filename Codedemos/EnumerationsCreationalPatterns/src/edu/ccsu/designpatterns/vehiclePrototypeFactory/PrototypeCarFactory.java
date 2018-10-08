package edu.ccsu.designpatterns.vehiclePrototypeFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This prototype factory is implemented such that rather than having a single
 * object of each type it saves a library of the different types of prototypes
 * therefore it is a singleton so only one library of prototypes exists.
 */
public class PrototypeCarFactory implements CarFactory {

    private Map<String, Engine> engineLibrary;
    private Map<String, Transmission> transmissionLibrary;
    private Map<String, Car> carLibrary;
    /**
     * Singleton instance
     */
    private static PrototypeCarFactory instance;

    private PrototypeCarFactory() {
	engineLibrary = new HashMap<String, Engine>();
	transmissionLibrary = new HashMap<String, Transmission>();
	carLibrary = new HashMap<String, Car>();
    }

    public static CarFactory getInstance() {
	if (instance == null) {
	    instance = new PrototypeCarFactory();
	}
	return instance;
    }

    /**
     * Simply return null if no id with that name found
     */
    @Override
    public Engine makeEngine(String engineName) {
	Engine prototypeEngine = engineLibrary.get(engineName);
	return (Engine)prototypeEngine.clone();
    }

    /**
     * Simply return null if no id with that name found
     */
    @Override
    public Transmission makeTransmission(String transmissionName) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Simply return null if no id with that name found
     */
    @Override
    public Car makeCar(String vehicleParams) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Catalog the passed engine by the passed name
     */
    @Override
    public void catalogEngine(String name, Engine engineName) {
	engineLibrary.put(name, engineName);
    }

    /**
     * Catalog the passed transmission by the passed name
     */
    @Override
    public void catalogTransmission(String name, Transmission transmission) {
	transmissionLibrary.put(name, transmission);  
    }

    /**
     * Catalog the passed car by the passed name
     */
    @Override
    public void catalogCar(String name, Car car){
	carLibrary.put(name, car);
    }
}
