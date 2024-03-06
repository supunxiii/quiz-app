package com.example.quizapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int SCORE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnStartQ = findViewById(R.id.btnStartQuiz);

        TextView txtFirstName = findViewById(R.id.txtFirstname);
        TextView txtSurname = findViewById(R.id.txtSurname);
        TextView txtAge = findViewById(R.id.txtAge);

        btnStartQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from input fields
                String firstName, surname;
                int age;
                if (txtFirstName.getText().toString().equals(null) ||
                        txtFirstName.getText().toString().equals(""))
                    firstName = "";
                else
                    firstName = txtFirstName.getText().toString();
                if (txtSurname.getText().toString().equals(null) ||
                        txtSurname.getText().toString().equals(""))
                    surname = "";
                else
                    surname = txtSurname.getText().toString();
                if (txtAge.getText().toString().equals(null) ||
                        txtAge.getText().toString().equals(""))
                    age = 0;
                else
                    age = Integer.parseInt(txtAge.getText().toString());

                Intent quizIntent = new Intent(getApplicationContext(), QuizActivity.class);
                quizIntent.putExtra("FIRSTNAME", firstName);
                quizIntent.putExtra("SURNAME", surname);
                quizIntent.putExtra("AGE", age);
                startActivityForResult(quizIntent, SCORE_REQUEST);
                startActivity(quizIntent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent scoreIntent) {
        super.onActivityResult(requestCode, resultCode, scoreIntent);
        if (requestCode == SCORE_REQUEST && resultCode == Activity.RESULT_OK) {
            TextView txtResults = findViewById(R.id.txtResults);
            int exScore = scoreIntent.getIntExtra("EXTRA_SCORE", 0);
            txtResults.setText(Integer.toString(exScore));
        }
    }

}