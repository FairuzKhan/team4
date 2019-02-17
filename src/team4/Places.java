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
public class Places {
    
    String location_latitude,location_longitude,name;
    
    public Places(String l_latitude,String l_longitude,String name1)
    {
    
       this.location_latitude = l_latitude;
       this.location_longitude = l_longitude;
       this.name = name1;
    
    }
    
    public String getlatitude()
    {
    
        return location_latitude;
        
    }
    
    public String getlongitude()
    {
    
        return location_longitude;
        
    }
    
    public String getname()
    {
    
        return name;
        
    }
    
    public void setlatitude(String l_latitude)
    {
    
        String location_latitude = l_latitude;
        
    }
    
    public void setlongitude(String l_longitude)
    {
    
        String location_longitude = l_longitude;
        
    }
    
    public void setname(String name1)
    {
    
        String name = name1;
        
    }
    
    public void display_places()
    {
    
        System.out.println("\n Location Latitude : " + location_latitude + "\n Location Longitude : " + location_longitude + "\n Place Name : " + name );
    }
    
}
