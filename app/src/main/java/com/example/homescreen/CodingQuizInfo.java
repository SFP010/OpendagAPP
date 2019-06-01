package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodingQuizInfo extends AppCompatActivity {

    Button startquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_quiz_info);

        startquiz = findViewById(R.id.startQuiz);

        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
         });

    }

    public void openQuiz() {
        Intent intent = new Intent(this, CodingQuiz.class);
        startActivity(intent);
    }

}
