/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Lucas Hort
 */
public class Main {

    // MainApp startup class for Real-World 
    // Builder Design Pattern.
    public static void main(String[] args) {
        VehicleBuilder builder;
        
        // Create shop with vehicle builders
        Shop shop = new Shop();
        
        // Construct and display vehicles
        builder = new ScooterBuilder();
        shop.Construct(builder);
        builder.vehicle.Show();
        
        builder = new CarBuilder();
        shop.Construct(builder);
        builder.vehicle.Show();
        
        builder = new MotorCycleBuilder();
        shop.Construct(builder);
        builder.vehicle.Show();
    }
    
}
