package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test12 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int IVLscore2 = 0;

    public static boolean Clicked45 = false;
    public static boolean Clicked46 = false;
    public static boolean Clicked47 = false;
    public static boolean Clicked48 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test12);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked45 || Clicked46 || Clicked47 || Clicked48){
                    if (Clicked45) {
                        NextPage();
                    }else if (Clicked46) {
                        Clicked45 = true;
                        Clicked46 = false;
                        IVLscore2 = IVLscore2 -2;
                        NextPage();
                    }else if (Clicked47){
                        Clicked45 = true;
                        Clicked47 = false;
                        IVLscore2 = IVLscore2 -3;
                        IVLscore2 = IVLscore2 -2;
                        NextPage();
                    }else {
                        Clicked45 = true;
                        Clicked48 = false;
                        IVLscore2 = IVLscore2 -6;
                        IVLscore2 = IVLscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked45 = true;
                    IVLscore2 = IVLscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked45 || Clicked46 || Clicked47 || Clicked48){
                    if (Clicked46) {
                        NextPage();
                    }else if (Clicked45) {
                        Clicked46 = true;
                        Clicked45 = false;
                        IVLscore2 = IVLscore2 +2;
                        NextPage();
                    }else if (Clicked47){
                        Clicked46 = true;
                        Clicked47 = false;
                        IVLscore2 = IVLscore2 -3;
                        NextPage();
                    }else {
                        Clicked46 = true;
                        Clicked48 = false;
                        IVLscore2 = IVLscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked46 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked45 || Clicked46 || Clicked47 || Clicked48){
                    if (Clicked47) {
                        NextPage();
                    } else if (Clicked45) {
                        Clicked47 = true;
                        Clicked45 = false;
                        IVLscore2 = IVLscore2 +2;
                        IVLscore2 = IVLscore2 +3;
                        NextPage();
                    }else if (Clicked46){
                        Clicked47 = true;
                        Clicked46 = false;
                        IVLscore2 = IVLscore2 +3;
                        NextPage();
                    }else {
                        Clicked47 = true;
                        Clicked48 = false;
                        IVLscore2 = IVLscore2 -6;
                        IVLscore2 = IVLscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked47 = true;
                    IVLscore2 = IVLscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked45 || Clicked46 || Clicked47 || Clicked48){
                    if (Clicked48) {
                        NextPage();
                    } else if (Clicked45) {
                        Clicked48 = true;
                        Clicked45 = false;
                        IVLscore2 = IVLscore2 +2;
                        IVLscore2 = IVLscore2 +6;
                        NextPage();
                    }else if (Clicked46){
                        Clicked48 = true;
                        Clicked46 = false;
                        IVLscore2 = IVLscore2 +6;
                        NextPage();
                    }else {
                        Clicked48 = true;
                        Clicked47 = false;
                        IVLscore2 = IVLscore2 -6;
                        IVLscore2 = IVLscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked48 = true;
                    IVLscore2 = IVLscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked45 || Clicked46 || Clicked47 || Clicked48){
                    NextPage();
                }else {
                    Toast.makeText(Study_test12.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test13.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test11.class);
        startActivity(previouspage);
    }

}
