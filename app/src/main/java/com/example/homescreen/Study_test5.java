package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test5 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int IGOscore = 0;

    public static boolean Clicked17 = false;
    public static boolean Clicked18 = false;
    public static boolean Clicked19 = false;
    public static boolean Clicked20 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test5);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked17 || Clicked18 || Clicked19 || Clicked20){
                    if (Clicked17) {
                        NextPage();
                    }else if (Clicked18) {
                        Clicked17 = true;
                        Clicked18 = false;
                        IGOscore = IGOscore -2;
                        NextPage();
                    }else if (Clicked19){
                        Clicked17 = true;
                        Clicked19 = false;
                        IGOscore = IGOscore -3;
                        IGOscore = IGOscore -2;
                        NextPage();
                    }else {
                        Clicked17 = true;
                        Clicked20 = false;
                        IGOscore = IGOscore -6;
                        IGOscore = IGOscore -2;
                        NextPage();
                    }
                }else {
                    Clicked17 = true;
                    IGOscore = IGOscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked17 || Clicked18 || Clicked19 || Clicked20){
                    if (Clicked18) {
                        NextPage();
                    }else if (Clicked17) {
                        Clicked18 = true;
                        Clicked17 = false;
                        IGOscore = IGOscore +2;
                        NextPage();
                    }else if (Clicked19){
                        Clicked18 = true;
                        Clicked19 = false;
                        IGOscore = IGOscore -3;
                        NextPage();
                    }else {
                        Clicked18 = true;
                        Clicked20 = false;
                        IGOscore = IGOscore -6;
                        NextPage();
                    }
                }else {
                    Clicked17 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked17 || Clicked18 || Clicked19 || Clicked20){
                    if (Clicked19) {
                        NextPage();
                    } else if (Clicked17) {
                        Clicked19 = true;
                        Clicked17 = false;
                        IGOscore = IGOscore +2;
                        IGOscore = IGOscore +3;
                        NextPage();
                    }else if (Clicked18){
                        Clicked19 = true;
                        Clicked18 = false;
                        IGOscore = IGOscore +3;
                        NextPage();
                    }else {
                        Clicked19 = true;
                        Clicked20 = false;
                        IGOscore = IGOscore -6;
                        IGOscore = IGOscore +3;
                        NextPage();
                    }
                }else {
                    Clicked19 = true;
                    IGOscore = IGOscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked17 || Clicked18 || Clicked19 || Clicked20){
                    if (Clicked20) {
                        NextPage();
                    } else if (Clicked17) {
                        Clicked20 = true;
                        Clicked17 = false;
                        IGOscore = IGOscore +2;
                        IGOscore = IGOscore +6;
                        NextPage();
                    }else if (Clicked18){
                        Clicked20 = true;
                        Clicked18 = false;
                        IGOscore = IGOscore +6;
                        NextPage();
                    }else {
                        Clicked20 = true;
                        Clicked19 = false;
                        IGOscore = IGOscore -6;
                        IGOscore = IGOscore +6;
                        NextPage();
                    }
                }else {
                    Clicked20 = true;
                    IGOscore = IGOscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked17 || Clicked18 || Clicked19 || Clicked20){
                    NextPage();
                }else {
                    Toast.makeText(Study_test5.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test6.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test4.class);
        startActivity(previouspage);
    }

}