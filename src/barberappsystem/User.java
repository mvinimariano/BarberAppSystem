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
    private String name = "";
    private String email= "";
    private String password= "";
    private String location= "";
    private String phoneNum= "";
    
    
    public User(String email, String pasword){
        this.email = email;
        this.password = password;
    
    }
    
    public User(String name,String email,String password,String location, String phoneNum){
      this.name = name;
      this.email = email;
      this.password = password;
      this.location = location;
      this.phoneNum = phoneNum;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        
        return email;
    }
    public String getPassword() {
        return password;
    }   
    public String getLocation() {
        return location;
    }
     
    public String getPhoneNum() {
        return phoneNum;
    }
    

    
    

    
}
