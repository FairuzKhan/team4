/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;

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
        
        
        
    }
    
}
