/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

// A 'ConcreteCreator' class
public class Resume extends Document{

    @Override
    public void CreatePages() {
        this.pages.add(new SkillsPage());
        this.pages.add(new EducationPage());
        this.pages.add(new ExperiencePage());        
    }
    
}
