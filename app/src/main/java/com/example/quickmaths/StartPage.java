    package com.example.quickmaths;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    import java.util.Objects;

    public class StartPage extends AppCompatActivity {

int questions;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_start_page);

            Objects.requireNonNull(getSupportActionBar()).hide();


            setContentView(R.layout.activity_start_page);



            Button five_q = (Button) findViewById(R.id.five_q);
            five_q.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(StartPage.this, MainActivity.class);
                    questions = 5;
                    intent.putExtra("questions", questions);
                    startActivity(intent);
                }
            });


            Button ten_q = (Button) findViewById(R.id.ten_q);
            ten_q.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(StartPage.this, MainActivity.class);
                    questions = 10;
                    intent.putExtra("questions", questions);
                    startActivity(intent);
                }
            });

            Button twenty_q = (Button) findViewById(R.id.twenty_q);
            twenty_q.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(StartPage.this, MainActivity.class);
                    questions = 20;
                    intent.putExtra("questions", questions);
                    startActivity(intent);
                }
            });


        }
    }