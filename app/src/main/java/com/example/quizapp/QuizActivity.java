package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class QuizActivity extends AppCompatActivity {
    int a1=0;
    int a2=0;
    int a3=0;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Button btnEndQuiz = findViewById(R.id.btnEndQuiz);


        TextView txtName=findViewById(R.id.txtName);
        TextView txtQ1=findViewById(R.id.txtQ1);
        TextView txtQ2=findViewById(R.id.txtQ2);
        TextView txtQ3=findViewById(R.id.txtQ3);
        Intent intent=getIntent();
        txtName.setText("Hi "+intent.getStringExtra("FIRSTNAME"));

        if(intent.getIntExtra("AGE",0)<11){
            txtQ1.setText("2+3");
            a1=5;
            txtQ2.setText("4-2");
            a2=2;
            txtQ3.setText("5+1");
            a3=6;
        }
        else{
            txtQ1.setText("12+13");
            a1=25;
            txtQ2.setText("24-21");
            a2=3;
            txtQ3.setText("25+12");
            a3=37;
        }
            btnEndQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtA1=findViewById(R.id.txtA1);
                TextView txtA2=findViewById(R.id.txtA2);
                TextView txtA3=findViewById(R.id.txtA3);

                if(Integer.parseInt(txtA1.getText().toString())==a1){
                    score++;
                }
                if(Integer.parseInt(txtA2.getText().toString())==a2){
                    score++;
                }
                if(Integer.parseInt(txtA3.getText().toString())==a3){
                    score++;
                }
                Intent scoreIntent=new Intent(getApplicationContext(),MainActivity.class);
                scoreIntent.putExtra("EXTRA_SCORE",score);
                setResult(Activity.RESULT_OK,scoreIntent);
                finish();
            }
        });
    }
}