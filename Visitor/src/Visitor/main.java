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
public class main {

    public static void main(String[] args) {
        AsteroidVisitor ast = new AsteroidVisitor();
        ExplodingAsteroidVisitor ast1 = new ExplodingAsteroidVisitor();

        SpaceShip sp = new SpaceShip();
        SpaceShip sp1 = new GiantSpaceShip();

        sp.accept(ast);
        sp1.accept(ast);
        sp.accept(ast1);
        sp1.accept(ast1);
    }
}
