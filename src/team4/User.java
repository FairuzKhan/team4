/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895321
 */
public class User extends Person {
    
    String id, newId;
    
    public User(Date id, String id1, Date superId, String fName,String lName,String email1,int pNumber){
        super(superId, fName, lName, email1, pNumber);
        this.id=id1;
        newId = createID(id, id1);
    }
    
    public static String createID(Date newDate, String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
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
    
    public String getid(){
    
        return id;
    }
    
    public void setid(String id){
        this.id=id;
    }
    
    public void display_User(){
        System.out.println();
        System.out.println("User Details");
        System.out.println("ID: " + newId + "\nPerson ID: " + super.newId + "\n User ID : " +id);
        System.out.println("Person (User) Details: ");
        super.display_Person();
    }
}
