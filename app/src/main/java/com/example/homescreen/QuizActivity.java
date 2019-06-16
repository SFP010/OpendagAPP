package com.example.homescreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mPreviousButton;
    private Button mNextButton;
    ProgressBar progressBar;

    public static Boolean clicked1=false; public static Boolean clicked2=false; public static Boolean clicked3=false; public static Boolean clicked4=false;
    public static Boolean clicked5=false; public static Boolean clicked6=false; public static Boolean clicked7=false; public static Boolean clicked8=false;
    public static Boolean clicked9=false; public static Boolean clicked10=false; public static Boolean clicked11=false; public static Boolean clicked12=false;
    public static Boolean clicked13=false; public static Boolean clicked14=false; public static Boolean clicked15=false; public static Boolean clicked16=false;
    public static Boolean clicked17=false; public static Boolean clicked18=false; public static Boolean clicked19=false; public static Boolean clicked20=false;
    public static Boolean clicked21=false; public static Boolean clicked22=false; public static Boolean clicked23=false; public static Boolean clicked24=false;
    public static Boolean clicked25=false; public static Boolean clicked26=false; public static Boolean clicked27=false; public static Boolean clicked28=false;
    public static Boolean clicked29=false; public static Boolean clicked30=false; public static Boolean clicked31=false; public static Boolean clicked32=false;
    public static Boolean clicked33=false; public static Boolean clicked34=false; public static Boolean clicked35=false; public static Boolean clicked36=false;
    public static Boolean clicked37=false; public static Boolean clicked38=false; public static Boolean clicked39=false; public static Boolean clicked40=false;
    public static Boolean clicked41=false; public static Boolean clicked42=false; public static Boolean clicked43=false; public static Boolean clicked44=false;
    public static Boolean clicked45=false; public static Boolean clicked46=false; public static Boolean clicked47=false; public static Boolean clicked48=false;
    public static Boolean clicked49=false; public static Boolean clicked50=false; public static Boolean clicked51=false; public static Boolean clicked52=false;
    public static Boolean clicked53=false; public static Boolean clicked54=false; public static Boolean clicked55=false; public static Boolean clicked56=false;

    public static int CMIscore = 0;     public static int CMIscore2 = 0;
    public static int COMscore = 0;     public static int COMscore2 = 0;
    public static int IGOscore = 0;     public static int IGOscore2 = 0;
    public static int LVGscore = 0;     public static int LVGscore2 = 0;
    public static int ISOscore = 0;     public static int ISOscore2 = 0;
    public static int IVLscore = 0;     public static int IVLscore2 = 0;
    public static int RMIscore = 0;     public static int RMIscore2 = 0;


    public static int mScore = 1;

    public static int mQuestionNumber = 0;

    @Override
    protected void onResume()
    {
        if (Study_test_results.ACTIVITY_CHECK == 11){
            mQuestionNumber = 13;
            mScore = 14;
            updateScore(mScore);
            NextPage();
        } else {
            clicked1 = false;
            clicked2 = false;
            clicked3 = false;
            clicked4 = false;
            clicked5 = false;
            clicked6 = false;
            clicked7 = false;
            clicked8 = false;
            clicked9 = false;
            clicked10 = false;
            clicked11 = false;
            clicked12 = false;
            clicked13 = false;
            clicked14 = false;
            clicked15 = false;
            clicked16 = false;
            clicked17 = false;
            clicked18 = false;
            clicked19 = false;
            clicked20 = false;
            clicked21 = false;
            clicked22 = false;
            clicked23 = false;
            clicked24 = false;
            clicked25 = false;
            clicked26 = false;
            clicked27 = false;
            clicked28 = false;
            clicked29 = false;
            clicked30 = false;
            clicked31 = false;
            clicked32 = false;
            clicked33 = false;
            clicked34 = false;
            clicked35 = false;
            clicked36 = false;
            clicked37 = false;
            clicked38 = false;
            clicked39 = false;
            clicked40 = false;
            clicked41 = false;
            clicked42 = false;
            clicked43 = false;
            clicked44 = false;
            clicked45 = false;
            clicked46 = false;
            clicked47 = false;
            clicked48 = false;
            clicked49 = false;
            clicked50 = false;
            clicked51 = false;
            clicked52 = false;
            clicked53 = false;
            clicked54 = false;
            clicked55 = false;
            clicked56 = false;

            CMIscore = 0;
            CMIscore2 = 0;
            COMscore = 0;
            COMscore2 = 0;
            IGOscore = 0;
            IGOscore2 = 0;
            LVGscore = 0;
            LVGscore2 = 0;
            ISOscore = 0;
            ISOscore2 = 0;
            IVLscore = 0;
            IVLscore2 = 0;
            RMIscore = 0;
            RMIscore2 = 0;

            mScore = 1;
            mQuestionNumber = 0;

            NextPage();
        }

        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        progressBar = findViewById(R.id.progressbar);

        NextPage();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 1){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked1 || clicked2 || clicked3 || clicked4){
                        if (clicked1) {
                            NextPage();
                        }else if (clicked2) {
                            clicked1 = true;
                            clicked2 = false;
                            CMIscore = CMIscore -2;
                            NextPage();
                        }else if (clicked3){
                            clicked1 = true;
                            clicked3 = false;
                            CMIscore = CMIscore -3;
                            CMIscore = CMIscore -2;
                            NextPage();
                        }else {
                            clicked1 = true;
                            clicked4 = false;
                            CMIscore = CMIscore -6;
                            CMIscore = CMIscore -2;
                            NextPage();
                        }
                    }else {
                        clicked1 = true;
                        CMIscore = CMIscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 2){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked5 || clicked6 || clicked7 || clicked8){
                        if (clicked5) {
                            NextPage();
                        }else if (clicked6) {
                            clicked5 = true;
                            clicked6 = false;
                            CMIscore2 = CMIscore2 -2;
                            NextPage();
                        }else if (clicked7){
                            clicked5 = true;
                            clicked7 = false;
                            CMIscore2 = CMIscore2 -3;
                            CMIscore2 = CMIscore2 -2;
                            NextPage();
                        }else {
                            clicked5 = true;
                            clicked8 = false;
                            CMIscore2 = CMIscore2 -6;
                            CMIscore2 = CMIscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked5 = true;
                        CMIscore2 = CMIscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 3){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked9 || clicked10 || clicked11 || clicked12){
                        if (clicked9) {
                            NextPage();
                        }else if (clicked10) {
                            clicked9 = true;
                            clicked10 = false;
                            COMscore = COMscore -2;
                            NextPage();
                        }else if (clicked11){
                            clicked9 = true;
                            clicked11 = false;
                            COMscore = COMscore -3;
                            COMscore = COMscore -2;
                            NextPage();
                        }else {
                            clicked9 = true;
                            clicked12 = false;
                            COMscore = COMscore -6;
                            COMscore = COMscore -2;
                            NextPage();
                        }
                    }else {
                        clicked9 = true;
                        COMscore = COMscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 4){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked13 || clicked14 || clicked15 || clicked16){
                        if (clicked13) {
                            NextPage();
                        }else if (clicked14) {
                            clicked13 = true;
                            clicked14 = false;
                            COMscore2 = COMscore2 -2;
                            NextPage();
                        }else if (clicked15){
                            clicked13 = true;
                            clicked15 = false;
                            COMscore2 = COMscore2 -3;
                            COMscore2 = COMscore2 -2;
                            NextPage();
                        }else {
                            clicked13 = true;
                            clicked16 = false;
                            COMscore2 = COMscore2 -6;
                            COMscore2 = COMscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked13 = true;
                        COMscore2 = COMscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 5){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked17 || clicked18 || clicked19 || clicked20){
                        if (clicked17) {
                            NextPage();
                        }else if (clicked18) {
                            clicked17 = true;
                            clicked18 = false;
                            IGOscore = IGOscore -2;
                            NextPage();
                        }else if (clicked19){
                            clicked17 = true;
                            clicked19 = false;
                            IGOscore = IGOscore -3;
                            IGOscore = IGOscore -2;
                            NextPage();
                        }else {
                            clicked17 = true;
                            clicked20 = false;
                            IGOscore = IGOscore -6;
                            IGOscore = IGOscore -2;
                            NextPage();
                        }
                    }else {
                        clicked17 = true;
                        IGOscore = IGOscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 6){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked21 || clicked22 || clicked23 || clicked24){
                        if (clicked21) {
                            NextPage();
                        }else if (clicked22) {
                            clicked21 = true;
                            clicked22 = false;
                            IGOscore2 = IGOscore2 -2;
                            NextPage();
                        }else if (clicked23){
                            clicked21 = true;
                            clicked23 = false;
                            IGOscore2 = IGOscore2 -3;
                            IGOscore2 = IGOscore2 -2;
                            NextPage();
                        }else {
                            clicked21 = true;
                            clicked24 = false;
                            IGOscore2 = IGOscore2 -6;
                            IGOscore2 = IGOscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked21 = true;
                        IGOscore2 = IGOscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 7){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked25 || clicked26 || clicked27 || clicked28){
                        if (clicked25) {
                            NextPage();
                        }else if (clicked26) {
                            clicked25 = true;
                            clicked26 = false;
                            LVGscore = LVGscore -2;
                            NextPage();
                        }else if (clicked27){
                            clicked25 = true;
                            clicked27 = false;
                            LVGscore = LVGscore -3;
                            LVGscore = LVGscore -2;
                            NextPage();
                        }else {
                            clicked25 = true;
                            clicked28 = false;
                            LVGscore = LVGscore -6;
                            LVGscore = LVGscore -2;
                            NextPage();
                        }
                    }else {
                        clicked25 = true;
                        LVGscore = LVGscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 8){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked29 || clicked30 || clicked31 || clicked32){
                        if (clicked29) {
                            NextPage();
                        }else if (clicked30) {
                            clicked29 = true;
                            clicked30 = false;
                            LVGscore2 = LVGscore2 -2;
                            NextPage();
                        }else if (clicked31){
                            clicked29 = true;
                            clicked31 = false;
                            LVGscore2 = LVGscore2 -3;
                            LVGscore2 = LVGscore2 -2;
                            NextPage();
                        }else {
                            clicked29 = true;
                            clicked32 = false;
                            LVGscore2 = LVGscore2 -6;
                            LVGscore2 = LVGscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked29 = true;
                        LVGscore2 = LVGscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 9){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked33 || clicked34 || clicked35 || clicked36){
                        if (clicked33) {
                            NextPage();
                        }else if (clicked34) {
                            clicked33 = true;
                            clicked34 = false;
                            ISOscore = ISOscore -2;
                            NextPage();
                        }else if (clicked35){
                            clicked33 = true;
                            clicked35 = false;
                            ISOscore = ISOscore -3;
                            ISOscore = ISOscore -2;
                            NextPage();
                        }else {
                            clicked33 = true;
                            clicked36 = false;
                            ISOscore = ISOscore -6;
                            ISOscore = ISOscore -2;
                            NextPage();
                        }
                    }else {
                        clicked33 = true;
                        ISOscore = ISOscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 10){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked37 || clicked38 || clicked39 || clicked40){
                        if (clicked37) {
                            NextPage();
                        }else if (clicked38) {
                            clicked37 = true;
                            clicked38 = false;
                            ISOscore2 = ISOscore2 -2;
                            NextPage();
                        }else if (clicked39){
                            clicked37 = true;
                            clicked39 = false;
                            ISOscore2 = ISOscore2 -3;
                            ISOscore2 = ISOscore2 -2;
                            NextPage();
                        }else {
                            clicked37 = true;
                            clicked40 = false;
                            ISOscore2 = ISOscore2 -6;
                            ISOscore2 = ISOscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked37 = true;
                        ISOscore2 = ISOscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 11){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked41 || clicked42 || clicked43 || clicked44){
                        if (clicked41) {
                            NextPage();
                        }else if (clicked42) {
                            clicked41 = true;
                            clicked42 = false;
                            IVLscore = IVLscore -2;
                            NextPage();
                        }else if (clicked43){
                            clicked41 = true;
                            clicked43 = false;
                            IVLscore = IVLscore -3;
                            IVLscore = IVLscore -2;
                            NextPage();
                        }else {
                            clicked41 = true;
                            clicked44 = false;
                            IVLscore = IVLscore -6;
                            IVLscore = IVLscore -2;
                            NextPage();
                        }
                    }else {
                        clicked41 = true;
                        IVLscore = IVLscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 12){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked45 || clicked46 || clicked47 || clicked48){
                        if (clicked45) {
                            NextPage();
                        }else if (clicked46) {
                            clicked45 = true;
                            clicked46 = false;
                            IVLscore2 = IVLscore2 -2;
                            NextPage();
                        }else if (clicked47){
                            clicked45 = true;
                            clicked47 = false;
                            IVLscore2 = IVLscore2 -3;
                            IVLscore2 = IVLscore2 -2;
                            NextPage();
                        }else {
                            clicked45 = true;
                            clicked48 = false;
                            IVLscore2 = IVLscore2 -6;
                            IVLscore2 = IVLscore2 -2;
                            NextPage();
                        }
                    }else {
                        clicked45 = true;
                        IVLscore2 = IVLscore2 -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 13){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked49 || clicked50 || clicked51 || clicked52){
                        if (clicked49) {
                            NextPage();
                        }else if (clicked50) {
                            clicked49 = true;
                            clicked50 = false;
                            RMIscore = RMIscore -2;
                            NextPage();
                        }else if (clicked51){
                            clicked49 = true;
                            clicked51 = false;
                            RMIscore = RMIscore -3;
                            RMIscore = RMIscore -2;
                            NextPage();
                        }else {
                            clicked49 = true;
                            clicked52 = false;
                            RMIscore = RMIscore -6;
                            RMIscore = RMIscore -2;
                            NextPage();
                        }
                    }else {
                        clicked49 = true;
                        RMIscore = RMIscore -2;
                        NextPage();
                    }
                }else if (mQuestionNumber == 14){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked53 || clicked54 || clicked55 || clicked56){
                        if (clicked53) {
                            GoStudyPage();
                        }else if (clicked54) {
                            clicked53 = true;
                            clicked54 = false;
                            RMIscore2 = RMIscore2 -2;
                            GoStudyPage();
                        }else if (clicked55){
                            clicked53 = true;
                            clicked55 = false;
                            RMIscore2 = RMIscore2 -3;
                            RMIscore2 = RMIscore2 -2;
                            GoStudyPage();
                        }else {
                            clicked53 = true;
                            clicked56 = false;
                            RMIscore2 = RMIscore2 -6;
                            RMIscore2 = RMIscore2 -2;
                            GoStudyPage();
                        }
                    }else {
                        clicked53 = true;
                        RMIscore2 = RMIscore2 -2;
                        GoStudyPage();
                    }
                }else {

                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 1){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked1 || clicked2 || clicked3 || clicked4){
                        if (clicked2) {
                            NextPage();
                        }else if (clicked1) {
                            clicked2 = true;
                            clicked1 = false;
                            CMIscore = CMIscore +2;
                            NextPage();
                        }else if (clicked3){
                            clicked2 = true;
                            clicked3 = false;
                            CMIscore = CMIscore -3;
                            NextPage();
                        }else {
                            clicked2 = true;
                            clicked4 = false;
                            CMIscore = CMIscore -6;
                            NextPage();
                        }
                    }else {
                        clicked2 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 2){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked5 || clicked6 || clicked7 || clicked8){
                        if (clicked6) {
                            NextPage();
                        }else if (clicked5) {
                            clicked6 = true;
                            clicked5 = false;
                            CMIscore2 = CMIscore2 +2;
                            NextPage();
                        }else if (clicked7){
                            clicked6 = true;
                            clicked7 = false;
                            CMIscore2 = CMIscore2 -3;
                            NextPage();
                        }else {
                            clicked6 = true;
                            clicked8 = false;
                            CMIscore2 = CMIscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked6 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 3){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked9 || clicked10 || clicked11 || clicked12){
                        if (clicked10) {
                            NextPage();
                        }else if (clicked9) {
                            clicked10 = true;
                            clicked9 = false;
                            COMscore = COMscore +2;
                            NextPage();
                        }else if (clicked11){
                            clicked10 = true;
                            clicked11 = false;
                            COMscore = COMscore -3;
                            NextPage();
                        }else {
                            clicked10 = true;
                            clicked12 = false;
                            COMscore = COMscore -6;
                            NextPage();
                        }
                    }else {
                        clicked10 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 4){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked13 || clicked14 || clicked15 || clicked16){
                        if (clicked14) {
                            NextPage();
                        }else if (clicked13) {
                            clicked14 = true;
                            clicked13 = false;
                            COMscore2 = COMscore2 +2;
                            NextPage();
                        }else if (clicked15){
                            clicked14 = true;
                            clicked15 = false;
                            COMscore2 = COMscore2 -3;
                            NextPage();
                        }else {
                            clicked14 = true;
                            clicked16 = false;
                            COMscore2 = COMscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked14 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 5){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked17 || clicked18 || clicked19 || clicked20){
                        if (clicked18) {
                            NextPage();
                        }else if (clicked17) {
                            clicked18 = true;
                            clicked17 = false;
                            IGOscore = IGOscore +2;
                            NextPage();
                        }else if (clicked19){
                            clicked18 = true;
                            clicked19 = false;
                            IGOscore = IGOscore -3;
                            NextPage();
                        }else {
                            clicked18 = true;
                            clicked20 = false;
                            IGOscore = IGOscore -6;
                            NextPage();
                        }
                    }else {
                        clicked17 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 6){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked21 || clicked22 || clicked23 || clicked24){
                        if (clicked22) {
                            NextPage();
                        }else if (clicked21) {
                            clicked22 = true;
                            clicked21 = false;
                            IGOscore2 = IGOscore2 +2;
                            NextPage();
                        }else if (clicked23){
                            clicked22 = true;
                            clicked23 = false;
                            IGOscore2 = IGOscore2 -3;
                            NextPage();
                        }else {
                            clicked22 = true;
                            clicked24 = false;
                            IGOscore2 = IGOscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked22 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 7){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked25 || clicked26 || clicked27 || clicked28){
                        if (clicked26) {
                            NextPage();
                        }else if (clicked25) {
                            clicked26 = true;
                            clicked25 = false;
                            LVGscore = LVGscore +2;
                            NextPage();
                        }else if (clicked27){
                            clicked26 = true;
                            clicked27 = false;
                            LVGscore = LVGscore -3;
                            NextPage();
                        }else {
                            clicked26 = true;
                            clicked28 = false;
                            LVGscore = LVGscore -6;
                            NextPage();
                        }
                    }else {
                        clicked26 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 8){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked29 || clicked30 || clicked31 || clicked32){
                        if (clicked30) {
                            NextPage();
                        }else if (clicked29) {
                            clicked30 = true;
                            clicked29 = false;
                            LVGscore2 = LVGscore2 +2;
                            NextPage();
                        }else if (clicked31){
                            clicked30 = true;
                            clicked31 = false;
                            LVGscore2 = LVGscore2 -3;
                            NextPage();
                        }else {
                            clicked30 = true;
                            clicked32 = false;
                            LVGscore2 = LVGscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked30 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 9){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked33 || clicked34 || clicked35 || clicked36){
                        if (clicked34) {
                            NextPage();
                        }else if (clicked33) {
                            clicked34 = true;
                            clicked33 = false;
                            ISOscore = ISOscore +2;
                            NextPage();
                        }else if (clicked35){
                            clicked34 = true;
                            clicked35 = false;
                            ISOscore = ISOscore -3;
                            NextPage();
                        }else {
                            clicked34 = true;
                            clicked36 = false;
                            ISOscore = ISOscore -6;
                            NextPage();
                        }
                    }else {
                        clicked34 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 10){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked37 || clicked38 || clicked39 || clicked40){
                        if (clicked38) {
                            NextPage();
                        }else if (clicked37) {
                            clicked38 = true;
                            clicked37 = false;
                            ISOscore2 = ISOscore2 +2;
                            NextPage();
                        }else if (clicked39){
                            clicked38 = true;
                            clicked39 = false;
                            ISOscore2 = ISOscore2 -3;
                            NextPage();
                        }else {
                            clicked38 = true;
                            clicked40 = false;
                            ISOscore2 = ISOscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked38 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 11){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked41 || clicked42 || clicked43 || clicked44){
                        if (clicked42) {
                            NextPage();
                        }else if (clicked41) {
                            clicked42 = true;
                            clicked41 = false;
                            IVLscore = IVLscore +2;
                            NextPage();
                        }else if (clicked43){
                            clicked42 = true;
                            clicked43 = false;
                            IVLscore = IVLscore -3;
                            NextPage();
                        }else {
                            clicked42 = true;
                            clicked44 = false;
                            IVLscore = IVLscore -6;
                            NextPage();
                        }
                    }else {
                        clicked42 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 12){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked45 || clicked46 || clicked47 || clicked48){
                        if (clicked46) {
                            NextPage();
                        }else if (clicked45) {
                            clicked46 = true;
                            clicked45 = false;
                            IVLscore2 = IVLscore2 +2;
                            NextPage();
                        }else if (clicked47){
                            clicked46 = true;
                            clicked47 = false;
                            IVLscore2 = IVLscore2 -3;
                            NextPage();
                        }else {
                            clicked46 = true;
                            clicked48 = false;
                            IVLscore2 = IVLscore2 -6;
                            NextPage();
                        }
                    }else {
                        clicked46 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 13){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked49 || clicked50 || clicked51 || clicked52){
                        if (clicked50) {
                            NextPage();
                        }else if (clicked49) {
                            clicked50 = true;
                            clicked49 = false;
                            RMIscore = RMIscore +2;
                            NextPage();
                        }else if (clicked51){
                            clicked50 = true;
                            clicked51 = false;
                            RMIscore = RMIscore -3;
                            NextPage();
                        }else {
                            clicked50 = true;
                            clicked52 = false;
                            RMIscore = RMIscore -6;
                            NextPage();
                        }
                    }else {
                        clicked50 = true;
                        NextPage();
                    }
                }else if (mQuestionNumber == 14){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked53 || clicked54 || clicked55 || clicked56){
                        if (clicked54) {
                            GoStudyPage();
                        }else if (clicked53) {
                            clicked54 = true;
                            clicked53 = false;
                            RMIscore2 = RMIscore2 +2;
                            GoStudyPage();
                        }else if (clicked55){
                            clicked54 = true;
                            clicked55 = false;
                            RMIscore2 = RMIscore2 -3;
                            GoStudyPage();
                        }else {
                            clicked54 = true;
                            clicked56 = false;
                            RMIscore2 = RMIscore2 -6;
                            GoStudyPage();
                        }
                    }else {
                        clicked54 = true;
                        GoStudyPage();
                    }
                }else {

                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 1){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked1 || clicked2 || clicked3 || clicked4){
                        if (clicked3) {
                            NextPage();
                        } else if (clicked1) {
                            clicked3 = true;
                            clicked1 = false;
                            CMIscore = CMIscore +2;
                            CMIscore = CMIscore +3;
                            NextPage();
                        }else if (clicked2){
                            clicked3 = true;
                            clicked2 = false;
                            CMIscore = CMIscore +3;
                            NextPage();
                        }else {
                            clicked3 = true;
                            clicked4 = false;
                            CMIscore = CMIscore -6;
                            CMIscore = CMIscore +3;
                            NextPage();
                        }
                    }else {
                        clicked3 = true;
                        CMIscore = CMIscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 2){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked5 || clicked6 || clicked7 || clicked8){
                        if (clicked7) {
                            NextPage();
                        } else if (clicked5) {
                            clicked7 = true;
                            clicked5 = false;
                            CMIscore2 = CMIscore2 +2;
                            CMIscore2 = CMIscore2 +3;
                            NextPage();
                        }else if (clicked6){
                            clicked7 = true;
                            clicked6 = false;
                            CMIscore2 = CMIscore2 +3;
                            NextPage();
                        }else {
                            clicked7 = true;
                            clicked8 = false;
                            CMIscore2 = CMIscore2 -6;
                            CMIscore2 = CMIscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked7 = true;
                        CMIscore2 = CMIscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 3){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked9 || clicked10 || clicked11 || clicked12){
                        if (clicked11) {
                            NextPage();
                        } else if (clicked9) {
                            clicked11 = true;
                            clicked9 = false;
                            COMscore = COMscore +2;
                            COMscore = COMscore +3;
                            NextPage();
                        }else if (clicked10){
                            clicked11 = true;
                            clicked10 = false;
                            COMscore = COMscore +3;
                            NextPage();
                        }else {
                            clicked11 = true;
                            clicked12 = false;
                            COMscore = COMscore -6;
                            COMscore = COMscore +3;
                            NextPage();
                        }
                    }else {
                        clicked11 = true;
                        COMscore = COMscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 4){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked13 || clicked14 || clicked15 || clicked16){
                        if (clicked15) {
                            NextPage();
                        } else if (clicked13) {
                            clicked15 = true;
                            clicked13 = false;
                            COMscore2 = COMscore2 +2;
                            COMscore2 = COMscore2 +3;
                            NextPage();
                        }else if (clicked14){
                            clicked15 = true;
                            clicked14 = false;
                            COMscore2 = COMscore2 +3;
                            NextPage();
                        }else {
                            clicked15 = true;
                            clicked16 = false;
                            COMscore2 = COMscore2 -6;
                            COMscore2 = COMscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked15 = true;
                        COMscore2 = COMscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 5){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked17 || clicked18 || clicked19 || clicked20){
                        if (clicked19) {
                            NextPage();
                        } else if (clicked17) {
                            clicked19 = true;
                            clicked17 = false;
                            IGOscore = IGOscore +2;
                            IGOscore = IGOscore +3;
                            NextPage();
                        }else if (clicked18){
                            clicked19 = true;
                            clicked18 = false;
                            IGOscore = IGOscore +3;
                            NextPage();
                        }else {
                            clicked19 = true;
                            clicked20 = false;
                            IGOscore = IGOscore -6;
                            IGOscore = IGOscore +3;
                            NextPage();
                        }
                    }else {
                        clicked19 = true;
                        IGOscore = IGOscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 6){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked21 || clicked22 || clicked23 || clicked24){
                        if (clicked23) {
                            NextPage();
                        } else if (clicked21) {
                            clicked23 = true;
                            clicked21 = false;
                            IGOscore2 = IGOscore2 +2;
                            IGOscore2 = IGOscore2 +3;
                            NextPage();
                        }else if (clicked22){
                            clicked23 = true;
                            clicked22 = false;
                            IGOscore2 = IGOscore2 +3;
                            NextPage();
                        }else {
                            clicked23 = true;
                            clicked24 = false;
                            IGOscore2 = IGOscore2 -6;
                            IGOscore2 = IGOscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked23 = true;
                        IGOscore2 = IGOscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 7){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked25 || clicked26 || clicked27 || clicked28){
                        if (clicked27) {
                            NextPage();
                        } else if (clicked25) {
                            clicked27 = true;
                            clicked25 = false;
                            LVGscore = LVGscore +2;
                            LVGscore = LVGscore +3;
                            NextPage();
                        }else if (clicked26){
                            clicked27 = true;
                            clicked26 = false;
                            LVGscore = LVGscore +3;
                            NextPage();
                        }else {
                            clicked27 = true;
                            clicked28 = false;
                            LVGscore = LVGscore -6;
                            LVGscore = LVGscore +3;
                            NextPage();
                        }
                    }else {
                        clicked27 = true;
                        LVGscore = LVGscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 8){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked29 || clicked30 || clicked31 || clicked32){
                        if (clicked31) {
                            NextPage();
                        } else if (clicked29) {
                            clicked31 = true;
                            clicked29 = false;
                            LVGscore2 = LVGscore2 +2;
                            LVGscore2 = LVGscore2 +3;
                            NextPage();
                        }else if (clicked30){
                            clicked31 = true;
                            clicked30 = false;
                            LVGscore2 = LVGscore2 +3;
                            NextPage();
                        }else {
                            clicked31 = true;
                            clicked32 = false;
                            LVGscore2 = LVGscore2 -6;
                            LVGscore2 = LVGscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked31 = true;
                        LVGscore2 = LVGscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 9){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked33 || clicked34 || clicked35 || clicked36){
                        if (clicked35) {
                            NextPage();
                        } else if (clicked33) {
                            clicked35 = true;
                            clicked33 = false;
                            ISOscore = ISOscore +2;
                            ISOscore = ISOscore +3;
                            NextPage();
                        }else if (clicked34){
                            clicked35 = true;
                            clicked34 = false;
                            ISOscore = ISOscore +3;
                            NextPage();
                        }else {
                            clicked35 = true;
                            clicked36 = false;
                            ISOscore = ISOscore -6;
                            ISOscore = ISOscore +3;
                            NextPage();
                        }
                    }else {
                        clicked35 = true;
                        ISOscore = ISOscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 10){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked37 || clicked38 || clicked39 || clicked40){
                        if (clicked39) {
                            NextPage();
                        } else if (clicked37) {
                            clicked39 = true;
                            clicked37 = false;
                            ISOscore2 = ISOscore2 +2;
                            ISOscore2 = ISOscore2 +3;
                            NextPage();
                        }else if (clicked38){
                            clicked39 = true;
                            clicked38 = false;
                            ISOscore2 = ISOscore2 +3;
                            NextPage();
                        }else {
                            clicked39 = true;
                            clicked40 = false;
                            ISOscore2 = ISOscore2 -6;
                            ISOscore2 = ISOscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked39 = true;
                        ISOscore2 = ISOscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 11){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked41 || clicked42 || clicked43 || clicked44){
                        if (clicked43) {
                            NextPage();
                        } else if (clicked41) {
                            clicked43 = true;
                            clicked41 = false;
                            IVLscore = IVLscore +2;
                            IVLscore = IVLscore +3;
                            NextPage();
                        }else if (clicked42){
                            clicked43 = true;
                            clicked42 = false;
                            IVLscore = IVLscore +3;
                            NextPage();
                        }else {
                            clicked43 = true;
                            clicked44 = false;
                            IVLscore = IVLscore -6;
                            IVLscore = IVLscore +3;
                            NextPage();
                        }
                    }else {
                        clicked43 = true;
                        IVLscore = IVLscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 12){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked45 || clicked46 || clicked47 || clicked48){
                        if (clicked47) {
                            NextPage();
                        } else if (clicked45) {
                            clicked47 = true;
                            clicked45 = false;
                            IVLscore2 = IVLscore2 +2;
                            IVLscore2 = IVLscore2 +3;
                            NextPage();
                        }else if (clicked46){
                            clicked47 = true;
                            clicked46 = false;
                            IVLscore2 = IVLscore2 +3;
                            NextPage();
                        }else {
                            clicked47 = true;
                            clicked48 = false;
                            IVLscore2 = IVLscore2 -6;
                            IVLscore2 = IVLscore2 +3;
                            NextPage();
                        }
                    }else {
                        clicked47 = true;
                        IVLscore2 = IVLscore2 +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 13){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked49 || clicked50 || clicked51 || clicked52){
                        if (clicked51) {
                            NextPage();
                        } else if (clicked49) {
                            clicked51 = true;
                            clicked49 = false;
                            RMIscore = RMIscore +2;
                            RMIscore = RMIscore +3;
                            NextPage();
                        }else if (clicked50){
                            clicked51 = true;
                            clicked50 = false;
                            RMIscore = RMIscore +3;
                            NextPage();
                        }else {
                            clicked51 = true;
                            clicked52 = false;
                            RMIscore = RMIscore -6;
                            RMIscore = RMIscore +3;
                            NextPage();
                        }
                    }else {
                        clicked51 = true;
                        RMIscore = RMIscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 14){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked53 || clicked54 || clicked55 || clicked56){
                        if (clicked55) {
                            GoStudyPage();
                        } else if (clicked53) {
                            clicked55 = true;
                            clicked53 = false;
                            RMIscore2 = RMIscore2 +2;
                            RMIscore2 = RMIscore2 +3;
                            GoStudyPage();
                        }else if (clicked54){
                            clicked55 = true;
                            clicked54 = false;
                            RMIscore2 = RMIscore2 +3;
                            GoStudyPage();
                        }else {
                            clicked55 = true;
                            clicked56 = false;
                            RMIscore2 = RMIscore2 -6;
                            RMIscore2 = RMIscore2 +3;
                            GoStudyPage();
                        }
                    }else {
                        clicked55 = true;
                        RMIscore2 = RMIscore2 +3;
                        GoStudyPage();
                    }
                }else {

                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 1){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked1 || clicked2 || clicked3 || clicked4){
                        if (clicked4) {
                            NextPage();
                        } else if (clicked1) {
                            clicked4 = true;
                            clicked1 = false;
                            CMIscore = CMIscore +2;
                            CMIscore = CMIscore +6;
                            NextPage();
                        }else if (clicked2){
                            clicked4 = true;
                            clicked2 = false;
                            CMIscore = CMIscore +6;
                            NextPage();
                        }else {
                            clicked4 = true;
                            clicked3 = false;
                            CMIscore = CMIscore -3;
                            CMIscore = CMIscore +6;
                            NextPage();
                        }
                    }else {
                        clicked4 = true;
                        CMIscore = CMIscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 2){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked5 || clicked6 || clicked7 || clicked8){
                        if (clicked8) {
                            NextPage();
                        } else if (clicked5) {
                            clicked8 = true;
                            clicked5 = false;
                            CMIscore2 = CMIscore2 +2;
                            CMIscore2 = CMIscore2 +6;
                            NextPage();
                        }else if (clicked6){
                            clicked8 = true;
                            clicked6 = false;
                            CMIscore2 = CMIscore2 +6;
                            NextPage();
                        }else {
                            clicked8 = true;
                            clicked7 = false;
                            CMIscore2 = CMIscore2 -3;
                            CMIscore2 = CMIscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked8 = true;
                        CMIscore2 = CMIscore2 + 6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 3){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked9 || clicked10 || clicked11 || clicked12){
                        if (clicked12) {
                            NextPage();
                        } else if (clicked9) {
                            clicked12 = true;
                            clicked9 = false;
                            COMscore = COMscore +2;
                            COMscore = COMscore +6;
                            NextPage();
                        }else if (clicked10){
                            clicked12 = true;
                            clicked10 = false;
                            COMscore = COMscore +6;
                            NextPage();
                        }else {
                            clicked12 = true;
                            clicked11 = false;
                            COMscore = COMscore -3;
                            COMscore = COMscore +6;
                            NextPage();
                        }
                    }else {
                        clicked12 = true;
                        COMscore = COMscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 4){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked13 || clicked14 || clicked15 || clicked16){
                        if (clicked16) {
                            NextPage();
                        } else if (clicked13) {
                            clicked16 = true;
                            clicked13 = false;
                            COMscore2 = COMscore2 +2;
                            COMscore2 = COMscore2 +6;
                            NextPage();
                        }else if (clicked14){
                            clicked16 = true;
                            clicked14 = false;
                            COMscore2 = COMscore2 +6;
                            NextPage();
                        }else {
                            clicked16 = true;
                            clicked15 = false;
                            COMscore2 = COMscore2 -3;
                            COMscore2 = COMscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked16 = true;
                        COMscore2 = COMscore2 +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 5){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked17 || clicked18 || clicked19 || clicked20){
                        if (clicked20) {
                            NextPage();
                        } else if (clicked17) {
                            clicked20 = true;
                            clicked17 = false;
                            IGOscore = IGOscore +2;
                            IGOscore = IGOscore +6;
                            NextPage();
                        }else if (clicked18){
                            clicked20 = true;
                            clicked18 = false;
                            IGOscore = IGOscore +6;
                            NextPage();
                        }else {
                            clicked20 = true;
                            clicked19 = false;
                            IGOscore = IGOscore -3;
                            IGOscore = IGOscore +6;
                            NextPage();
                        }
                    }else {
                        clicked20 = true;
                        IGOscore = IGOscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 6){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked21 || clicked22 || clicked23 || clicked24){
                        if (clicked24) {
                            NextPage();
                        } else if (clicked21) {
                            clicked24 = true;
                            clicked21 = false;
                            IGOscore2 = IGOscore2 +2;
                            IGOscore2 = IGOscore2 +6;
                            NextPage();
                        }else if (clicked22){
                            clicked24 = true;
                            clicked22 = false;
                            IGOscore2 = IGOscore2 +6;
                            NextPage();
                        }else {
                            clicked24 = true;
                            clicked23 = false;
                            IGOscore2 = IGOscore2 -3;
                            IGOscore2 = IGOscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked24 = true;
                        IGOscore2 = IGOscore2 +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 7){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked25 || clicked26 || clicked27 || clicked28){
                        if (clicked28) {
                            NextPage();
                        } else if (clicked25) {
                            clicked28 = true;
                            clicked25 = false;
                            LVGscore = LVGscore +2;
                            LVGscore = LVGscore +6;
                            NextPage();
                        }else if (clicked26){
                            clicked28 = true;
                            clicked26 = false;
                            LVGscore = LVGscore +6;
                            NextPage();
                        }else {
                            clicked28 = true;
                            clicked27 = false;
                            LVGscore = LVGscore -3;
                            LVGscore = LVGscore +6;
                            NextPage();
                        }
                    }else {
                        clicked28 = true;
                        LVGscore = LVGscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 8){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked29 || clicked30 || clicked31 || clicked32){
                        if (clicked32) {
                            NextPage();
                        } else if (clicked29) {
                            clicked32 = true;
                            clicked29 = false;
                            LVGscore2 = LVGscore2 +2;
                            LVGscore2 = LVGscore2 +6;
                            NextPage();
                        }else if (clicked30){
                            clicked32 = true;
                            clicked30 = false;
                            LVGscore2 = LVGscore2 +6;
                            NextPage();
                        }else {
                            clicked32 = true;
                            clicked31 = false;
                            LVGscore2 = LVGscore2 -3;
                            LVGscore2 = LVGscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked32 = true;
                        LVGscore2 = LVGscore2 +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 9){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked33 || clicked34 || clicked35 || clicked36){
                        if (clicked36) {
                            NextPage();
                        } else if (clicked33) {
                            clicked36 = true;
                            clicked33 = false;
                            ISOscore = ISOscore +2;
                            ISOscore = ISOscore +6;
                            NextPage();
                        }else if (clicked34){
                            clicked36 = true;
                            clicked34 = false;
                            ISOscore = ISOscore +6;
                            NextPage();
                        }else {
                            clicked36 = true;
                            clicked35 = false;
                            ISOscore = ISOscore -3;
                            ISOscore = ISOscore +6;
                            NextPage();
                        }
                    }else {
                        clicked36 = true;
                        ISOscore = ISOscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 10){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked37 || clicked38 || clicked39 || clicked40){
                        if (clicked40) {
                            NextPage();
                        } else if (clicked37) {
                            clicked40 = true;
                            clicked37 = false;
                            ISOscore2 = ISOscore2 +2;
                            ISOscore2 = ISOscore2 +6;
                            NextPage();
                        }else if (clicked38){
                            clicked40 = true;
                            clicked38 = false;
                            ISOscore2 = ISOscore2 +6;
                            NextPage();
                        }else {
                            clicked40 = true;
                            clicked39 = false;
                            ISOscore2 = ISOscore2 -3;
                            ISOscore2 = ISOscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked40 = true;
                        ISOscore2 = ISOscore2 +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 11){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked41 || clicked42 || clicked43 || clicked44){
                        if (clicked43) {
                            NextPage();
                        } else if (clicked41) {
                            clicked43 = true;
                            clicked41 = false;
                            IVLscore = IVLscore +2;
                            IVLscore = IVLscore +3;
                            NextPage();
                        }else if (clicked42){
                            clicked43 = true;
                            clicked42 = false;
                            IVLscore = IVLscore +3;
                            NextPage();
                        }else {
                            clicked43 = true;
                            clicked44 = false;
                            IVLscore = IVLscore -3;
                            IVLscore = IVLscore +6;
                            NextPage();
                        }
                    }else {
                        clicked43 = true;
                        IVLscore = IVLscore +3;
                        NextPage();
                    }
                }else if (mQuestionNumber == 12){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked45 || clicked46 || clicked47 || clicked48){
                        if (clicked48) {
                            NextPage();
                        } else if (clicked45) {
                            clicked48 = true;
                            clicked45 = false;
                            IVLscore2 = IVLscore2 +2;
                            IVLscore2 = IVLscore2 +6;
                            NextPage();
                        }else if (clicked46){
                            clicked48 = true;
                            clicked46 = false;
                            IVLscore2 = IVLscore2 +6;
                            NextPage();
                        }else {
                            clicked48 = true;
                            clicked47 = false;
                            IVLscore2 = IVLscore2 -3;
                            IVLscore2 = IVLscore2 +6;
                            NextPage();
                        }
                    }else {
                        clicked48 = true;
                        IVLscore2 = IVLscore2 +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 13){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked49 || clicked50 || clicked51 || clicked52){
                        if (clicked52) {
                            NextPage();
                        } else if (clicked49) {
                            clicked52 = true;
                            clicked49 = false;
                            RMIscore = RMIscore +2;
                            RMIscore = RMIscore +6;
                            NextPage();
                        }else if (clicked50){
                            clicked52 = true;
                            clicked50 = false;
                            RMIscore = RMIscore +6;
                            NextPage();
                        }else {
                            clicked52 = true;
                            clicked51 = false;
                            RMIscore = RMIscore -3;
                            RMIscore = RMIscore +6;
                            NextPage();
                        }
                    }else {
                        clicked52 = true;
                        RMIscore = RMIscore +6;
                        NextPage();
                    }
                }else if (mQuestionNumber == 14){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    if (clicked53 || clicked54 || clicked55 || clicked56){
                        if (clicked56) {
                            GoStudyPage();
                        } else if (clicked53) {
                            clicked56 = true;
                            clicked53 = false;
                            RMIscore2 = RMIscore2 +2;
                            RMIscore2 = RMIscore2 +6;
                            GoStudyPage();
                        }else if (clicked54){
                            clicked56 = true;
                            clicked54 = false;
                            RMIscore2 = RMIscore2 +6;
                            GoStudyPage();
                        }else {
                            clicked56 = true;
                            clicked55 = false;
                            RMIscore2 = RMIscore2 -6;
                            RMIscore2 = RMIscore2 +6;
                            GoStudyPage();
                        }
                    }else {
                        clicked56 = true;
                        RMIscore2 = RMIscore2 +6;
                        GoStudyPage();
                    }
                }else {

                }
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber == 1) {
                    NextPagina(clicked1, clicked2, clicked3, clicked4);
                }else if (mQuestionNumber == 2){
                    NextPagina(clicked5, clicked6, clicked7, clicked8);
                }else if (mQuestionNumber == 3){
                    NextPagina(clicked9, clicked10, clicked11, clicked12);
                }else if (mQuestionNumber == 4){
                    NextPagina(clicked13, clicked14, clicked15, clicked16);
                }else if (mQuestionNumber == 5){
                    NextPagina(clicked17, clicked18, clicked19, clicked20);
                }else if (mQuestionNumber == 6){
                    NextPagina(clicked21, clicked22, clicked23, clicked24);
                }else if (mQuestionNumber == 7){
                    NextPagina(clicked25, clicked26, clicked27, clicked28);
                }else if (mQuestionNumber == 8){
                    NextPagina(clicked29, clicked30, clicked31, clicked32);
                }else if (mQuestionNumber == 9){
                    NextPagina(clicked33, clicked34, clicked35, clicked36);
                }else if (mQuestionNumber == 10){
                    NextPagina(clicked37, clicked38, clicked39, clicked40);
                }else if (mQuestionNumber == 11){
                    NextPagina(clicked41, clicked42, clicked43, clicked44);
                }else if (mQuestionNumber == 12){
                    NextPagina(clicked45, clicked46, clicked47, clicked48);
                }else if (mQuestionNumber == 13){
                    NextPagina(clicked49, clicked50, clicked51, clicked52);
                }else if (mQuestionNumber == 14){
                    NextPagina(clicked53, clicked54, clicked55, clicked56);
                }else {
                    GoStudyPage();
                }
            }
        });




        mPreviousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (mQuestionNumber <= 1){
                    Toast.makeText(QuizActivity.this, "You can not go back further", Toast.LENGTH_SHORT).show();
                }else {
                    mQuestionNumber -= 1;
                    updateQuestionMinus();
                }
            }
        });
    }

    private void NextPagina(Boolean first, Boolean second, Boolean third, Boolean fourth) {
        if (first || second || third || fourth){
            mScore = mScore +1;
            updateScore(mScore);
            NextPage();
        }else {
            Toast.makeText(QuizActivity.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
        }
    }


    private void GoStudyPage() {
        Intent gostudypage = new Intent(this, Study_test_results.class);
        startActivity(gostudypage);
    }

    private void GoHome() {
        Intent gohome = new Intent(this, HomeScreen.class);
        startActivity(gohome);
    }

    //https://www.youtube.com/watch?v=men8GB-7yM0 tutorial for alertdialog
    public void ShowAlertDialog(View view) {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Do you want to go back to the homescreen?");
            alert.setMessage("This will erase all your current progress");
            alert.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    GoHome();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ;
                }
            });
            alert.create().show();
    }


    private void NextPage(){
        mQuestionNumber++;
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        int x = ((mScore) *100) / 14;
        progressBar.setProgress(x);
    }

    private void updateQuestionMinus(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mScore = mScore - 1;
        updateScore(mScore);

        int x = ((mScore) *100) / 14;
        progressBar.setProgress(x);
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    /*should only be used to calculate for button1
    private void calculate1(Boolean first, Boolean second, Boolean third, Boolean fourth, int score) {
        if (first || second || third || fourth){
            if (first) {
                updateQuestion();
            }else if (second) {
                first = true;
                second = false;
                score = score -2;
                updateQuestion();
            }else if (third){
                first = true;
                third = false;
                score = score -3;
                score = score -2;
                updateQuestion();
            }else {
                first = true;
                fourth = false;
                score = score -6;
                score = score -2;
                updateQuestion();
            }
        }else {
            first = true;
            score = score -2;
            updateQuestion();
        }
    }

    private void calculate2(Boolean first, Boolean second, Boolean third, Boolean fourth, int score) {
        if (first || second || third || fourth) {
            if (second) {
                updateQuestion();
            } else if (first) {
                second = true;
                first = false;
                score = score + 2;
                updateQuestion();
            } else if (third) {
                second = true;
                third = false;
                score = score - 3;
                updateQuestion();
            } else {
                second = true;
                fourth = false;
                score = score - 6;
                updateQuestion();
            }
        } else {
            second = true;
            updateQuestion();
        }
    }

    private void calculate3(Boolean first, Boolean second, Boolean third, Boolean fourth, int score) {
        if (first || second || third || fourth){
            if (third) {
                updateQuestion();
            } else if (first) {
                third = true;
                first = false;
                score = score +2;
                score = score +3;
                updateQuestion();
            }else if (second){
                third = true;
                second = false;
                score = score +3;
                updateQuestion();
            }else {
                third = true;
                fourth = false;
                score = score -6;
                score = score +3;
                updateQuestion();
            }
        }else {
            third = true;
            score = score +3;
            updateQuestion();
        }
    }

    private void calculate4 (Boolean first, Boolean second, Boolean third, Boolean fourth, int score) {
        if (first || second || third || fourth){
            if (fourth) {
                updateQuestion();
            } else if (first) {
                fourth = true;
                first = false;
                score = score +2;
                score = score +6;
                updateQuestion();
            }else if (second){
                fourth = true;
                second = false;
                score = score +6;
                updateQuestion();
            }else {
                fourth = true;
                third = false;
                score = score -3;
                score = score +6;
                updateQuestion();
            }
        }else {
            fourth = true;
            score = score +6;
            updateQuestion();
        }
    } */
}






