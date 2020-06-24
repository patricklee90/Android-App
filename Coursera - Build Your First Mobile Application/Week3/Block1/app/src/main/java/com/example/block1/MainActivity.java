package com.example.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ButtonBlue, ButtonPink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonBlue = findViewById(R.id.button_BlueInvisible);
        ButtonPink = findViewById(R.id.button_pinkPanther);
//        Button ButtonPink = new Button(this);
//        ButtonPink.setTextColor(Color.BLACK);
//        ButtonPink.setText("The Pink Panther's To Do List");
//        ButtonPink.setBackgroundColor(Color.parseColor(("#FD9BF3")));
//
//        RelativeLayout rl_mainScreen = findViewById(R.id.relativeLayout_mainScreen);
//
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT);
//        params.addRule(RelativeLayout.BELOW, ButtonBlue.getId());
//        rl_mainScreen.addView(ButtonPink);
        //button.setLayoutParams(new
        //        RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
        //        ViewGroup.LayoutParams.WRAP_CONTENT));
        ButtonBlue.setOnClickListener(this);
        ButtonPink.setOnClickListener(this);
    }

    public void toDo(View v){
        if(v.equals(ButtonBlue))
            // Invisibility
            v.setVisibility(View.INVISIBLE);
        if(v.equals(ButtonPink))
            // Pop.Up
            Toast.makeText(getApplicationContext(),
                    "To do to do to do ....",
                    Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        toDo(view);
    }
}