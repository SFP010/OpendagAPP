package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test8 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int LVGscore2 = 0;

    public static boolean Clicked29 = false;
    public static boolean Clicked30 = false;
    public static boolean Clicked31 = false;
    public static boolean Clicked32 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test8);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked29 || Clicked30 || Clicked31 || Clicked32){
                    if (Clicked29) {
                        NextPage();
                    }else if (Clicked30) {
                        Clicked29 = true;
                        Clicked30 = false;
                        LVGscore2 = LVGscore2 -2;
                        NextPage();
                    }else if (Clicked31){
                        Clicked29 = true;
                        Clicked31 = false;
                        LVGscore2 = LVGscore2 -3;
                        LVGscore2 = LVGscore2 -2;
                        NextPage();
                    }else {
                        Clicked29 = true;
                        Clicked32 = false;
                        LVGscore2 = LVGscore2 -6;
                        LVGscore2 = LVGscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked29 = true;
                    LVGscore2 = LVGscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked29 || Clicked30 || Clicked31 || Clicked32){
                    if (Clicked30) {
                        NextPage();
                    }else if (Clicked29) {
                        Clicked30 = true;
                        Clicked29 = false;
                        LVGscore2 = LVGscore2 +2;
                        NextPage();
                    }else if (Clicked31){
                        Clicked30 = true;
                        Clicked31 = false;
                        LVGscore2 = LVGscore2 -3;
                        NextPage();
                    }else {
                        Clicked30 = true;
                        Clicked32 = false;
                        LVGscore2 = LVGscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked30 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked29 || Clicked30 || Clicked31 || Clicked32){
                    if (Clicked31) {
                        NextPage();
                    } else if (Clicked29) {
                        Clicked31 = true;
                        Clicked29 = false;
                        LVGscore2 = LVGscore2 +2;
                        LVGscore2 = LVGscore2 +3;
                        NextPage();
                    }else if (Clicked30){
                        Clicked31 = true;
                        Clicked30 = false;
                        LVGscore2 = LVGscore2 +3;
                        NextPage();
                    }else {
                        Clicked31 = true;
                        Clicked32 = false;
                        LVGscore2 = LVGscore2 -6;
                        LVGscore2 = LVGscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked31 = true;
                    LVGscore2 = LVGscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked29 || Clicked30 || Clicked31 || Clicked32){
                    if (Clicked32) {
                        NextPage();
                    } else if (Clicked29) {
                        Clicked32 = true;
                        Clicked29 = false;
                        LVGscore2 = LVGscore2 +2;
                        LVGscore2 = LVGscore2 +6;
                        NextPage();
                    }else if (Clicked30){
                        Clicked32 = true;
                        Clicked30 = false;
                        LVGscore2 = LVGscore2 +6;
                        NextPage();
                    }else {
                        Clicked32 = true;
                        Clicked31 = false;
                        LVGscore2 = LVGscore2 -6;
                        LVGscore2 = LVGscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked32 = true;
                    LVGscore2 = LVGscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked29 || Clicked30 || Clicked31 || Clicked32){
                    NextPage();
                }else {
                    Toast.makeText(Study_test8.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
                }
            }
        });


        mPreviousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Previouspage();
            }
        });

    }


    private void NextPage() {
        Intent nextpage = new Intent(this, Study_test9.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test7.class);
        startActivity(previouspage);
    }

}