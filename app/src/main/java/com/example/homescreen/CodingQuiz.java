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

        if(questionModelArrayList.size() > currentPosition) {
            if (answerString.equalsIgnoreCase(questionModelArrayList.get(currentPosition).getAnswer()) && (answerString !="")) {
                numberOfCorrectAnswers++;
                currentPosition++;
                setData();
                answerEdt.setText("");
            } else if (answerString != "") {
                currentPosition++;
                setData();
                answerEdt.setText("");
            }
        } else {}

        int x = ((currentPosition) * 100) / questionModelArrayList.size();
        progressBar.setProgress(x);
    }

    public void setUpQuestion(){

        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tx = 5\n\ty = 1\n\tx = 3\n\ty = x\n\n\tWhat is y = ...?","", "3"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tx = y + z\n\tz = x - y\n\n\tWhat is x = ...?", "\n\tVALUES\n\n\tx = 5\n\ty = 1\n\tz = 2", "3"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tx = 1\n\ty = x + 1\n\tz = y\n\tw = z * (-...?)", "\n\tVALUES\n\n\tw = -8\n\tx = 1\n\ty = 4\n\tz = 4", "4"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tb = 5 * a\n\tc = (a + b) * b\n\td = a + b - c * a\n\n\tWhat is c = ...?","\n\tVALUES\n\n\ta = 3" , "270"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\ta = x and y\n\tb = not x\n\tc = x or y\n\tWhat is b = ...?","\n\n\tVALUES\n\tx = True\n\ty = False", "False"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tz = x + \", \" + w + \"!\"\n\tb = k < -3\n\tc = k>= -4\n\td = b and c\n\n\tWhat is z = ...?","\n\tVALUES\n\n\tx = \"Hello\"\n\tw = \"world\"\n\tk = int(\"-3\")", "\"Hello, world!\""));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tyears = int(\"35\")\n\tgreet = ...? + ...? + ...?\n\tlength = len(greet)","\n\tVALUES\n\n\thello = \"Hi\"\n\tname = \"John\"\n\tcomma = \", \"\n\tyears = 35\n\tlength = 8", "hello + comma + name"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tyears = int(\"35\")\n\tgreet = ... + ... + ...\n\tlength = len(greet)\n\tbool = length > 7","\n\tVALUES\n\n\thello = \"Hi\"\n\tname = \"John\"\n\tcomma = \", \"\n\tyears = 35\n\tlength = 8\n\tbool = ...?", "True"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tif (x>y):\n\t\tz = z * 5 - 6\n\telse:\n\tz = z * 10 + 5\n\n\tWhat is z = ...?","\n\tVALUES\n\n\tx = 3\n\t y = 7\n\tz = 10", "105"));
        questionModelArrayList.add(new QuestionModel("\n\tCODE\n\n\tif (x>y):\n\t\ts = \"Max is x.\"\n\telif (y>x):\n\ts = \"Max is y.\"\n\telse:\n\ts = \"Numbers are equal.\"\n\n\tWhat is s = ...?","\n\tVALUES\n\n", "\"Max is x.\""));

    }

    public void setData() {

        if (questionModelArrayList.size() > currentPosition) {

            questionLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString());
            valuesLabel.setText(questionModelArrayList.get(currentPosition).getQuestionString2());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));
            scoreLabel.setText("Score : " + numberOfCorrectAnswers + "/" + questionModelArrayList.size());

        }  else {
            questionLabel.setText("\n\n\tYou have finished\n\tthe quiz!\n\n\tThis is your score :\n\n\t"+numberOfCorrectAnswers+" out of "+questionModelArrayList.size());
            valuesLabel.setText("ANSWERS\n\n1. 3\n2. 3\n3. 4\n4. 270\n5. False\n6. \"Hello, world!\"\n7. hello + comma + name\n8. True\n9. 105\n10. \"Max is x.\"");
        }
    }

}
