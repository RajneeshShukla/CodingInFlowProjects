package com.example.rajneeshshukla.toolbar;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveData(View view) {
        SharedPreferences preferences = getSharedPreferences("MY_DATA", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("MY_TEXT", "This is the name of the coundtry");
        editor.apply();
        Toast.makeText(this, "Data is saved", Toast.LENGTH_SHORT).show();

    }

    public void logData(View view) {
        SharedPreferences preferences = getSharedPreferences("MY_DATA", MODE_PRIVATE);
        String s = preferences.getString("MY_TEXT", "Did not save any data");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
