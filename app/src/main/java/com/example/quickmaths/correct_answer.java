package com.example.quickmaths;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;

public class correct_answer extends AppCompatActivity {
    ImageButton refreshbtn, share_btn;
    TextView score_counter;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_answer);

            Objects.requireNonNull(getSupportActionBar()).hide();

            Intent mIntent = getIntent();
            score = mIntent.getIntExtra("score_intent", 1000);
    //        Log.d("score_pls", "onCreate: " + score);

            score_counter = findViewById(R.id.score_counter);

            score_counter.setText(String.valueOf(score));

            refreshbtn = findViewById(R.id.refreshbtn);
            refreshbtn.setOnClickListener(view -> {
            Intent intent;
            intent = new Intent(correct_answer.this, StartPage  .class);
            startActivity(intent);
        });

            share_btn= findViewById(R.id.share_btn);
            share_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/universityofdn/"));
                    startActivity(browserIntent);
                }
            });

}

}