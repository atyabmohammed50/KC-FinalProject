package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {



    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button VideoChokingBtn = findViewById(R.id.videochokingbtn);
        Button CokingBtnTxt = findViewById(R.id.chokingbtntxt);
        Button QuizChokingBtn = findViewById(R.id.quizchokingbtn);




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        VideoChokingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11 = new Intent(MainActivity7.this,MainActivitychokingvideo.class);
                startActivity(intent11);}});



        CokingBtnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent66 = new Intent(MainActivity7.this,MainActivitychokingtext.class);
                startActivity(intent66);}});



        QuizChokingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent444 = new Intent(MainActivity7.this,MainActivitychokingquiz.class);
                startActivity(intent444);

            }
        });

    }
}