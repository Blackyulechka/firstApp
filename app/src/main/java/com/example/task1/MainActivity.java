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
        Button buttonWorkOne = findViewById(R.id.button4);
        Button buttonWorkTwo = findViewById(R.id.button5);
        Button buttonWorkTree = findViewById(R.id.button6);
        buttonWorkOne.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                                 startActivity(intent);
                                             }
                                         });
        buttonWorkTwo.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                                                 startActivity(intent);
                                             }
                                         });
        buttonWorkTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, work_three.class);
                startActivity(intent);
            }
        });
    }
}