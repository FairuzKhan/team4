/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;
import java.text.SimpleDateFormat;
import java .util.*;
/**
 *
 * @author temp
 */
public class details 
{
    String id;
    Date  dateAdd;
    
    public details(Date k_DateAdd)
    {
        this.dateAdd = k_DateAdd;
        id = createID("");
        
    }
     public static String createID(String name) {
         name="details";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        Date newDate = new Date();
        String date = sdf.format(newDate);
        String[] dt = date.split("-");
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
        System.out.println("Id : " + id + " DateAdd : " + dateAdd);
    }
}