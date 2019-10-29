 package com.example.soccery;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    private Button add,sub,mul,div;
    private EditText OP1,OP2;
    private AlertDialog.Builder Result;
    private double a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         add=findViewById(R.id.btn1);
         sub=findViewById(R.id.btn2);
         mul=findViewById(R.id.btn3);
         div=findViewById(R.id.btn4);

         OP1=findViewById(R.id.OP1);
         OP2=findViewById(R.id.OP2);

        Result=new AlertDialog.Builder(MainActivity.this);
        a=0;b=0;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkOP1() && checkOP2())
                {

                    try
                    {
                        a= Integer.parseInt(OP1.getText().toString());
                        b= Integer.parseInt(OP2.getText().toString());
                        double c = a+b;
                        Result.setTitle("Result").setMessage("Answer is : "+c).setCancelable(true).show();
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkOP1() && checkOP2())
                {

                    try
                    {
                        a= Integer.parseInt(OP1.getText().toString());
                        b= Integer.parseInt(OP2.getText().toString());
                        double c = a-b;
                        Result.setTitle("Result").setMessage("Answer is : "+c).setCancelable(true).show();
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkOP1() && checkOP2())
                {

                    try
                    {
                        a= Integer.parseInt(OP1.getText().toString());
                        b= Integer.parseInt(OP2.getText().toString());
                        double c = a/b;
                        Result.setTitle("Result").setMessage("Answer is : "+c).setCancelable(true).show();
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkOP1() && checkOP2())
                {
                    try
                    {
                        a= Integer.parseInt(OP1.getText().toString());
                        b= Integer.parseInt(OP2.getText().toString());
                        double c = a*b;
                        Result.setTitle("Result").setMessage("Answer is : "+c).setCancelable(true).show();
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
     public boolean checkOP1()
     {
         if(!TextUtils.isEmpty(OP1.getText().toString()))
         {
             return true;
         }
         else
         { return false;}
     }

     public boolean checkOP2()
     {
         if(!TextUtils.isEmpty(OP2.getText().toString()))
         {
             return true;
         }
         else
         { return false;}
     }
}
