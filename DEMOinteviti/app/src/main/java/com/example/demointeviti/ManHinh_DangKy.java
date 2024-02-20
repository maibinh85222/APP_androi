package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ManHinh_DangKy extends AppCompatActivity {
    ImageButton imageButtonQuayVeDangNhap;
    Button buttonDangKy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_ky);

        imageButtonQuayVeDangNhap = findViewById(R.id.imageButtonQuayVeDangNhap);
        imageButtonQuayVeDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_DangKy.this, ManHinh_DangNhap.class);
                startActivity(intent);
            }
        });

        buttonDangKy = findViewById(R.id.buttonDangKy);
        buttonDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManHinh_DangKy.this, "Chưa được nâng cấp!!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}