/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberappsystem;

/**
 *
 * @author mvini
 */
public class User {
    //user variables
    private String name = "";
    private String email= "";
    private String password= "";
    private String location= "";
    private String phoneNum= "";
    
    
    public User(String email, String pasword){
        //user method to login page
        this.email = email;
        this.password = password;
    
    }
    
    public User(String name,String email,String password,String location, String phoneNum){
        //creating user
      this.name = name;
      this.email = email;
      this.password = password;
      this.location = location;
      this.phoneNum = phoneNum;
        
    }
    
    public String getName(){  //get user name
        return name;
    }
    
    public String getEmail(){  //getting user email
        
        return email;
    }
    public String getPassword() { //getting user password
        return password;
    }   
    public String getLocation() {  //getting user location
        return location;
    }
     
    public String getPhoneNum() {  //getting user phone number
        return phoneNum;
    }
    

    
    

    
}
