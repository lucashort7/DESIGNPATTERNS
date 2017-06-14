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
public class ExplodingAsteroidVisitor implements Visitor{
    
    @Override
    public void visit(SpaceShip sp) {
        System.out.println("KABOOM! ExplodingAsteroid hit a " + sp.getSpaceShip());
    }
    @Override
    public void visit(GiantSpaceShip gsp){
    	System.out.println("CRASH! ExplodingAsteroid hit a " + gsp.getGiantSpaceShip());
    }
    
}
