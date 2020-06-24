package com.example.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent Caller = getIntent();
        float rating = Caller.getFloatExtra("nbStars", 0);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Welcome to Second Activity! Your rating " + rating);
    }
}