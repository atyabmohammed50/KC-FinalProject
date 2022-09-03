package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Button FaintingBtnTxt = findViewById(R.id.faintingbtntxt);
        Button FaintingVideoBtn = findViewById(R.id.faintingvideobtn);




        FaintingBtnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent88 = new Intent(MainActivity6.this,MainActivityfaintingtxt.class);
                startActivity(intent88);}});




        FaintingVideoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent99 = new Intent(MainActivity6.this,MainActivityfaintingvideo.class);
                startActivity(intent99);
            }
        });



    }
}

