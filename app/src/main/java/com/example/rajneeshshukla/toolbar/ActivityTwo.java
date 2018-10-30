package com.example.rajneeshshukla.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        getSupportActionBar().setTitle("Three");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void starNewActivity(View view) {
        startActivity(new Intent(this, ActivityOne.class));
    }
}
