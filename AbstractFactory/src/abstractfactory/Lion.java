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

// The 'ProductB1' class
public class Lion extends Carnivore{

    @Override
    public void Eat(Herbivore h) {
        System.out.println(this.getClass().getName() + " eats "+ h.getClass().getName());
    }
    
}
