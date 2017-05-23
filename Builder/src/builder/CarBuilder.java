/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

// The 'ConcreteBuilder2' class
public class CarBuilder extends VehicleBuilder{

    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }   
    
    @Override
    public void BuildFrame() {
        vehicle.setParts("frame", "Car Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setParts("engine", "2500 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setParts("wheels", "4");
    }

    @Override
    public void BuildDoors() {
        vehicle.setParts("doors", "4");
    }    
}
