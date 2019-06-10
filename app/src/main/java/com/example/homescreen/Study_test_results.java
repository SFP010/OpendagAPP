package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//https://github.com/JohnsAndroidStudioTutorials/ChangeTextViewOnButtonClick i used this github repository to figure out how to change text

public class Study_test_results extends AppCompatActivity {



    private Button HomeButton;
    private Button ContinueButton;

    private int CMItotal = QuizActivity.CMIscore + QuizActivity.CMIscore2;
    private int COMtotal = QuizActivity.COMscore + QuizActivity.COMscore2;
    private int IGOtotal = QuizActivity.IGOscore + QuizActivity.IGOscore2;
    private int LVGtotal = QuizActivity.LVGscore + QuizActivity.LVGscore2;
    private int ISOtotal = QuizActivity.ISOscore + QuizActivity.ISOscore2;
    private int IVLtotal = QuizActivity.IVLscore + QuizActivity.IVLscore2;
    private int RMItotal = QuizActivity.RMIscore + QuizActivity.RMIscore2;
    private int Biggest = CMItotal;
    private String Biggest2 = "CMItotal";
    public static int ACTIVITY_CHECK = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test_results);
        HomeButton = (Button)findViewById(R.id.home_button);
        ContinueButton = (Button)findViewById(R.id.continue_button);
        changeTextOnce();


        HomeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ACTIVITY_CHECK = 10;
                Homebutton();
            }
        });

        ContinueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ACTIVITY_CHECK = 11;
                Continuebutton();
            }
        });
    }


    public void changeTextOnce(){
        final TextView changingText1 = (TextView) findViewById(R.id.text_to_change);
        final TextView changingText2 = (TextView) findViewById(R.id.text_to_change2);
        final TextView changingText3 = (TextView) findViewById(R.id.text_to_change3);
        final TextView textchange = (TextView) findViewById(R.id.text_to_show);
        Button changeTextButton = (Button) findViewById(R.id.change_text_button);


        if (COMtotal > Biggest){
            Biggest2 = "COMtotal";
            Biggest = COMtotal;
        }else if (IGOtotal > Biggest) {
            Biggest2 = "IGOtotal";
            Biggest = IGOtotal;
        }else if (LVGtotal > Biggest) {
            Biggest2 = "LVGtotal";
            Biggest = LVGtotal;
        }else if (ISOtotal > Biggest) {
            Biggest2 = "ISOtotal";
            Biggest = ISOtotal;
        }else if (IVLtotal > Biggest) {
            Biggest2 = "IVLtotal";
            Biggest = IVLtotal;
        }else if (RMItotal > Biggest){
            Biggest2 = "RMItotal";
            Biggest = RMItotal;
        }else{
            ;
        }

        if (Biggest2.equals("CMItotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Informatica");
                    changingText2.setText("Creative media and games technology");
                    changingText3.setText("Technical informatica");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2.equals("COMtotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Accountancy");
                    changingText2.setText("Business administration");
                    changingText3.setText("Commercial economy");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2.equals("IGOtotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Engineering");
                    changingText2.setText("Civil engineering");
                    changingText3.setText("Urban design");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2.equals("LVGtotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Nursing school");
                    changingText2.setText("Obstetrics");
                    changingText3.setText("Medical support");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2.equals("ISOtotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Social work");
                    changingText2.setText("Social work and services");
                    changingText3.setText("Pedagogy");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2.equals("IVLtotal")) {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Teacher training primary education");
                    changingText2.setText("Academic teacher training");
                    changingText3.setText("English teacher training");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else { //if (Biggest == "RMItotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Maritime officer" );
                    changingText2.setText("Logistics engineering");
                    changingText3.setText("Maritime technology");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }
    }




    private void Homebutton() {
        Intent gohome = new Intent(this, HomeScreen.class);
        startActivity(gohome);
    }

    private void Continuebutton() {
        Intent gostudy = new Intent(this, QuizActivity.class);
        startActivity(gostudy);
    }
}


