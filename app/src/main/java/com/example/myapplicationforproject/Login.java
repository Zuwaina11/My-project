package com.example.myapplicationforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username1, password;
    Button login, admin;
    DatabaseHelper db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username1 = (EditText) findViewById(R.id.username1);
        password =(EditText) findViewById(R.id.password1);
        db = new DatabaseHelper(this);
        login =(Button) findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String user =username1.getText().toString();
                String pass = password.getText().toString();


                if(user.equals("")||pass.equals(""))
                Toast.makeText(Login.this,"Please Enter your Login and password",Toast.LENGTH_LONG).show();

                else{
                    Toast.makeText(Login.this,"login successfully",Toast.LENGTH_LONG).show();
                }


            }

        });


        admin = (Button) findViewById(R.id.btnproduct);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdmin();
            }
        });



    }
    public void openAdmin(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);

}
}