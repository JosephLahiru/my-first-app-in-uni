package com.example.myfirstappinuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercise04 extends AppCompatActivity {

    Button displayBtn;
    TextView displayView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise04);

        displayBtn = findViewById(R.id.button);
        displayView = findViewById(R.id.textView);
        editText = findViewById(R.id.personName);

    }
}