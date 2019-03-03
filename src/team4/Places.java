 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author 1895324
 */
public class Places {
    
    String location_latitude,location_longitude,name, newId;
    
    public Places(Date id, String l_latitude,String l_longitude,String name1)
    {
        this.location_latitude = l_latitude;
        this.location_longitude = l_longitude;
        this.name = name1;    
        newId = createID(id, name);
    }
    
    public static String createID(Date date, String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        String dt1 = sdf.format(date);
        String[] dt = dt1.split("-");
        String dtInt;
        if (Integer.parseInt(dt[2]) % 2 == 0)
            dtInt = "E";
        else
            dtInt = "O";
        String mnt = dt[1];
        String yr = dt[0].substring(2);
        String fChar = "";
        if (name.length() == 1)
            fChar += "X";
        if (name.length() == 2)
            fChar += name;
        else if (name.equals(""))
            fChar = "XX";
        else
            fChar = name.substring(0, 1);
        
        String lChar = "";
        if (name.length() == 1)
            lChar += "X";
        else if (name.length() == 2) 
            lChar += name;
        else if (name.equals(""))
            lChar = "XX";
        else
            lChar = name.substring(name.length()-1);
        String id = yr+"-"+mnt+"-"+dtInt+"-";
        if (name.equals(""))
            id += "XX";
        else if (name.length() == 2)
            id += name;
        else
            id += fChar.toUpperCase() + lChar.toUpperCase();
        
        return id;
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
