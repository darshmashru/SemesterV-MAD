package com.example.madexperiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    TextView res;
    float num1, num2;
    String s1, s2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.result);
    }
    public void add(View view){
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());
        ans = String.valueOf(num1 + num2);
        res.setText(ans);
    }
    public void subtract(View view){
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());
        ans = String.valueOf(num1 - num2);
        res.setText(ans);
    }
    public void multiply(View view){
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());
        ans = String.valueOf(num1 * num2);
        res.setText(ans);
    }
    public void divide(View view){
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());
        ans = String.valueOf(num1 / num2);
        res.setText(ans);
    }
}