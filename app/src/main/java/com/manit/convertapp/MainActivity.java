package com.manit.convertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        Log.i("info","pressed Convert");

        EditText weight=(EditText)findViewById(R.id.weight);
        EditText height=(EditText)findViewById(R.id.height);
        String weightString=weight.getText().toString();
        String heightString=height.getText().toString();
        double heightDouble=Double.parseDouble(heightString);
        double weightDouble=Double.parseDouble(weightString);
        double bmi=weightDouble/((heightDouble/100)*(heightDouble/100));
        String bmiString=String.format("%.1f",bmi);
        String display="";

        if(bmi<=18.5)
        {
            display=bmiString+", You are Underwight";
        }
        if(bmi>18.5&&bmi<=24.9)
        {
            display=bmiString+", You are Fit";
        }
        if(bmi>=25&&bmi<=29.9)
        {
            display=bmiString+", You are Overweight";
        }
        if(bmi>=30)
        {
            display=bmiString+", You are obese";
        }

        Toast.makeText(this, display,Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
