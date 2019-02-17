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
public void setid(String p_id)
{
    String id = p_id;
    
}
public void setdescription(String p_description)
{
    String name = p_description;
    
}
public void display_categories()
{
    System.out.println("\n name : " + name + "\n  id " + id + " \n description " + description);
}
}
