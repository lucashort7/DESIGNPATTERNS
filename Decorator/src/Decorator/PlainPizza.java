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
public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Adding Thin dough");
    }

    @Override
    public String getDescription() {

        return "Thin dough";

    }

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);

        return 4.00;
    }

}
