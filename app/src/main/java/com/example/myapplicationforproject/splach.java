package com.example.myapplicationforproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splach extends AppCompatActivity {
    Handler obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        obj=new Handler();

        obj.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splach.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}