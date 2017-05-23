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

//The 'AbstractFactory' abstract class
public abstract class ContinentFactory {
    public abstract Herbivore CreateHerbivore();
    public abstract Carnivore CreateCarnivore();
}
