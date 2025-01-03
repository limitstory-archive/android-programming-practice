package com.example.practice7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    EditText editText1;
    MenuItem item1, item2, item3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("제주도 풍경");

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        editText1 = (EditText) findViewById(R.id.editText1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        item1 = menu.findItem(R.id.item1);
        item2 = menu.findItem(R.id.item2);
        item3 = menu.findItem(R.id.item3);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rotate:
                imageView1.setRotation(Float.parseFloat(editText1.getText().toString()));
                return true;
            case R.id.item1:
                imageView1.setImageResource(R.drawable.jeju2);
                item1.setChecked(true);
                return true;
            case R.id.item2:
                imageView1.setImageResource(R.drawable.jeju1);
                item2.setChecked(true);
                return true;
            case R.id.item3:
                imageView1.setImageResource(R.drawable.jeju14);
                item3.setChecked(true);
                return true;
        }
        return false;
    }
}