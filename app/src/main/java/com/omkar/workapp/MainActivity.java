package com.omkar.workapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 private int numbercount = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = (Button) findViewById(R.id.btn1);
        Button count = (Button) findViewById(R.id.btn2);
        Button random = (Button) findViewById(R.id.btn3);

        final TextView tv1 = (TextView) findViewById(R.id.tv1);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Toast toast1 = Toast.makeText(MainActivity.this,"Hello World",Toast.LENGTH_LONG);
                toast1.show();
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numbercount++;
                tv1.setText(Integer.toString(numbercount));
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numbercount==0) {
                    Toast.makeText(MainActivity.this,"Increse the count",Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("random", numbercount);
                    startActivity(intent);
                }


            }
        });
    }
}
