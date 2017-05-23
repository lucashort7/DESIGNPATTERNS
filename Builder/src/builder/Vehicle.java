/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

// The 'Product' class
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;

public class Vehicle {

    private String vehicleType;
    private HashMap<String, String> parts = new HashMap<String, String>();

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParts(String key) {
        return parts.get(key);
    }
    
    public void setParts(String key, String value){
        parts.put(key, value);
    }
    
    public void Show(){
        System.out.println("\n---------------------------");
        System.out.println("Vehicle Type: "+ vehicleType);
        System.out.println(" Frame: "+ parts.get("frame"));
        System.out.println(" Engine: "+ parts.get("engine"));
        System.out.println(" #Wheels: "+ parts.get("wheels"));
        System.out.println(" #Doors: "+ parts.get("doors"));
    }

}
