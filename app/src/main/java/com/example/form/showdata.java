package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class showdata extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdata);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        String pwd=i.getStringExtra("pwd");
        String gender=i.getStringExtra("gender");
        String education=i.getStringExtra("education");
        t1.setText(name);
        t2.setText(email);
        t3.setText(pwd);
        t4.setText(gender);
        t5.setText(education);
    }
}
