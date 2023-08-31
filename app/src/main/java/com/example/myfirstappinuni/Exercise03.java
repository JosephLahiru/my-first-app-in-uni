package com.example.myfirstappinuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercise03 extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private boolean isTextOne = true; // Initial state

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise03);

        textView = findViewById(R.id.text1);
        button = findViewById(R.id.btnClick);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isTextOne) {
                    textView.setText("Welcome to Android Studio!!!");
                } else {
                    textView.setText("Hello, World!");
                }

                isTextOne = !isTextOne;
            }
        });
    }
}