package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        Button VideoBurnsbtn = findViewById(R.id.videobleedingbtn);
        Button BurnsbtnTxt = findViewById(R.id.burnsbtntxt);





        VideoBurnsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent44 = new Intent(MainActivity10.this,MainActivityburnsvideo.class);
                startActivity(intent44);}});





        BurnsbtnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent77 = new Intent(MainActivity10.this,MainActivityburnstxt.class);
                startActivity(intent77);}});

    }
}