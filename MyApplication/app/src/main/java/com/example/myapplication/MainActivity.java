package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView calculator = findViewById(R.id.title) ;
    TextView total = findViewById(R.id.Result) ;
    TextView hint1 = findViewById(R.id.Number1) ;
    TextView hint2 = findViewById(R.id.Number2) ;
    Button calculate = findViewById(R.id.Operate) ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}