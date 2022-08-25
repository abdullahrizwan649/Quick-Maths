package com.example.quickmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.util.Objects;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        Objects.requireNonNull(getSupportActionBar()).hide();


        setContentView(R.layout.activity_start_page);



        ImageButton startbtn = (ImageButton) findViewById(R.id.startbtn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(StartPage.this, MainActivity.class);
                startActivity(intent);
            }


        });


    }
}