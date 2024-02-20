package com.example.demointeviti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai_Tap_2 extends AppCompatActivity {

    TextView ouBT2I;
    EditText inbt2I1_a, inbt2I2_a;
    Button btBT2II1, btBT2II2, btBT2II3, btBT2II4, btBT2I;
/*
---------------------------------------Tạo thông báo hiện lên màn hình có hay không
*/
    private void showDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // perform action when OK button is clicked
                        Intent intent = new Intent(Bai_Tap_2.this, MainActivity.class);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // cancel the dialog
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
    /*
------------------------------------------------------------
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap2);

        ouBT2I = findViewById(R.id.ouBT2I);

        inbt2I1_a = findViewById(R.id.inbt2I1_a);
        inbt2I2_a = findViewById(R.id.inbt2I2_a);
        btBT2I = findViewById(R.id.btBT2I);

        btBT2II1 = findViewById(R.id.btBT2II1);
        btBT2II2 = findViewById(R.id.btBT2II2);
        btBT2II3 = findViewById(R.id.btBT2II3);
        btBT2II4 = findViewById(R.id.btBT2II4);


        btBT2I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog("Bạn có muốn thoát không!!"); /*hàm thoát có thông báo hiện thị */
            }
        });

        btBT2II1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = inbt2I1_a.getText().toString();
                String B = inbt2I2_a.getText().toString();

                if(A.isEmpty()||B.isEmpty()){
                    Toast.makeText(Bai_Tap_2.this, "Tham số chưa được nhập đủ!!!!", Toast.LENGTH_SHORT).show();
                }
                else if(A.isEmpty()==false||B.isEmpty()==false) {
                    double a = 0, b = 0, result = 0;
                    a = Double.parseDouble(inbt2I1_a.getText().toString());
                    b = Double.parseDouble(inbt2I2_a.getText().toString());
                    result = a + b;
                    ouBT2I.setText("Result = " + result);
               }
            }
        });

        btBT2II2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = inbt2I1_a.getText().toString();
                String B = inbt2I2_a.getText().toString();

                if(A.isEmpty()||B.isEmpty()){
                    Toast.makeText(Bai_Tap_2.this, "Tham số chưa được nhập đủ!!!!", Toast.LENGTH_SHORT).show();
                }
                else if(A.isEmpty()==false||B.isEmpty()==false) {
                    double a = 0, b = 0;
                    a = Double.parseDouble(inbt2I1_a.getText().toString());
                    b = Double.parseDouble(inbt2I2_a.getText().toString());
                    ouBT2I.setText("Result = " + (a - b));
                }
            }
        });

        btBT2II3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = inbt2I1_a.getText().toString();
                String B = inbt2I2_a.getText().toString();

                if(A.isEmpty()||B.isEmpty()){
                    Toast.makeText(Bai_Tap_2.this, "Tham số chưa được nhập đủ!!!!", Toast.LENGTH_SHORT).show();
                }
                else if(A.isEmpty()==false||B.isEmpty()==false) {
                    double a = 0, b = 0, result = 0;
                    a = Double.parseDouble(inbt2I1_a.getText().toString());
                    b = Double.parseDouble(inbt2I2_a.getText().toString());
                    result = a * b;
                    ouBT2I.setText("Result = " + result);
                }
            }
        });

        btBT2II4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = inbt2I1_a.getText().toString();
                String B = inbt2I2_a.getText().toString();

                if(A.isEmpty()||B.isEmpty()){
                    Toast.makeText(Bai_Tap_2.this, "Tham số chưa được nhập đủ!!!!", Toast.LENGTH_SHORT).show();
                }
                else if(A.isEmpty()==false||B.isEmpty()==false) {
                    double a = 0, b = 0, result = 0;
                    a = Double.parseDouble(inbt2I1_a.getText().toString());
                    b = Double.parseDouble(inbt2I2_a.getText().toString());
                    result = a / b;
                    ouBT2I.setText("Result = " + result);
                }
            }
        });

    }
}