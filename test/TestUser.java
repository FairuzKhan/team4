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

/**
 *
 * @author 1895324
 */
public class TestUser {
    
    public TestUser() {
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
        System.out.println("Test 1 for CreateId method");
        
        String name = "Fairuz";
        String expectedResult = "19-Mar-02-FZ";
        String realResult = User.createId(name);
        
        assertEquals(expectedResult, realResult);
    }
}
