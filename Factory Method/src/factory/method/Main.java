/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

/**
 *
 * @author Lucas Hort
 */
public class Main {

    // MainApp startup class for Real-World 
    // Factory Method Design Pattern.
    public static void main(String[] args) {
        
        Document[] documents = new Document[2];
        
        documents[0] = new Resume();
        documents[1] = new Report();        
        
        for ( Document document: documents){
            System.out.println("\n" + document.getClass().getName() + "--");
            for (Page page: document.pages){
                System.out.println(" " + page.getClass().getName());
            }
        }
        
    }
    
}
