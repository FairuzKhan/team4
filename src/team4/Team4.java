/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;
import java.util.*;
/**
 *
 * @author 1895324
 */
public class Team4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1=new Person("james", "smith" ,"james95smith@gmail.com",01234567);
        p1.display_Person();
        System.out.println();
        
        Administrator admin=new Administrator("David","D123");
        admin.display_Administrator();
        System.out.println();
        
        User u1=new User(101);
        u1.display_User();
        System.out.println();
        
        
        City c = new City("Montreal","Canada","Tourist");
        c.display_city();
        System.out.println();
        
        Places p = new Places("45.5017° N","73.5673° W","Mont Royal");
        p.display_places();
         System.out.println();
        
        category cat = new category("Tourists","J123","Montréal is the largest city in Canada's Québec province. \n It’s set on an island in the Saint Lawrence River and named after Mt. \n Royal, the triple-peaked hill at its heart.\n Its boroughs, many of which were once independent cities, include neighbourhoods ranging from cobblestoned, French colonial Vieux-Montréal – with the Gothic Revival Notre-Dame Basilica at its centre – to bohemian Plateau.");
        cat.display_categories();
        System.out.println();
        
        Date d2 = new Date(2019-2-17);
        details det = new details(d2);
        det.displays_details();
        System.out.println();
        
        
    }
    
}
