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
public class category
{
    String name;
    String id;
    String description;
    
    public category(String p_name,String p_id,String p_description )
    {

        this.name=p_name;
        this.id = p_id;
        this.description=p_description;
        id = createID(name);

    }
    
    public static String createID(String name) {
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
    
    
    public String getName()
    {
        return name;
    }
public String getid()
    {
        return id;
    }
public String getdescription()
    {
        return description;
    }
public void setName(String p_name)
{
    String name = p_name;
    
}
public void setid(String id)
{
    this.id = id;
    
}
public void setdescription(String p_description)
{
    String name = p_description;
    
}
public void display_categories()
{
    System.out.println("\n Name : " + name + "\n  Id : " + id + " \n Description : " + description);
}
}
