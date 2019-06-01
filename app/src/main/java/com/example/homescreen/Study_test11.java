package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test11 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int IVLscore = 0;

    public static boolean Clicked41 = false;
    public static boolean Clicked42 = false;
    public static boolean Clicked43 = false;
    public static boolean Clicked44 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test11);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked41 || Clicked42 || Clicked43 || Clicked44){
                    if (Clicked41) {
                        NextPage();
                    }else if (Clicked42) {
                        Clicked41 = true;
                        Clicked42 = false;
                        IVLscore = IVLscore -2;
                        NextPage();
                    }else if (Clicked43){
                        Clicked41 = true;
                        Clicked43 = false;
                        IVLscore = IVLscore -3;
                        IVLscore = IVLscore -2;
                        NextPage();
                    }else {
                        Clicked41 = true;
                        Clicked44 = false;
                        IVLscore = IVLscore -6;
                        IVLscore = IVLscore -2;
                        NextPage();
                    }
                }else {
                    Clicked41 = true;
                    IVLscore = IVLscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked41 || Clicked42 || Clicked43 || Clicked44){
                    if (Clicked42) {
                        NextPage();
                    }else if (Clicked41) {
                        Clicked42 = true;
                        Clicked41 = false;
                        IVLscore = IVLscore +2;
                        NextPage();
                    }else if (Clicked43){
                        Clicked42 = true;
                        Clicked43 = false;
                        IVLscore = IVLscore -3;
                        NextPage();
                    }else {
                        Clicked42 = true;
                        Clicked44 = false;
                        IVLscore = IVLscore -6;
                        NextPage();
                    }
                }else {
                    Clicked42 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked41 || Clicked42 || Clicked43 || Clicked44){
                    if (Clicked43) {
                        NextPage();
                    } else if (Clicked41) {
                        Clicked43 = true;
                        Clicked41 = false;
                        IVLscore = IVLscore +2;
                        IVLscore = IVLscore +3;
                        NextPage();
                    }else if (Clicked42){
                        Clicked43 = true;
                        Clicked42 = false;
                        IVLscore = IVLscore +3;
                        NextPage();
                    }else {
                        Clicked43 = true;
                        Clicked44 = false;
                        IVLscore = IVLscore -6;
                        IVLscore = IVLscore +3;
                        NextPage();
                    }
                }else {
                    Clicked43 = true;
                    IVLscore = IVLscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked41 || Clicked42 || Clicked43 || Clicked44){
                    if (Clicked44) {
                        NextPage();
                    } else if (Clicked41) {
                        Clicked44 = true;
                        Clicked41 = false;
                        IVLscore = IVLscore +2;
                        IVLscore = IVLscore +6;
                        NextPage();
                    }else if (Clicked42){
                        Clicked44 = true;
                        Clicked42 = false;
                        IVLscore = IVLscore +6;
                        NextPage();
                    }else {
                        Clicked44 = true;
                        Clicked43 = false;
                        IVLscore = IVLscore -6;
                        IVLscore = IVLscore +6;
                        NextPage();
                    }
                }else {
                    Clicked44 = true;
                    IVLscore = IVLscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked41 || Clicked42 || Clicked43 || Clicked44){
                    NextPage();
                }else {
                    Toast.makeText(Study_test11.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test12.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test10.class);
        startActivity(previouspage);
    }

}