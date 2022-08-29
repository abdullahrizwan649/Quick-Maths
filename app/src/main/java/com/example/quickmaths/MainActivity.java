package com.example.quickmaths;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
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
    int sum;
    static int counter = 0;


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

        Intent mIntent = getIntent();
        int questions = mIntent.getIntExtra("questions",1000);

        checkbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                    String input_txt = input.getText().toString().trim();
                    if(!input_txt.isEmpty())
                    {
                        run();
                        input.getText().clear();
                        set_randomNumbers();
                        // Toast.makeText(MainActivity.this, "prntcntr "+counter, Toast.LENGTH_SHORT).show();

                        counter++;
                        //Toast.makeText(MainActivity.this, "prntcntr "+counter, Toast.LENGTH_SHORT).show();

                        if(counter==questions)
                        {   counter = 0;
                            Intent intent;
                            intent = new Intent(MainActivity.this, correct_answer.class);
                            intent.putExtra("score_intent", score);
                            startActivity(intent);

                          //  Toast.makeText(MainActivity.this, "prntcntr "+counter, Toast.LENGTH_SHORT).show();

                        }

//                    Toast.makeText(MainActivity.this, "answer" + answer + "sum" +sum, Toast.LENGTH_SHORT).show();
                   }else {
                        Toast.makeText(MainActivity.this, "ENTER VALUE! STEWPID", Toast.LENGTH_SHORT).show();

                    }
            }
        });


    }

    public void run() {


            answer = Integer.parseInt(input.getText().toString());

            sum = random_1 + random_2;


        if (answer == sum) check = true;
        else check = false;

            if (check == true)
            {
                score += 10;
            }
            score_counter.setText(String.valueOf(score));
    }


        public void set_randomNumbers()
        {
           random_1 = (int) (Math.random()*499);
           random_2 = (int) (Math.random()*499);
           number_1.setText(String.valueOf(random_1));
           number_2.setText(String.valueOf(random_2));
            Log.d("rd1", "set_randomNumbers: "+random_1);
            Log.d("rd2", "set_randomNumbers: "+random_2);
        }





}


