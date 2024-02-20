package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ManHinh_DangNhap extends AppCompatActivity {
    ImageButton imageButtonQuayVeDangNhap;
    Button buttonTaoTaiKhoan, buttonQuenMatKhau, buttonNutDangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_dang_nhap);

        imageButtonQuayVeDangNhap = findViewById(R.id.imageButtonQuayVeDangNhap);
        imageButtonQuayVeDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_DangNhap.this, ManHinh_Them.class);
                startActivity(intent);
            }
        });

        buttonTaoTaiKhoan = findViewById(R.id.buttonTaoTaiKhoan);
        buttonTaoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_DangNhap.this, ManHinh_DangKy.class);
                startActivity(intent);
            }
        });

        buttonQuenMatKhau = findViewById(R.id.buttonQuenMatKhau);
        buttonQuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_DangNhap.this, ManHinh_QuenMatKhau.class);
                startActivity(intent);
            }
        });

        buttonNutDangNhap = findViewById(R.id.buttonNutDangNhap);
        buttonNutDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManHinh_DangNhap.this, "Chưa được nâng cấp!!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}