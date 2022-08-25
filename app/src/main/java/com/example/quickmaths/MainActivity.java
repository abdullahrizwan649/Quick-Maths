package com.example.quickmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        ImageButton checkbtn1 = (ImageButton) findViewById(R.id.checkbtn1);

        checkbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent;
                intent = new Intent(MainActivity.this, correct_answer.class);
                startActivity(intent);
            }
        });

        ImageButton closebtn1 = (ImageButton) findViewById(R.id.closebtn1);

        closebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent;
                intent = new Intent(MainActivity.this, correct_answer.class);
                startActivity(intent);
            }
        });
    }
}
