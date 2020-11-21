package com.example.first_android_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {

        // show message to user
        Toast.makeText(this, "You press this button", Toast.LENGTH_LONG).show();

        // change text of TextView
        TextView tv = findViewById(R.id.hello_text);
        tv.setText("You clicked it!");
    }
}
