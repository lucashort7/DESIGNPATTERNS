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


// The 'Client' class 
public class AnimalWorld {
    private Herbivore herbivore;
    private Carnivore carnivore;

    public AnimalWorld(ContinentFactory factory) {
        this.carnivore = factory.CreateCarnivore();
        this.herbivore = factory.CreateHerbivore();
    }
    
    public void RunFoodChain(){
        this.carnivore.Eat(this.herbivore);
    }
    
    
}
