/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import team4.details;

/**
 *
 * @author temp
 */
public class Testdetails {
    
    public Testdetails() {
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
    public void testCraetedId()
    {
        System.out.println("Test 2 for details method");
        String name="Tourists";
        Date date = new Date();
        String expectedResult = "19-Mar-O-DS";
       String realResult = details.createID(name);
         assertEquals(expectedResult ,realResult);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
