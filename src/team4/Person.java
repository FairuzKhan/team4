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
    
    String firstName,lastName,email;
    int phoneNumber;
    
    public Person(String fName,String lName,String email1,int pNumber){
    
        this.firstName=fName;
        this.lastName=lName;
        this.email=email1;
        this.phoneNumber=pNumber;
    
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
    
    System.out.println("\n First Name : " +firstName+ "\n Last Name : " + lastName + "\n Email id : " +email+ "\n Phone Number : " +phoneNumber);
    }
}
