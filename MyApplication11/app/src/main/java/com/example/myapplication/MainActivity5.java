package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {



    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button Videobtn = findViewById(R.id.videobtn);
        Button Desbtn = findViewById(R.id.desdrowningbtn);
        Button QuizDrowningbtn = findViewById(R.id.quizdrowningbtn);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Videobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent9 = new Intent(MainActivity5.this,MainActivity11.class);
                startActivity(intent9);}});



        Desbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent111 = new Intent(MainActivity5.this,MainActivitydrowningtxt.class);
                startActivity(intent111);}});



        QuizDrowningbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent777 = new Intent(MainActivity5.this, MainActivitydrowningquiz.class);
                startActivity(intent777);

            }
        });
    }
}