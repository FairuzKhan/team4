/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import team4.User;
import team4.favourites;

/**
 *
 * @author 1895324
 */
public class Testfavourites {
    
    public Testfavourites() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCreateId()
    {
    
        System.out.println("Test 1 for CreateId method");
        
        String name = "Add";
        String expectedResult = "19-Mar-O-AD";
        String realResult = favourites.createID(name);
        
        assertEquals(expectedResult, realResult);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
