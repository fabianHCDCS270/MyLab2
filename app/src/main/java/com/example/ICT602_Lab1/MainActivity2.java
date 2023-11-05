package com.example.ICT602_Lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.lab2.R;

public class MainActivity2 extends AppCompatActivity {

    Button openActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        openActivity = (Button) findViewById(R.id.button);
    }

}