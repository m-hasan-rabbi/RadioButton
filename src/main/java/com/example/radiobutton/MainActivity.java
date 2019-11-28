package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

     Button btn;
     TextView tv;
     EditText et;
     RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        et=(EditText) findViewById(R.id.et);
        tv=(TextView) findViewById(R.id.tv);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
    }
    public void methodc(View view)
    {
        if(TextUtils.isEmpty(et.getText().toString()))
        {
            Toast.makeText(this,"1st enter bdt value",Toast.LENGTH_LONG).show();
        }
        else
        {
            String s=et.getText().toString();
            double d=Double.parseDouble(s);
            if(r1.isChecked())
            {
                d=(d/84.4);
                DecimalFormat df= new DecimalFormat("0.00");
                String ss=df.format(d);
                tv.setText(ss);
            }
           else if(r2.isChecked())
            {
                d=(d/64.4);
                DecimalFormat df= new DecimalFormat("0.00");
                String ss=df.format(d);
                tv.setText(ss);
            }
           else
            {
                Toast.makeText(this,"1st select the currency",Toast.LENGTH_LONG).show();
            }
        }
    }
}
