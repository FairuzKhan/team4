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
        
        City c = new City("Montreal","Canada","Tourist");
        c.display_city();
        System.out.println();
        
        Places p = new Places("45.5017° N","73.5673° W","Mont Royal");
        p.display_places();
        System.out.println();
        
    }
    
}
