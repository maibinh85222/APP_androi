package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinh_Them extends AppCompatActivity {
    Button buttonBoyIII1, ButtonDangNhap_Dangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_them);

        buttonBoyIII1 = findViewById(R.id.buttonBoyIII1);
        buttonBoyIII1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_Them.this, Home.class);
                startActivity(intent);
            }
        });

        ButtonDangNhap_Dangky = findViewById(R.id.ButtonDangNhap_Dangky);
        ButtonDangNhap_Dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_Them.this, ManHinh_DangNhap.class);
                startActivity(intent);
            }
        });
    }
}