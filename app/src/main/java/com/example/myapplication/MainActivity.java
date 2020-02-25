package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
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
        button15 = findViewById(R.id._clear);
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
        button15.setOnClickListener(this);
        calculator = new Calculator();
        et = findViewById(R.id.ed);
        tv = findViewById(R.id.tv);
        pref = getPreferences(MODE_PRIVATE);
        String saved = loadvalue();
        if (saved != null)
        {
            tv.setText(saved);
        }

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
    Button button15;
    Calculator calculator;
    EditText et;
    TextView tv;
    SharedPreferences pref;

    void stringvalue(String value)
    {
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("result", value);
        editor.commit();
    }

    String loadvalue()
    {
       return pref.getString("result", null);

    }

    @Override
    public void onClick(View v) {
        String s = ((Button)v).getText().toString();
        String editText = et.getText().toString();
        if(((Button)v).getText().toString().equals("C"))
        {
            tv.setText("");
            calculator.operation =null;
            calculator.operant1 = null;
            calculator.operant2 = null;
            et.setText("");
        }
        if(((Button)v).getText().toString().equals("+"))
        {
         if (calculator.operant1 == null)
         {
            if (editText.equals(""))
            {
                return;
            }
          Double op1 = Double.valueOf(editText);

          calculator.operant1 = op1;
          calculator.operation = s;
          et.setText("");
         }
         else
         {
             if (editText.equals("")) {
                 return;
             }
             else {
                 Double op2 = Double.valueOf(editText);
                 calculator.operant2 = op2;
                 calculator.operation = s;
                 String result = calculator.plus();
                 String[] array= result.split("\\.");
                 et.setText("");
                 if (array.length>1)
                 {
                     if(array[1].equals("0"))
                     {
                         tv.setText(array[0]);
                         return;
                     }
                 }
                 tv.setText(result);

             }

         }

        }

        if(((Button)v).getText().toString().equals("-"))
        {
            if (calculator.operant1 == null)
            {
                if (editText.equals(""))
                {
                    return;
                }
                Double op1 = Double.valueOf(editText);
                calculator.operant1 = op1;
                calculator.operation = s;
                et.setText("");
            }
            else
            {   if(editText.equals(""))
            {
                return;
            }
                Double op2 = Double.valueOf(editText);
                calculator.operant2 = op2;
                calculator.operation = s;
                String result = calculator.minus();
                et.setText("");
                String[] array= result.split("\\.");
                if (array.length>1)
                {
                    if(array[1].equals("0"))
                    {
                        tv.setText(array[0]);
                        return;
                    }
                }
                tv.setText(result);



            }

        }
        if(((Button)v).getText().toString().equals("*"))
        {
            if (calculator.operant1 == null)
            {
                if (editText.equals(""))
                {
                    return;
                }
                Double op1 = Double.valueOf(editText);
                calculator.operant1 = op1;
                calculator.operation = s;
                et.setText("");
            }
            else
            {
                if (editText.equals(""))
                {
                    return;
                }
                else {
                    Double op2 = Double.valueOf(editText);
                    calculator.operant2 = op2;
                    calculator.operation = s;
                    String result = calculator.multiply();
                    String[] array= result.split("\\.");
                    et.setText("");
                    if (array.length>1)
                    {
                        if(array[1].equals("0"))
                        {
                            tv.setText(array[0]);
                            return;
                        }
                    }
                    tv.setText(result);

                }

            }

        }
        if(((Button)v).getText().toString().equals("/"))
        {
            if (calculator.operant1 == null)
            {
                if (editText.equals(""))
                {
                    return;
                }
                Double op1 = Double.valueOf(editText);
                calculator.operant1 = op1;
                calculator.operation = s;
                et.setText("");
            }
            else
            {
                if (editText.equals(""))
                {
                    return;
                }
                else {
                    Double op2 = Double.valueOf(editText);
                    calculator.operant2 = op2;
                    calculator.operation = s;
                    String result = calculator.divide();
                    String[] array= result.split("\\.");
                    et.setText("");
                    if (array.length>1)
                    {
                        if(array[1].equals("0"))
                        {
                            tv.setText(array[0]);
                            return;
                        }
                    }
                    tv.setText(result);
                }

            }

        }
        if(((Button)v).getText().toString().equals("="))
        {
            if (calculator.operant1 == null && calculator.operant2 == null)
            {

            }
            else
            {
//                if (calculator.operant2 == null)
//                {
//                    Double op1 = Double.valueOf(editText);
//                    tv.setText(String.valueOf(op1));
//                }
                if (editText.equals(""))
                {
                    return;
                }
                Double op2 = Double.valueOf(editText);
                calculator.operant2 = op2;
                String result = calculator.equals();
                String[] array= result.split("\\.");
                et.setText("");
                if (array.length>1)
                {
                    if(array[1].equals("0"))
                    {
                        tv.setText(array[0]);
                        stringvalue(array[0]);
                        return;
                    }
                }
                tv.setText(result);
                stringvalue(result);

            }

        }

        if(Character.isDigit(((Button)v).getText().toString().charAt(0)))
        {
           editText = editText + s;
           et.setText(editText);
        }

    }

}

