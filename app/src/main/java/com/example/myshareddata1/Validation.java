package com.example.myshareddata1;

public class Validation {
    public  static String validate(User user){
        if(user.getName().equals("sunil") && user.getPassword().equals("sunil")){
            return "success";
        }
        else{
            return "fails";
        }
    }
}
