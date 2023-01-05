package com.example.myapplicationforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {


    Button home,login,admin,product,celebration;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home= (Button) findViewById(R.id.btnhome);
        login =(Button) findViewById(R.id.btnlogin);
        admin=(Button) findViewById(R.id.btnadmin);
        product = (Button) findViewById(R.id.btnproduct);
        celebration =(Button) findViewById(R.id.btncel);
        

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();

            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdmin();
            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProduct();
            }
        });
        celebration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCelebration();
            }
        });

    }
    public void openHome(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openLogin(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAdmin(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openProduct(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openCelebration(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }






}