package com.fatrain.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mCountItem;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mCountItem = findViewById(R.id.count_item);

        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.COUNT_ITEM);
        Log.d(LOG_TAG, count);
        mCountItem.setText(count);
    }
}
