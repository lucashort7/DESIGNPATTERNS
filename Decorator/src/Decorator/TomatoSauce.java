/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Lucas Hort
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription() {

        return tempPizza.getDescription() + ", tomato sauce";

    }

    public double getCost() {

        System.out.println("Cost of Sauce: " + .35);

        return tempPizza.getCost() + .35;

    }

}
