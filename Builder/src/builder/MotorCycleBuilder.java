/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

// The 'ConcreteBuilder1' class
public class MotorCycleBuilder extends VehicleBuilder{

    public MotorCycleBuilder() {
        vehicle = new Vehicle("MotorCycle");    
    }   
    
    @Override
    public void BuildFrame() {
        vehicle.setParts("frame", "MotorCycle Frame");
    }

    @Override
    public void BuildEngine() {
        vehicle.setParts("engine", "500 cc");
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
