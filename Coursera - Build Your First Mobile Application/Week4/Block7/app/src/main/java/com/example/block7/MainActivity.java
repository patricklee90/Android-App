package com.example.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker posibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        posibilities = findViewById(R.id.numberPicker);
        webView = findViewById(R.id.webView);

        String[] possibilityString = {
                "Android",
                "Checklist text-input field",
                "Coursera",
                "Supelec"
        };

        posibilities.setDisplayedValues(possibilityString);
        posibilities.setMinValue(0);
        posibilities.setMaxValue(possibilityString.length - 1);
    }

    public void navigate(View v){
        int choice = posibilities.getValue();
        if(choice == 0){
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("http://www.google.com/");
        }
        else if(choice == 1)
            webView.loadUrl("file:///android_asset/2.html");
        else if(choice == 2)
            webView.loadUrl("http://www.coursera.org/");
        else if(choice == 3)
            webView.loadUrl("file:///android_asset/3.html");
    }
}