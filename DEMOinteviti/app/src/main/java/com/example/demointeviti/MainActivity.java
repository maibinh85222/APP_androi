package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btmhchinh, btmnchinh2, btmnchinhII1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btmhchinh = findViewById(R.id.btmhchinh);
        btmhchinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ManHinh1.class);
                startActivity(intent);
            }
        });

        btmnchinh2 = findViewById(R.id.btmnchinh2);
        btmnchinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ManHinh2.class);
                startActivity(intent);
            }
        });

        btmnchinhII1 = findViewById(R.id.btmnchinhII1);
        btmnchinhII1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai_Tap_2.class);
                startActivity(intent);
            }
        });
        /*---------------------------------------App-------------------------------------------------*/
        Button btmnchinhCI;

        btmnchinhCI = findViewById(R.id.btmnchinhCI);
        btmnchinhCI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

    }
}