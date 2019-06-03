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

    TextView questionLabel, questionCountLabel, valuesLabel, scoreLabel;
    EditText answerEdt;
    Button submitButton, restartButton;
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

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = 0;
                numberOfCorrectAnswers = 0;
                progressBar.setProgress(0);
                setData();
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

        questionModelArrayList.add(new QuestionModel("\nCODE\n\nx = 5\ny = 1\nx = 3\ny = x\n\nWhat is y = ...?","", "3"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nx = y + z\nz = x - y\n\nWhat is x = ...?", "\nVALUES\n\nx = 5\ny = 1\nz = 2", "3"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nx = 1\ny = x + 1\nz = y\nw = z * (-...?)", "\nVALUES\n\nw = -8\nx = 1\ny = 4\nz = 4", "4"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nb = 5 * a\nc = (a + b) * b\nd = a + b - c * a\n\n What is c = ...?","\nVALUES\n\na = 3" , "270"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\na = x and y\nb = not x\nc = x or y\nWhat is b = ...?","\n\nVALUES\nx = True\ny = False", "False"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nz = x + \", \" + w + \"!\"\nb = k < -3\nc = k>= -4\nd = b and c\n\nWhat is z = ...?","\nVALUES\n\nx = \"Hello\"\nw = \"world\"\nk = int(\"-3\")\n", "\"Hello, world!\""));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nyears = int(\"35\")\ngreet = ...? + ...? + ...?\nlength = len(greet)","\nVALUES\n\nhello = \"Hi\"\nname = \"John\"\ncomma = \", \"\nyears = 35\nlength = 8", "hello + comma + name"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nyears = int(\"35\")\ngreet = ... + ... + ...\nlength = len(greet)\nbool = length > 7","\nVALUES\n\nhello = \"Hi\"\nname = \"John\"\ncomma = \", \"\nyears = 35\nlength = 8\nbool = ...?", "True"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nif (x>y):\n\tz = z * 5 - 6\nelse:\n\tz = z * 10 + 5\n\nWhat is z = ...?","\nVALUES\n\nx = 3\n y = 7\n z = 10", "105"));
        questionModelArrayList.add(new QuestionModel("\nCODE\n\nif (x>y):\n\ts = \"Max is x.\"\nelif (y>x):\n\ts = \"Max is y.\"\nelse:\n\ts = \"Numbers are equal.\"\n\nWhat is s = ...?","\nVALUES\n\n", "\"Max is x.\""));

    }

    public void setData() {

        if (questionModelArrayList.size() > currentPosition) {

            questionLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString());
            valuesLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString2());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));
            scoreLabel.setText("Score : " + numberOfCorrectAnswers + "/" + questionModelArrayList.size());

        } else {

            questionLabel.setText("\n\nYou have finished\nthe quiz!\n\nThis is your score :\n\n"+numberOfCorrectAnswers+" out of "+questionModelArrayList.size());
            valuesLabel.setText("ANSWERS\n\n1. 3\n2. 3\n3. 4\n4. 270\n5. False\n6. \"Hello, world!\"\n7. hello + comma + name\n8. True\n9. 105\n10. \"Max is x.\"");
        }
    }

}
