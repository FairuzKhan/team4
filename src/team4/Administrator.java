/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team4;

/**
 *
 * @author 1895321
 */
public class Administrator {
    
    String UserName,Password;
    
    
    public Administrator(String UName,String Pass){
    
    this.UserName=UName;
    this.Password=Pass;
    
    }
    
    public String getUserName(){
    
        return UserName;
    }
    
    public String getPassword(){
    
        return UserName;
    }
    
    public void setUserName(String UName){
    
        String UserName=UName;
    }
    
    public void setPassword(String Pass){
    
        String Password=Pass;
    }
    
    public void display_Administrator(){
    
        System.out.println("\n User Name " +UserName+ "\n Password" +Password);
    }
}
