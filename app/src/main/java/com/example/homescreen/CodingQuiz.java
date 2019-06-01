package com.example.homescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CodingQuiz extends AppCompatActivity {

    TextView questionLabel, questionCountLabel, scoreLabel;
    EditText answerEdt;
    Button submitButton;
    ProgressBar progressBar;
    ArrayList<QuestionModel> questionModelArrayList;

    int currentPosition = 0;
    int numberOfCorrectAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_quiz);

        questionCountLabel = findViewById(R.id.questionNo);
        questionLabel = findViewById(R.id.codeQuest);
        scoreLabel = findViewById(R.id.score);

        answerEdt = findViewById(R.id.answer);
        submitButton = findViewById(R.id.submit);
        progressBar = findViewById(R.id.progress);

        questionModelArrayList = new ArrayList<>();

        setUpQuestion();
        setData();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });
    }

    public void checkAnswer(){

        String answerString = answerEdt.getText().toString().trim();

        if(answerString.equalsIgnoreCase(questionModelArrayList.get(currentPosition).getAnswer())){
            numberOfCorrectAnswers ++;
            currentPosition++;
            setData();
            answerEdt.setText("");
        }
        else{
            currentPosition++;
            setData();
            answerEdt.setText("");
        }

        int x = ((currentPosition+1) * 100) / questionModelArrayList.size();
        progressBar.setProgress(x);
    }

    public void setUpQuestion(){

        questionModelArrayList.add(new QuestionModel("question 1", "answer 1"));
        questionModelArrayList.add(new QuestionModel("question 2", "answer 2"));
        questionModelArrayList.add(new QuestionModel("question 3", "answer 3"));
        questionModelArrayList.add(new QuestionModel("question 4", "answer 4"));
        questionModelArrayList.add(new QuestionModel("question 5", "answer 5"));
        questionModelArrayList.add(new QuestionModel("question 6", "answer 6"));
        questionModelArrayList.add(new QuestionModel("question 7", "answer 7"));
        questionModelArrayList.add(new QuestionModel("question 8", "answer 8"));
        questionModelArrayList.add(new QuestionModel("question 9", "answer 9"));
        questionModelArrayList.add(new QuestionModel("question 10", "answer 10"));

    }

    public void setData(){

        questionLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString());
        questionCountLabel.setText("Question No : " + (currentPosition+1));
        scoreLabel.setText("Score : " + numberOfCorrectAnswers + "/" + questionModelArrayList.size());

    }

}
