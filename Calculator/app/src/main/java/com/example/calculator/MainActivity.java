package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    public void btnDiv(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int div = a/b;
        tvResult.setText(String.valueOf(div));
    }

    public void btnSub(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int sub = a-b;
        tvResult.setText(String.valueOf(sub));
    }

    public void btnMul(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int sub = a*b;
        tvResult.setText(String.valueOf(sub));
    }

    public void btnSum(View view) {
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int sub = a+b;
        tvResult.setText(String.valueOf(sub));
    }
}