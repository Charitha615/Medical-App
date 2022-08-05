package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class commondetails extends AppCompatActivity {
    AppCompatRadioButton rbLeft,rbRight;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commondetails);

        rbLeft = findViewById(R.id.rbLeft);
        rbRight = findViewById(R.id.rbRight);

        button =(Button) findViewById(R.id.continue_com);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRiskLevelResult();
            }
        });
    }
    public void onRadioButtonClicked(View view){
        boolean isSelected = ((AppCompatRadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rbLeft:
                if(isSelected){
                    rbLeft.setTextColor(Color.WHITE);
                    rbRight.setTextColor(Color.BLACK);
                }
                break;
            case R.id.rbRight:
                if(isSelected){
                    rbRight.setTextColor(Color.WHITE);
                    rbLeft.setTextColor(Color.BLACK);
                }
                break;
        }

    }
    public void openRiskLevelResult(){
        Intent intent = new Intent(this, RiskLevelResultCommon.class);
        startActivity(intent);
    }
}