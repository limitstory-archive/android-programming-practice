package com.example.exercise4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imgView;
    Integer rotation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn1);
        imgView = (ImageView) findViewById(R.id.imgView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotation += 10;
                imgView.setRotation(rotation);
            }
        });
    }
}