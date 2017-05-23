/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

// A 'ConcreteCreator' class
public class Report extends Document{

    @Override
    public void CreatePages() {
        this.pages.add(new IntroductionPage());
        this.pages.add(new ResultsPage());
        this.pages.add(new ConclusionPage());
        this.pages.add(new SummaryPage());
        this.pages.add(new BibliographyPage());
    }
    
}
