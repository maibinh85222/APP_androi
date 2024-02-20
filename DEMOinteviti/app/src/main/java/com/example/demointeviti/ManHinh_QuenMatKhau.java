package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ManHinh_QuenMatKhau extends AppCompatActivity {
    ImageButton imageButtonQuayVeQuenMatKhau;
    Button buttonQuenMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_quen_mat_khau);

        imageButtonQuayVeQuenMatKhau = findViewById(R.id.imageButtonQuayVeQuenMatKhau);
        imageButtonQuayVeQuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManHinh_QuenMatKhau.this, ManHinh_DangNhap.class);
                startActivity(intent);
            }
        });

        buttonQuenMatKhau = findViewById(R.id.buttonQuenMatKhau);
        buttonQuenMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManHinh_QuenMatKhau.this,"Chưa được nâng cấp!!!",Toast.LENGTH_LONG ).show();
            }
        });
    }
}