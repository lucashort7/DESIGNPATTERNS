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
public class GiantSpaceShip extends SpaceShip implements Visited{
    
    public String getGiantSpaceShip(){
		return "GiantSpaceShip";
	}
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
