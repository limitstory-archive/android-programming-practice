package com.example.practice4_4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton radioArray[] = new RadioButton[3];
    ImageView imgView;
    Button btnQuit, btnRerun;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        switchAgree = (Switch) findViewById(R.id.switchAgree);
        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        radioArray[0] = (RadioButton)findViewById(R.id.radioBtn1);
        radioArray[1] = (RadioButton)findViewById(R.id.radioBtn2);
        radioArray[2] = (RadioButton)findViewById(R.id.radioBtn3);
        imgView = (ImageView) findViewById(R.id.imgView);
        btnQuit = (Button) findViewById(R.id.btnQuit);
        btnRerun = (Button) findViewById(R.id.btnRerun);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switchAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnQuit.setVisibility(View.VISIBLE);
                    btnRerun.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgView.setVisibility(View.GONE);
                    btnQuit.setVisibility(View.INVISIBLE);
                    btnRerun.setVisibility(View.INVISIBLE);
                    radioArray[0].setChecked(false);
                    radioArray[1].setChecked(false);
                    radioArray[2].setChecked(false);
                }
            }
        });

        for (int i = 0; i < radioArray.length; i++) {
            int index = i;
            radioArray[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imgView.setVisibility(View.VISIBLE);
                    if (index == 0)
                        imgView.setImageResource(R.drawable.pie);
                    else if (index == 1)
                        imgView.setImageResource(R.drawable.q10);
                    else if (index == 2)
                        imgView.setImageResource(R.drawable.r11);
                }
            });
        }

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        btnRerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchAgree.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                imgView.setVisibility(View.GONE);
                btnQuit.setVisibility(View.INVISIBLE);
                btnRerun.setVisibility(View.INVISIBLE);
                radioArray[0].setChecked(false);
                radioArray[1].setChecked(false);
                radioArray[2].setChecked(false);
                Toast.makeText(getApplicationContext() ,"초기화되었습니다",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}