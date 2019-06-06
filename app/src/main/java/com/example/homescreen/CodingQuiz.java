package com.example.homescreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CodingQuiz extends AppCompatActivity {

    TextView questionLabel, questionCountLabel, valuesLabel, scoreLabel;
    EditText answerEdt;
    Button submitButton, restartButton, homeButton;
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
        valuesLabel = findViewById(R.id.codeQuest2);
        scoreLabel = findViewById(R.id.score);

        answerEdt = findViewById(R.id.answer);
        submitButton = findViewById(R.id.submit);
        restartButton = findViewById(R.id.restart);
        homeButton = findViewById(R.id.home_quiz);
        progressBar = findViewById(R.id.progress);

        questionModelArrayList = new ArrayList<>();

        setUpQuestion();
        setData();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(questionModelArrayList.size() > (currentPosition+1)) {
                    checkAnswer();
                } else {
                    checkAnswer();
                    scoreLabel.setText("Score : " + numberOfCorrectAnswers + "/" + questionModelArrayList.size());
                    answerEdt.setVisibility(View.INVISIBLE);
                    submitButton.setVisibility(View.INVISIBLE);


                }
            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = 0;
                numberOfCorrectAnswers = 0;
                progressBar.setProgress(0);
                setData();
                answerEdt.setVisibility(View.VISIBLE);
                submitButton.setVisibility(View.VISIBLE);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodingQuiz.this, HomeScreen.class));
            }
        });
    }

    public void checkAnswer(){

        String answerString = answerEdt.getText().toString().trim();


        if(questionModelArrayList.size() > (currentPosition)) {
            Toast answertoast = Toast.makeText(CodingQuiz.this, "Wrong! The right answer was : "+questionModelArrayList.get(currentPosition).getAnswer(), Toast.LENGTH_SHORT);
            answertoast.setGravity(Gravity.CENTER,0,0);
            Toast emptytoast = Toast.makeText(CodingQuiz.this, "Please put in an answer", Toast.LENGTH_SHORT);
            emptytoast.setGravity(Gravity.CENTER,0,0);
            if (answerString.equalsIgnoreCase(questionModelArrayList.get(currentPosition).getAnswer()) && (answerEdt.getText().length() != 0)) {
                numberOfCorrectAnswers++;
                currentPosition++;
                setData();
                answerEdt.setText("");
            } else if (answerEdt.getText().length() != 0) {
                answertoast.show();
                currentPosition++;
                setData();
                answerEdt.setText("");
            } else {
                emptytoast.show();
            }
        }

        int x = ((currentPosition) * 100) / questionModelArrayList.size();
        progressBar.setProgress(x);
    }

    public void setUpQuestion(){

        questionModelArrayList.add(new QuestionModel("CODE\n\nx = 5\ny = 1\nx = 3\ny = x","What is the value of y = ...?", "3"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nx = 5\ny = 1\nz = 2\nx = y + z\nz = x - y", "What is the value of x = ...?", "3"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nx = 1\ny = 4\nz = 4\nw = -8\ny = x + 1\nz = y\nw = z * (-...?)", "What needs to be filled in, in the blank spot of w?", "4"));
        questionModelArrayList.add(new QuestionModel("CODE\n\na = 3\nb = 5 * a\nc = (a + b) * b\nd = a + b - c * a","What is the value of c = ...?" , "270"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nx = True\ny = False\na = x and y\nb = not x\nc = x or y","What is the value of b = ...?", "False"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nx = \"Hello\"\nw = \"world\"\nk = int(\"-3\")\nz = x + \", \" + w + \"!\"\nb = k < -3\nc = k>= -4\nd = b and c","What is the value of z = ...?", "\"Hello, world!\""));
        questionModelArrayList.add(new QuestionModel("CODE\n\nhello = \"Hi\"\nname = \"John\"\ncomma = \", \"\nyears = 35\nlength = 8\ngreet = ...? + ...? + ...?\nlength = len(greet)\ngreet = \"Hi, John\"","What needs to be filled in\ngreet = ... .. ... .. ...?", "hello + comma + name"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nhello = \"Hi\"\nname = \"John\"\ncomma = \", \"\nyears = 35\nlength = 8\nbool = length > 7\ngreet = hello + comma + name\nlength = len(greet)\nbool = ...?","What is the value of bool = ...?", "True"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nx = 3\ny = 7\nz = 10\n\nif (x>y):\n\tz = z * 5 - 6\nelse:\n\tz = z * 10 + 5","What is the value of z = ...?", "105"));
        questionModelArrayList.add(new QuestionModel("CODE\n\nif (x>y):\n\ts = \"Max is x.\"\nelse if (y>x):\n\ts = \"Max is y.\"\nelse:\n\ts = \"Numbers are  equal.\"","What is the value of s = ...?", "\"Max is x.\""));


    }

    public void saveScore() {
        SharedPreferences highScore = PreferenceManager.getDefaultSharedPreferences(this);
        if(numberOfCorrectAnswers > highScore.getInt("highScore",0)) {
            SharedPreferences.Editor editor = highScore.edit();
            editor.putInt("highScore", numberOfCorrectAnswers);
            editor.apply();
        } else {}
    }

    public int getScore() {
        SharedPreferences highScore = PreferenceManager.getDefaultSharedPreferences(this);
        int score = highScore.getInt("highScore", 0);
        return score;
    }

    public void setData() {

        if (questionModelArrayList.size() > currentPosition) {

            questionLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString());
            valuesLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString2());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));
            scoreLabel.setText("Score : " + numberOfCorrectAnswers + "/" + questionModelArrayList.size());

        } else {
            questionLabel.setText("\n\nYou have finished\nthe quiz!\n\nThis is your score :\n\n"+numberOfCorrectAnswers+" out of "+questionModelArrayList.size());
            if (getScore() != 0){
                valuesLabel.setText("Your highscore is : "+String.valueOf(getScore()));
                saveScore();
            } else {
                saveScore();
                valuesLabel.setText("");
            }
        }
    }



}
