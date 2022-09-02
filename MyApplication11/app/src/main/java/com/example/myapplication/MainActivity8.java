package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button VideoBleedingbtn = findViewById(R.id.videobleedingbtn);
        Button TxtBleedingbtn = findViewById(R.id.bleedingbtntxt);




        VideoBleedingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent33 = new Intent(MainActivity8.this,MainActivitybleedingvideo.class);
                startActivity(intent33);}});




        TxtBleedingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent77 = new Intent(MainActivity8.this,MainActivitybleedingtxt.class);
                startActivity(intent77);}});




    }
}