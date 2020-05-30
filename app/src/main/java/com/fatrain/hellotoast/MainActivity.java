package com.fatrain.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String COUNT_ITEM = "";
    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }


    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        
    }

    public void sayHello(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(COUNT_ITEM, mCount+""); //Extra (+"") need for convert int to String.
        startActivity(intent);

    }

    public void clearItem(View view) {
        if (mShowCount != null) {
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
        }
    }


}

