package com.example.rajneeshshukla.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        getSupportActionBar().setTitle("Two");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
