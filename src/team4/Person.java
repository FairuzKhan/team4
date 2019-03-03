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
public class Person {
    
    String firstName,lastName,email, newId;
    int phoneNumber;
    
    public Person(Date id, String fName,String lName,String email1,int pNumber){
        this.firstName=fName;
        this.lastName=lName;
        this.email=email1;
        this.phoneNumber=pNumber;
        newId = createID(id, fName);
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
    
    public String getFirstName(){
        
        return firstName;
    }
    
    public String getLastName(){
    
    
        return lastName;
    }
    
    public String getEmail(){
    
    return email;
    }
    
    public int getPhoneNumber(){
    
    return phoneNumber;
    }
    
    
    
    public void setfirstName(String fName){
    
    String firstName=fName;
    }
    
    public void setlastName(String lName){
    
    String lastName=lName;
    }
    
    public void setemail(String email1){
    
    String email=email1;
    }
    
    public void setphoneNumber(int pNumber){
    
    int phoneNumber=pNumber;
    }
    
    
    public void display_Person(){
        System.out.println("ID: " + newId + "\n First Name : " +firstName+ "\n Last Name : " + lastName + "\n Email id : " +email+ "\n Phone Number : " +phoneNumber);
    }
}
