/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.Clock;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import team4.Administrator;

/**
 *
 * @author 1895321
 */
public class testAdministrator {
    
    public testAdministrator() {
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
    public void testCreatedId(){
        
        
       System.out.println("Test 1 for createId() method");
       
       String name="Asma Rokadiya";
       Date date = new Date();
       String expectedResult="19-Mar-O-AA";
       String realResult=Administrator.createID(new Date(), name);
       
          assertEquals(expectedResult, realResult);
}
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
