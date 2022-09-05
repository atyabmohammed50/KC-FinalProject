package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity11 extends AppCompatActivity {



    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}