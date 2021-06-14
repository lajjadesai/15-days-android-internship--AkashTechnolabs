package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);



        btnAdd.setOnClickListener(v -> {
            String n1, n2;
            n1 = etNum1.getText().toString();
            n2 = etNum2.getText().toString();

            int num1, num2, add;

            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            add = num1 + num2;


            Toast.makeText(MainActivity.this, "Answer is: " + add, Toast.LENGTH_SHORT).show();


        });
        btnSub.setOnClickListener(v -> {
            String n1, n2;
            n1 = etNum1.getText().toString();
            n2 = etNum2.getText().toString();

            int num1, num2, sub;

            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            sub = num1 - num2;

            Toast.makeText(MainActivity.this, "Answer is: " + sub, Toast.LENGTH_SHORT).show();


        });
        btnMul.setOnClickListener(v -> {
            String n1, n2;
            n1 = etNum1.getText().toString();
            n2 = etNum2.getText().toString();

            int num1, num2, mul;

            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            mul = num1 * num2;

            Toast.makeText(MainActivity.this, "Answer is: " + mul, Toast.LENGTH_SHORT).show();


        });
        btnDiv.setOnClickListener(v -> {
            String n1, n2;
            n1 = etNum1.getText().toString();
            n2 = etNum2.getText().toString();

            int num1, num2, div;

            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            div = num1 / num2;

            Toast.makeText(MainActivity.this, "Answer is: " + div, Toast.LENGTH_SHORT).show();


        });
    }
}




