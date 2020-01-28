package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id._1);
        button2 = findViewById(R.id._2);
        button3 = findViewById(R.id._3);
        button4 = findViewById(R.id._4);
        button5 = findViewById(R.id._5);
        button6 = findViewById(R.id._6);
        button7 = findViewById(R.id._7);
        button8 = findViewById(R.id._8);
        button9 = findViewById(R.id._9);
        button10 = findViewById(R.id._10);
        button11 = findViewById(R.id._11);
        button12 = findViewById(R.id._12);
        button13 = findViewById(R.id._13);
        button14 = findViewById(R.id._14);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        calculator = new Calculator();
        et = findViewById(R.id.ed);
        tv = findViewById(R.id.tv);

    }

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Calculator calculator;
    EditText et;
    TextView tv;


    @Override
    public void onClick(View v) {
        String s = ((Button)v).getText().toString();
        String editText = et.getText().toString();
        if(((Button)v).getText().toString().equals("+"))
        {
         if (calculator.operant1 == null)
         {
          Double op1 = Double.valueOf(editText);
          calculator.operant1 = op1;
          calculator.operation = s;
         }
         else
         {
             Double op2 = Double.valueOf(editText);
             calculator.operant2 = op2;
                     calculator.operation = s;
         }
        }
        if(Character.isDigit(((Button)v).getText().toString().charAt(0)))
        {
           editText = editText + s;
           et.setText(editText);
        }
        //Toast.makeText(MainActivity.this, s ,Toast.LENGTH_LONG).show();
        //int x = 1;
//        int y = 1+x++;
//        x = 1;
//        int z = ++x+1;
        //Toast.makeText(MainActivity.this, String.valueOf(1 + (x++)) ,Toast.LENGTH_LONG).show();

    }
}

