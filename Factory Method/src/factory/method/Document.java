/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

import java.util.ArrayList;
import java.util.List;


// The 'Creator' abstract class
public abstract class Document {
    protected List<Page> pages = new ArrayList<Page>();

    public Document() {
        this.CreatePages();
    }

    public List<Page> getPages() {
        return pages;
    }
    
    public abstract void CreatePages();
       
}
