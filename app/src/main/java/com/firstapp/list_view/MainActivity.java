package com.firstapp.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, pass, email, phone;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameEdt);
        pass = findViewById(R.id.Pass_edt);
        email = findViewById(R.id.Email_id);
        phone = findViewById(R.id.phone_num);
    }

    public void Submit(View view) {
        String nameStr = name.getText().toString();
        String passStr = pass.getText().toString();
        String emailStr = email.getText().toString();
        String phoneStr = phone.getText().toString();


        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Welcome", nameStr);
        startActivity(intent);

        intent.putExtra("Hi", passStr);
        startActivity(intent);

        intent.putExtra("Hello", emailStr);
        startActivity(intent);

        intent.putExtra("Thank you ", phoneStr);
        startActivity(intent);
    }
}


