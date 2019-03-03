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
import team4.City;

/**
 *
 * @author 1895324
 */
public class testCity {
    
    public testCity() {
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
    public void testCreateId() {
        System.out.println("Test 1 for createId() method");
        
        String name = "Fairuz";
        String expectedResult = "19-Mar-O-FZ";
        String realResult = City.createID(new Date(), name);
        
        assertEquals(expectedResult, realResult);
    }
}
