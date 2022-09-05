package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {




    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button Videobrokenbonebtn = findViewById(R.id.videobtnbb);
        Button BrokenBonetxtbtn = findViewById(R.id.brokenbonetxtbtn);
        Button QuizBrokenBonebtn = findViewById(R.id.quizbrokenbonebtn);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Videobrokenbonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent22 = new Intent(MainActivity9.this,MainActivitybrokebonevideo.class);
                startActivity(intent22);}});




        BrokenBonetxtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent88 = new Intent(MainActivity9.this,MainActivitybrokenbonetxt.class);
                startActivity(intent88);}});


        QuizBrokenBonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent666 = new Intent(MainActivity9.this,MainActivitybrokenbonequiz.class);
                startActivity(intent666);

            }
        });
    }
}