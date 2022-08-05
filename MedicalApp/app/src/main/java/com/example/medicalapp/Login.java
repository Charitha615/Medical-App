package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        button =(Button) findViewById(R.id.login2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencommondetails();
            }
        });
    }
    public void opencommondetails(){
        Intent intent = new Intent(this, commondetails.class);
        startActivity(intent);
    }
}