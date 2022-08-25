package com.example.quickmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.widget.ImageButton;

import java.util.Objects;

public class correct_answer extends AppCompatActivity {
    ImageButton refreshbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);

        Objects.requireNonNull(getSupportActionBar()).hide();


        refreshbtn = findViewById(R.id.refreshbtn);
        refreshbtn.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(correct_answer.this, MainActivity.class);
            startActivity(intent);
        });

}}