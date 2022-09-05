package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity0 extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button drowningbtn = findViewById(R.id.btnDrowning);
        Button fintingbtn = findViewById(R.id.btnFainting);
        Button chokingbtn = findViewById(R.id.btnChoking);
        Button burnsbtn = findViewById(R.id.btnBurns);
        Button brokenbonebtn = findViewById(R.id.btnBrokenBone);
        Button bleedingbtn = findViewById(R.id.btnBleeding);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        drowningbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity0.this,MainActivity5.class);
                startActivity(intent2);}});


        fintingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = new Intent(MainActivity0.this,MainActivity6.class);
                startActivity(intent4);}});



        chokingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = new Intent(MainActivity0.this,MainActivity7.class);
                startActivity(intent5);}});


            burnsbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent6 = new Intent(MainActivity0.this,MainActivity10.class);
                    startActivity(intent6);}});



            brokenbonebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent7 = new Intent(MainActivity0.this,MainActivity9.class);
                    startActivity(intent7);}});





            bleedingbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent8 = new Intent(MainActivity0.this,MainActivity8.class);
                    startActivity(intent8);

                }
            });





    }
}