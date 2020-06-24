package com.example.assignment_timeconvertion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvUpperCase = findViewById(R.id.buttonConvUpperCase);
        buttonConvUpperCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBox = findViewById(R.id.editText);

                textBox.setText(textBox.getText().toString().toUpperCase());
            }
        });

        Button buttonConvLowerCase = findViewById(R.id.buttonConvLowerCase);
        buttonConvLowerCase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBox = findViewById(R.id.editText);

                textBox.setText(textBox.getText().toString().toLowerCase());
            }
        });
    }
}