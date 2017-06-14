/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Lucas Hort
 */
public class AsteroidVisitor implements Visitor {

    @Override
    public void visit(SpaceShip sp) {
        System.out.println("BOOM! Asteroid hit a " + sp.getSpaceShip());
    }

    @Override
    public void visit(GiantSpaceShip gsp) {
        System.out.println("PLIM! Asteroid hit a " + gsp.getGiantSpaceShip());
    }

}
