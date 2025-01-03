package com.example.exercise5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout[] layout = new LinearLayout[4];
    Integer[] layout_num = {R.id.layout1, R.id.layout2, R.id.layout3, R.id.layout4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < layout.length; i++)
            layout[i] = (LinearLayout) findViewById(layout_num[i]);

        for (int i = 0; i < layout.length; i++) {
            int index = i;
            layout[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), layout[index].getWidth() + ", " +
                                    layout[index].getHeight(), Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}