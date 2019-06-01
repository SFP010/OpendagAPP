package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test10 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int ISOscore2 = 0;

    public static boolean Clicked37 = false;
    public static boolean Clicked38 = false;
    public static boolean Clicked39 = false;
    public static boolean Clicked40 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_test10);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked37 || Clicked38 || Clicked39 || Clicked40){
                    if (Clicked37) {
                        NextPage();
                    }else if (Clicked38) {
                        Clicked37 = true;
                        Clicked38 = false;
                        ISOscore2 = ISOscore2 -2;
                        NextPage();
                    }else if (Clicked39){
                        Clicked37 = true;
                        Clicked39 = false;
                        ISOscore2 = ISOscore2 -3;
                        ISOscore2 = ISOscore2 -2;
                        NextPage();
                    }else {
                        Clicked37 = true;
                        Clicked40 = false;
                        ISOscore2 = ISOscore2 -6;
                        ISOscore2 = ISOscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked37 = true;
                    ISOscore2 = ISOscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked37 || Clicked38 || Clicked39 || Clicked40){
                    if (Clicked38) {
                        NextPage();
                    }else if (Clicked37) {
                        Clicked38 = true;
                        Clicked37 = false;
                        ISOscore2 = ISOscore2 +2;
                        NextPage();
                    }else if (Clicked39){
                        Clicked38 = true;
                        Clicked39 = false;
                        ISOscore2 = ISOscore2 -3;
                        NextPage();
                    }else {
                        Clicked38 = true;
                        Clicked40 = false;
                        ISOscore2 = ISOscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked38 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked37 || Clicked38 || Clicked39 || Clicked40){
                    if (Clicked39) {
                        NextPage();
                    } else if (Clicked37) {
                        Clicked39 = true;
                        Clicked37 = false;
                        ISOscore2 = ISOscore2 +2;
                        ISOscore2 = ISOscore2 +3;
                        NextPage();
                    }else if (Clicked38){
                        Clicked39 = true;
                        Clicked38 = false;
                        ISOscore2 = ISOscore2 +3;
                        NextPage();
                    }else {
                        Clicked39 = true;
                        Clicked40 = false;
                        ISOscore2 = ISOscore2 -6;
                        ISOscore2 = ISOscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked39 = true;
                    ISOscore2 = ISOscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked37 || Clicked38 || Clicked39 || Clicked40){
                    if (Clicked40) {
                        NextPage();
                    } else if (Clicked37) {
                        Clicked40 = true;
                        Clicked37 = false;
                        ISOscore2 = ISOscore2 +2;
                        ISOscore2 = ISOscore2 +6;
                        NextPage();
                    }else if (Clicked38){
                        Clicked40 = true;
                        Clicked38 = false;
                        ISOscore2 = ISOscore2 +6;
                        NextPage();
                    }else {
                        Clicked40 = true;
                        Clicked39 = false;
                        ISOscore2 = ISOscore2 -6;
                        ISOscore2 = ISOscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked40 = true;
                    ISOscore2 = ISOscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked37 || Clicked38 || Clicked39 || Clicked40){
                    NextPage();
                }else {
                    Toast.makeText(Study_test10.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test11.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test9.class);
        startActivity(previouspage);
    }

}
