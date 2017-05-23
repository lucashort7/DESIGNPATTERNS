package abstractfactory;

/**
 *
 * @author Lucas Hort
 */
public class MainApp {
    
    // MainApp startup class for Real-World
    // Abstract Factory Design Pattern.
    public static void main(String[] args) {
        
        // Create and run the African animal world
        System.out.println("*--------- AFRICA --------*");
        ContinentFactory africa = new AfricaFactory();
        AnimalWorld world = new AnimalWorld(africa);
        world.RunFoodChain();
        
        System.out.println("\n*--------- AMERICA --------*");
        // Create and run the American animal world
        ContinentFactory america = new AmericaFactory();
        world = new AnimalWorld(america);
        world.RunFoodChain();
        
    }
    
}
