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
 * @author 1895321
 */
public class User {
    
    String id;
    Date date;
    static String fname,lname;
    
    public User(String id1,String fname,String lname,Date date){
    this.fname = fname;
    this.lname = lname;
    this.date = date;
    this.id=createId(lname);
    }
    
    public static String createId(String id)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR) % 100;
        Date date = new Date();
        String strDateFormat = "MMM";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        sdf = new SimpleDateFormat(strDateFormat);
        String f = sdf.format(date);
        Date d1 = new Date();
        char first = fname.charAt(0);
        char last = lname.charAt(0);
        
        if(first == ' ')
        {
        
            first = 'X';
        }
        if(last == ' ')
        {
        
            last = 'X';
        }
        
        String id1 = year + "-" + d1 + first + last;
        return id1;
        
    }

    User(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getfname(){
    
        return fname;
    }
    
    public String getlname(){
    
        return lname;
    }
    
     public Date getdate(){
    
        return date;
    }
    
    public String getid(){
    
        return id;
    }
    
    public void setid(String id2){
    
        this.id=id2;
    }
    
    public void setfname(String fname1){
    
        String fname = fname1;
    }
    
    public void setlname(String lname1){
    
        String lname = lname1;
    }
    
    public void setdate(String date1){
    
        String date = date1;
    }
    
    public void display_User(){
    
        System.out.println("\n Id : " +id + "Date : " + date + "First Name : " + fname + "Last Name : " + lname);
    }
}
