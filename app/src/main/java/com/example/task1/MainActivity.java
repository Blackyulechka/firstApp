package com.example.task1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonWorkOneFromFirstButton = findViewById(R.id.button4);
        Button buttonWorkOneFromSecondButton = findViewById(R.id.button5);
        Button buttonWorkOneFromThirdButton = findViewById(R.id.button6);
        setContentView(R.layout.activity_main);


        buttonWorkOneFromFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, work_one.class);
                startActivity(intent);
            }
        });
        buttonWorkOneFromSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, work_one.class);
                startActivity(intent);
            }
        });
        buttonWorkOneFromThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, work_one.class);
                startActivity(intent);
            }
        });
    }
}