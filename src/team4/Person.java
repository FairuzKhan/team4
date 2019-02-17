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
public class Person {
    
    String FirstName,LastName,Email;
    int PhoneNumber;
    
    public Person(String fName,String lName,String email1,int pNumber){
    
        this.FirstName=fName;
        this.LastName=lName;
        this.Email=email1;
        this.PhoneNumber=pNumber;
    
    }
   
    
    public String getFirstName(){
        
        return FirstName;
    }
    
    public String getLastName(){
    
    
        return LastName;
    }
    
    public String getEmail(){
    
    return Email;
    }
    
    public int getPhoneNumber(){
    
    return PhoneNumber;
    }
    
    
    
    public void setFirstName(String fName){
    
    String FirstName=fName;
    }
    
    public void setLastName(String lName){
    
    String LastName=lName;
    }
    
    public void setEmail(String email1){
    
    String Email=email1;
    }
    
    public void setPhoneNumber(int pNumber){
    
    int PhoneNumber=pNumber;
    }
    
    
    public void display_person(){
    
    System.out.println("\n First Name " +FirstName+ "\n Last Name " + LastName + "\n Email id" +Email+ "\n Phone Number " +PhoneNumber);
    }
}
