package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class QuizView extends AppCompatActivity implements View.OnClickListener {
    TextView txtview;
    Button opt1, opt2, opt3, opt4;
   public int count = 0;
    public static int score = 0;
    String answer;
    QuizAL questions;
    public static int getScore(){
        return score;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_view);
        opt1 = findViewById(R.id.opt1);
        opt1.setOnClickListener(this);
        opt2 = findViewById(R.id.opt2);
        opt2.setOnClickListener(this);
        opt3 = findViewById(R.id.opt3);
        opt3.setOnClickListener(this);
        opt4 = findViewById(R.id.opt4);
        opt4.setOnClickListener(this);
        txtview = findViewById(R.id.txtview);
        questions = new QuizAL();
        questions.sync();
        Quiz q1 = questions.getQuiz(count);
        String ques = q1.getQues();
        String option1 = q1.getOPT1();
        String option2 = q1.getOPT2();
        String option3 = q1.getOPT3();
        String option4 = q1.getOPT4();

        answer = q1.getAns();

        txtview.setText(ques);

        opt1.setText(option1);
        opt2.setText(option2);
        opt3.setText(option3);
        opt4.setText(option4);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId( )) {
            case R.id.opt1:
                String u_opt = (String) opt1.getText();
                if (u_opt.equals(answer)) {
                    if (count <=4 ) {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        score++;
                        count++;
                        break;
                    }
                    else {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);
                        startActivity(intent);

                    }
                }
                else
                {
                    if(count<=4)
                    {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }

                }

            case R.id.opt2:
                u_opt = (String) opt1.getText();
                if (u_opt.equals(answer)) {
                    if (count <=4 ) {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        score++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
                else
                {
                    if(count<=4)
                    {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
            case R.id.opt3:
                u_opt = (String) opt1.getText();
                if (u_opt.equals(answer)) {
                    if (count <=4) {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        score++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
                else
                {
                    if(count<=4)
                    {


                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
            case R.id.opt4:
                u_opt = (String) opt1.getText();
                if (u_opt.equals(answer)) {
                    if (count <=4) {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        score++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
                else {
                    if(count<=4) {

                        Quiz q1 = questions.getQuiz(count);
                        String ques = q1.getQues();
                        String option1 = q1.getOPT1();
                        String option2 = q1.getOPT2();
                        String option3 = q1.getOPT3();
                        String option4 = q1.getOPT4();

                        answer = q1.getAns();

                        txtview.setText(ques);

                        opt1.setText(option1);
                        opt2.setText(option2);
                        opt3.setText(option3);
                        opt4.setText(option4);
                        count++;
                        break;
                    }
                    else
                    {
                        Intent intent = new Intent(QuizView.this, Results.class);
                        intent.putExtra("Score", score);

                        startActivity(intent);

                    }
                }
        }


        }
}