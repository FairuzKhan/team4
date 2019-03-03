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
public class favourites {
    
    String id,add,delete;
    
    public favourites(String add, String delete)
    {
    
        this.add = add;
        this.delete = delete;
        id = createID(add);
    }
    
     public static String createID(String add) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        Date date = new Date();
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
        if (add.length() == 1)
            fChar += "X";
        if (add.length() == 2)
            fChar += add;
        else if (add.equals(""))
            fChar = "XX";
        else
            fChar = add.substring(0, 1);
        
        String lChar = "";
        if (add.length() == 1)
            lChar += "X";
        else if (add.length() == 2) 
            lChar += add;
        else if (add.equals(""))
            lChar = "XX";
        else
            lChar = add.substring(add.length()-1);
        String id = yr+"-"+mnt+"-"+dtInt+"-";
        if (add.equals(""))
            id += "XX";
        else if (add.length() == 2)
            id += add;
        else
            id += fChar.toUpperCase() + lChar.toUpperCase();
        
        return id;
    }
    
    public String getadd(){
    
        return add;
    }
    
    public String getdelete(){
    
        return delete;
    }
    
    public void setAdd(String add1){
    
    String add = add1;
    }
    
    public void setDelete(String delete1){
    
    String delete = delete1;
    }
    
     public void display_favourites()
    {
    
        System.out.println("Id : " + id + " ADD : " + add + " Delete : " + delete);
    }
}
