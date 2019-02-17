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
public class User {
    
    int id;
    
    public User(int id1){
    
    this.id=id1;
    }
    
    public int getid(){
    
        return id;
    }
    
    public void setid(int id1){
    
        int id=id1;
    }
    
    public void display_User(){
    
        System.out.println("\n Id : " +id);
    }
}
