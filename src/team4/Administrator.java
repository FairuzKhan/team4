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
    
    String userName,password;
    
    
    public Administrator(String UName,String Pass){
    
    this.userName=UName;
    this.password=Pass;
    
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
    
        System.out.println("\n User Name " +userName+ "\n Password" +password);
    }
}
