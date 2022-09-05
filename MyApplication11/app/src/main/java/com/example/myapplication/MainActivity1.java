package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button Startbtn = findViewById(R.id.startbtn);
        Button Callbtn = findViewById(R.id.callbtn);
        Button AboutAppbtn = findViewById(R.id.aboutappbtn);


        Startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity1.this,MainActivity0.class);
                startActivity(intent1);}});


        Callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = new Intent(Intent.ACTION_DIAL);

                intent3.setData(Uri.parse("tel:112"));


                if (intent3.resolveActivity(getPackageManager())  !=null) {

                    startActivity(intent3);}}});



        AboutAppbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent222 = new Intent(MainActivity1.this, MainActivityaboutapp.class);
                startActivity(intent222);}});





    }
}