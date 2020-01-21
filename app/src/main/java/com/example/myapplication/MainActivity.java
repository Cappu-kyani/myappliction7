package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {
        String s = ((Button)v).getText().toString();
        if(((Button)v).getText().toString().equals("+"))
        {

        }
        if(Character.isDigit(((Button)v).getText().toString().charAt(0)))
        {

        }
        //Toast.makeText(MainActivity.this, s ,Toast.LENGTH_LONG).show();
        int x = 1;
//        int y = 1+x++;
//        x = 1;
//        int z = ++x+1;
        Toast.makeText(MainActivity.this, String.valueOf(1 + (x++)) ,Toast.LENGTH_LONG).show();

    }
}

