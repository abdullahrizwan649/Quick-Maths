package com.example.quickmaths;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int random_1,random_2;
    int answer;
    boolean check;
    int score;

EditText input;
TextView number_1;
TextView number_2;
TextView score_counter;
ImageButton checkbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       checkbtn1 = findViewById(R.id.checkbtn1);
        input = findViewById(R.id.input);
        number_1 = findViewById(R.id.gen_num_1);
        number_2 = findViewById(R.id.gen_num_2);
        score_counter = findViewById(R.id.score_counter);

        Objects.requireNonNull(getSupportActionBar()).hide();

        set_randomNumbers();
        number_1.setText(String.valueOf(random_1));
        number_2.setText(String.valueOf(random_2));

        checkbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run();
              //  check();
                Toast.makeText(MainActivity.this, "answer"+answer+"score"+ score , Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            answer = Integer.parseInt(input.getText().toString());
            check();

            if (check == true) {
                score = 10;
            } else {
                score +=0;
            }
            score_counter.setText(String.valueOf(score));
        }
    }


    public void set_randomNumbers()
        {
           random_1 = (int) (Math.random()*49);
           random_2 = (int) (Math.random()*49);
            Log.d("rd1", "set_randomNumbers: "+random_1);
            Log.d("rd2", "set_randomNumbers: "+random_2);
        }


        public void check()
        {
            int sum = random_1+random_2;

            if (answer == sum){

                check = true;
                score += 10;
            }
            else{
            check = false;
            }
            score_counter.setText(String.valueOf(score));
        }



}


