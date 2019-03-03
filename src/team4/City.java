/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;

import java.text.SimpleDateFormat;
import java.util.*;
import static team4.User.fname;
/**
 *
 * @author 1895324
 */
public class City {
 
    String name,country,type, id;
    
    public City(Date id, String c_name,String c_country,String c_type)
    {
        this.name = c_name;
        this.country = c_country;
        this.type = c_type;   
        this.id = createID(id, name);
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
    
        System.out.println("ID: " + id + "\n Name : " + name + "\n Country : " + country + "\n Place Type : " + type );
    }
}
