package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test4 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int COMscore2 = 0;

    public static boolean Clicked13 = false;
    public static boolean Clicked14 = false;
    public static boolean Clicked15 = false;
    public static boolean Clicked16 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test4);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked13 || Clicked14 || Clicked15 || Clicked16){
                    if (Clicked13) {
                        NextPage();
                    }else if (Clicked14) {
                        Clicked13 = true;
                        Clicked14 = false;
                        COMscore2 = COMscore2 -2;
                        NextPage();
                    }else if (Clicked15){
                        Clicked13 = true;
                        Clicked15 = false;
                        COMscore2 = COMscore2 -3;
                        COMscore2 = COMscore2 -2;
                        NextPage();
                    }else {
                        Clicked13 = true;
                        Clicked16 = false;
                        COMscore2 = COMscore2 -6;
                        COMscore2 = COMscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked13 = true;
                    COMscore2 = COMscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked13 || Clicked14 || Clicked15 || Clicked16){
                    if (Clicked14) {
                        NextPage();
                    }else if (Clicked13) {
                        Clicked14 = true;
                        Clicked13 = false;
                        COMscore2 = COMscore2 +2;
                        NextPage();
                    }else if (Clicked15){
                        Clicked14 = true;
                        Clicked15 = false;
                        COMscore2 = COMscore2 -3;
                        NextPage();
                    }else {
                        Clicked14 = true;
                        Clicked16 = false;
                        COMscore2 = COMscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked14 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked13 || Clicked14 || Clicked15 || Clicked16){
                    if (Clicked15) {
                        NextPage();
                    } else if (Clicked13) {
                        Clicked15 = true;
                        Clicked13 = false;
                        COMscore2 = COMscore2 +2;
                        COMscore2 = COMscore2 +3;
                        NextPage();
                    }else if (Clicked14){
                        Clicked15 = true;
                        Clicked14 = false;
                        COMscore2 = COMscore2 +3;
                        NextPage();
                    }else {
                        Clicked15 = true;
                        Clicked16 = false;
                        COMscore2 = COMscore2 -6;
                        COMscore2 = COMscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked15 = true;
                    COMscore2 = COMscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked13 || Clicked14 || Clicked15 || Clicked16){
                    if (Clicked16) {
                        NextPage();
                    } else if (Clicked13) {
                        Clicked16 = true;
                        Clicked13 = false;
                        COMscore2 = COMscore2 +2;
                        COMscore2 = COMscore2 +6;
                        NextPage();
                    }else if (Clicked14){
                        Clicked16 = true;
                        Clicked14 = false;
                        COMscore2 = COMscore2 +6;
                        NextPage();
                    }else {
                        Clicked16 = true;
                        Clicked15 = false;
                        COMscore2 = COMscore2 -6;
                        COMscore2 = COMscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked16 = true;
                    COMscore2 = COMscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked13 || Clicked14 || Clicked15 || Clicked16){
                    NextPage();
                }else {
                    Toast.makeText(Study_test4.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test5.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test3.class);
        startActivity(previouspage);
    }

}
