package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinh2 extends AppCompatActivity {

    Button btmh2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);


        btmh2 = findViewById(R.id.btmh2);
        btmh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}