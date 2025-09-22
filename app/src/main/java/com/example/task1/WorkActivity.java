package com.example.task1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_one);

        //Кнопка "Добавить" в окне 1
        Button buttonPlusPhoto = findViewById(R.id.button);
        buttonPlusPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkActivity.this, work_two.class);
                startActivity(intent);
            }
        });
        //Кнопка "Продолжить" из окна 1 в окно 2
        Button buttonNextToTwoSide = findViewById(R.id.button2);
        buttonNextToTwoSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkActivity.this, work_two.class);
                startActivity(intent);
            }
        });
        //Кнопка "Продолжить" из окна 2 в окно 3
        Button buttonNextToThreeSide = findViewById(R.id.button7);
        buttonNextToThreeSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkActivity.this, work_three.class);
                startActivity(intent);
            }
        });
        //Кнопка "Назад" из окна 1 в окно мейн
        Button buttonBackToMain = findViewById(R.id.button3);
        buttonBackToMain.setOnClickListener(v -> finish());


        //Кнопка "Назад" из окна 2 в окно 1
        Button buttonBackToOne = findViewById(R.id.button8);
        buttonBackToOne.setOnClickListener(v -> finish());
    }
}
