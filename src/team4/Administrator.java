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
public class Administrator extends Person {
    
    String userName,password,newId;
    
    
    public Administrator(Date id, String UName,String Pass, Date superId, String fName,String lName,String email1,int pNumber){
        super(superId, fName, lName, email1, pNumber);
        this.userName=UName;
        this.password=Pass;
        newId = createID(id, UName);
    }
    
    public String getuserName(){
    
        return userName;
    }
    
    public String getpassword(){
    
        return password;
    }
    
    public void setuserName(String UName){
    
        String userName=UName;
    }
    
    public void setPassword(String Pass){
    
        String password=Pass;
    }
    
    public void display_Administrator(){
        System.out.println();
        System.out.println("Administrator Details");
        System.out.println("Admin ID: " + newId + "\nPerson ID: " + super.newId + "\n User Name : " +userName+ "\n Password : " +password);
        System.out.println();
        System.out.println("Person (Admin) Details: ");
        super.display_Person();
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
}
