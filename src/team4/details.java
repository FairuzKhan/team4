/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;
import java .util.*;
/**
 *
 * @author temp
 */
public class details 
{
    Date  dateAdd;
    
    public details(Date k_DateAdd)
    {
        this.dateAdd = k_DateAdd;
        
    }

    public Date getdateadd()
    {
        
        return dateAdd;
        
    }
    
    public void setdateadd(Date k_DateAdd)
    {
    
       Date dateAdd = k_DateAdd;

    }
    public void displays_details()
    {
        System.out.println(" \n DateAdd : " + dateAdd);
    }
}