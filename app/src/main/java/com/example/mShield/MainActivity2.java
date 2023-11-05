package com.example.mShield;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button goNext = findViewById(R.id.geo_button);
        goNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        Button goSms = findViewById(R.id.sms_button);
        goSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, SMSActivity.class);
                startActivity(intent);
            }
        });

     /*   Button goMore = findViewById(R.id.more_button);
        goMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MoreActivity.class);
                startActivity(intent);
            }
        });*/
    }
}