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
public class City {
 
    String name,country,type;
    
    public City(String c_name,String c_country,String c_type)
    {
    
        this.name = c_name;
        this.country = c_country;
        this.type = c_type;
        
    }
    
    public String getname()
    {
    
        return name;
        
    }
    
    public String getcountry()
    {
    
        return country;
        
    }
    
    public String gettype()
    {
    
        return type;
        
    }
    
    public void setname(String c_name)
    {
    
        String name = c_name;
        
    }
    
    public void setcountry(String c_country)
    {
    
        String country = c_country;
        
    }
    
    public void settype(String c_type)
    {
    
        String type = c_type;
        
    }
    
     public void display_city()
    {
    
        System.out.println("\n Name : " + name + "\n Country : " + country + "\n Place Type : " + type );
    }
}
