package com.example.myapplicationforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    button = (Button) findViewById(R.id.btn);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMain();
        }
    });



    }
    public void openMain(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}