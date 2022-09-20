package com.firstapp.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text1,text2,text3,text4;
    String txt1Str,txt2Str,txt3Str,txt4Str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text1=findViewById(R.id.txt1);

        txt1Str=getIntent().getStringExtra("Welcome");
        text1.setText("Name:"+txt1Str);


        text2=findViewById(R.id.txt2);

        txt2Str=getIntent().getStringExtra("Hi");
        text2.setText("Password:"+txt2Str);


        text3=findViewById(R.id.txt3);

        txt3Str=getIntent().getStringExtra("Hello");
        text3.setText("Email:"+txt3Str);



        text4=findViewById(R.id.txt4);

        txt4Str=getIntent().getStringExtra("Thank you ");
        text4.setText("Phone num:"+txt4Str);




    }
}