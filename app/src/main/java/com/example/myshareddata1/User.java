package com.example.myshareddata1;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    private String name;
    private String password;
    Context context;
    SharedPreferences sharedPreferences;

    public User(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("login_detail",context.MODE_PRIVATE);
    }

    public String getName() {
        name=sharedPreferences.getString("name","");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sharedPreferences.edit().putString("name",name).commit();
    }

    public String getPassword() {
        password = sharedPreferences.getString("password","");
        return password;
    }

    public void setPassword(String password) {
        sharedPreferences.edit().putString("password",password).commit();
        this.password = password;
    }
    public  void removeUser(){
        sharedPreferences.edit().clear().commit();
    }
}

