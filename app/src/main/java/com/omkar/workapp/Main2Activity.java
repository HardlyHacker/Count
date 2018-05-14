package com.omkar.workapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1 = (TextView)findViewById(R.id.t1);
        TextView t2 = (TextView)findViewById(R.id.t2);

        Intent i = getIntent();
        int number = i.getIntExtra("random",0);

        Random random = new Random();
        int number1 = random.nextInt(number);
        String s1 ="A random number between 0 to "+ Integer.toString(number) +" is:";
        t1.setText(s1);
        t2.setText(Integer.toString(number1));

    }
}
