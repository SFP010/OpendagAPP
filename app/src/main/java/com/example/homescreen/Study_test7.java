package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test7 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int LVGscore = 0;

    public static boolean Clicked25 = false;
    public static boolean Clicked26 = false;
    public static boolean Clicked27 = false;
    public static boolean Clicked28 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test7);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked25 || Clicked26 || Clicked27 || Clicked28){
                    if (Clicked25) {
                        NextPage();
                    }else if (Clicked26) {
                        Clicked25 = true;
                        Clicked26 = false;
                        LVGscore = LVGscore -2;
                        NextPage();
                    }else if (Clicked27){
                        Clicked25 = true;
                        Clicked27 = false;
                        LVGscore = LVGscore -3;
                        LVGscore = LVGscore -2;
                        NextPage();
                    }else {
                        Clicked25 = true;
                        Clicked28 = false;
                        LVGscore = LVGscore -6;
                        LVGscore = LVGscore -2;
                        NextPage();
                    }
                }else {
                    Clicked25 = true;
                    LVGscore = LVGscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked25 || Clicked26 || Clicked27 || Clicked28){
                    if (Clicked26) {
                        NextPage();
                    }else if (Clicked25) {
                        Clicked26 = true;
                        Clicked25 = false;
                        LVGscore = LVGscore +2;
                        NextPage();
                    }else if (Clicked27){
                        Clicked26 = true;
                        Clicked27 = false;
                        LVGscore = LVGscore -3;
                        NextPage();
                    }else {
                        Clicked26 = true;
                        Clicked28 = false;
                        LVGscore = LVGscore -6;
                        NextPage();
                    }
                }else {
                    Clicked26 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked25 || Clicked26 || Clicked27 || Clicked28){
                    if (Clicked27) {
                        NextPage();
                    } else if (Clicked25) {
                        Clicked27 = true;
                        Clicked25 = false;
                        LVGscore = LVGscore +2;
                        LVGscore = LVGscore +3;
                        NextPage();
                    }else if (Clicked26){
                        Clicked27 = true;
                        Clicked26 = false;
                        LVGscore = LVGscore +3;
                        NextPage();
                    }else {
                        Clicked27 = true;
                        Clicked28 = false;
                        LVGscore = LVGscore -6;
                        LVGscore = LVGscore +3;
                        NextPage();
                    }
                }else {
                    Clicked27 = true;
                    LVGscore = LVGscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked25 || Clicked26 || Clicked27 || Clicked28){
                    if (Clicked28) {
                        NextPage();
                    } else if (Clicked25) {
                        Clicked28 = true;
                        Clicked25 = false;
                        LVGscore = LVGscore +2;
                        LVGscore = LVGscore +6;
                        NextPage();
                    }else if (Clicked26){
                        Clicked28 = true;
                        Clicked26 = false;
                        LVGscore = LVGscore +6;
                        NextPage();
                    }else {
                        Clicked28 = true;
                        Clicked27 = false;
                        LVGscore = LVGscore -6;
                        LVGscore = LVGscore +6;
                        NextPage();
                    }
                }else {
                    Clicked28 = true;
                    LVGscore = LVGscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked25 || Clicked26 || Clicked27 || Clicked28){
                    NextPage();
                }else {
                    Toast.makeText(Study_test7.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test8.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test6.class);
        startActivity(previouspage);
    }

}
