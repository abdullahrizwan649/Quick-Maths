package com.example.quickmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random_1,random_2;
    int answer;
    boolean check;
    static int score;

EditText input;
TextView number_1;
    TextView number_2;


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
        });//



initialize();
set_randomNumbers();

answer =getText(input);



check();

if (check==true)
{
    score +=10;
}

    }

    public int getText(EditText input) {
        return 0;
    }

    public void initialize()
    {
        input = findViewById(R.id.input);
        number_1 = findViewById(R.id.gen_num_1);
        number_2 = findViewById(R.id.gen_num_2);
    }




    public void set_randomNumbers()
    {
       random_1 = (int) (Math.random()*499);
       random_2 = (int) (Math.random()*499);
    }


    public void check()
    {
        int sum = random_1+random_2;

        if (answer == sum)
        {
            check = true;
        }else{
        check = false;
        }
    }
}
