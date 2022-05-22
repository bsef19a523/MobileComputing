package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Results extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        textView = findViewById(R.id.textView3);
        Intent intent = getIntent();
        int score = QuizView.getScore();
        //int intValue = intent.getIntExtra("Score", 0);
        String s=String.valueOf(score);
        textView.setText(s);
    }

    public void Retry(View view) {
        Intent intent = new Intent(Results.this, QuizView.class);
        startActivity(intent);
    }
}