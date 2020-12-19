 package com.example.myshareddata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private EditText editTextName;
     private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

     public void button_Login(View view) {
        String name = editTextName.getText().toString();
        String password = editTextName.getText().toString();

        if (name.equals("") || (password.equals(""))){
            Toast.makeText(getApplicationContext(), "please fill all field", Toast.LENGTH_SHORT).show();
        }else{
            User user = new User(MainActivity.this);
            user.setName(name);
            user.setPassword(password);
            String msg = Validation.validate(user);
            if (msg.equals("success")){
                startActivity(new Intent(MainActivity.this,WelcomeAcitvity.class));
                finish();
            }else{
                Toast.makeText(getApplicationContext(), "Invalid user or password", Toast.LENGTH_SHORT).show();
            }
        }
     }
 }