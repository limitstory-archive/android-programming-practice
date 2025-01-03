package com.example.practice4_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("초간단 계산기(수정)");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMod = (Button) findViewById(R.id.BtnMod);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText()) && TextUtils.isEmpty(edit2.getText())) {
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText()) && TextUtils.isEmpty(edit2.getText())) {
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText()) && TextUtils.isEmpty(edit2.getText())) {
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText()) && TextUtils.isEmpty(edit2.getText())) {
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눴어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(edit1.getText()) && TextUtils.isEmpty(edit2.getText())) {
                    Toast.makeText(getApplicationContext(), "값을 입력하지 않았어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눴어요",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

    }

}