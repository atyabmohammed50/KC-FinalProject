package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityburnstxt extends AppCompatActivity {



    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityburnstxt);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}