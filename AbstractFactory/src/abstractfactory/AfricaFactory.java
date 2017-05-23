/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Lucas Hort
 */

//The 'ConcreteFactory1' class
public class AfricaFactory extends ContinentFactory{

    @Override
    public Herbivore CreateHerbivore() {
        return new Wildebeest();
    }

    @Override
    public Carnivore CreateCarnivore() {
        return new Lion();
    }
    
}
