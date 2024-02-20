package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinh1 extends AppCompatActivity {

    Button btmh1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh1);

        btmh1 = findViewById(R.id.btmh1);
        btmh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}