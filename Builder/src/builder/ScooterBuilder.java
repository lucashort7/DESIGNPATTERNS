/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

// The 'ConcreteBuilder3' class
public class ScooterBuilder extends VehicleBuilder{

    public ScooterBuilder() {
       vehicle = new Vehicle("Scooter"); 
    }

    @Override
    public void BuildFrame() {
        vehicle.setParts("frame", "Scooter Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setParts("engine", "50 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setParts("wheels", "2");
    }

    @Override
    public void BuildDoors() {
        vehicle.setParts("doors", "0");
    }
    
    
}
