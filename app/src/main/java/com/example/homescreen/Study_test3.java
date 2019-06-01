package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test3 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int COMscore = 0;

    public static boolean Clicked9 = false;
    public static boolean Clicked10 = false;
    public static boolean Clicked11 = false;
    public static boolean Clicked12 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test3);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked9 || Clicked10 || Clicked11 || Clicked12){
                    if (Clicked9) {
                        NextPage();
                    }else if (Clicked10) {
                        Clicked9 = true;
                        Clicked10 = false;
                        COMscore = COMscore -2;
                        NextPage();
                    }else if (Clicked11){
                        Clicked9 = true;
                        Clicked11 = false;
                        COMscore = COMscore -3;
                        COMscore = COMscore -2;
                        NextPage();
                    }else {
                        Clicked9 = true;
                        Clicked12 = false;
                        COMscore = COMscore -6;
                        COMscore = COMscore -2;
                        NextPage();
                    }
                }else {
                    Clicked9 = true;
                    COMscore = COMscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked9 || Clicked10 || Clicked11 || Clicked12){
                    if (Clicked10) {
                        NextPage();
                    }else if (Clicked9) {
                        Clicked10 = true;
                        Clicked9 = false;
                        COMscore = COMscore +2;
                        NextPage();
                    }else if (Clicked11){
                        Clicked10 = true;
                        Clicked11 = false;
                        COMscore = COMscore -3;
                        NextPage();
                    }else {
                        Clicked10 = true;
                        Clicked12 = false;
                        COMscore = COMscore -6;
                        NextPage();
                    }
                }else {
                    Clicked10 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked9 || Clicked10 || Clicked11 || Clicked12){
                    if (Clicked11) {
                        NextPage();
                    } else if (Clicked9) {
                        Clicked11 = true;
                        Clicked9 = false;
                        COMscore = COMscore +2;
                        COMscore = COMscore +3;
                        NextPage();
                    }else if (Clicked10){
                        Clicked11 = true;
                        Clicked10 = false;
                        COMscore = COMscore +3;
                        NextPage();
                    }else {
                        Clicked11 = true;
                        Clicked12 = false;
                        COMscore = COMscore -6;
                        COMscore = COMscore +3;
                        NextPage();
                    }
                }else {
                    Clicked11 = true;
                    COMscore = COMscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked9 || Clicked10 || Clicked11 || Clicked12){
                    if (Clicked12) {
                        NextPage();
                    } else if (Clicked9) {
                        Clicked12 = true;
                        Clicked9 = false;
                        COMscore = COMscore +2;
                        COMscore = COMscore +6;
                        NextPage();
                    }else if (Clicked10){
                        Clicked12 = true;
                        Clicked10 = false;
                        COMscore = COMscore +6;
                        NextPage();
                    }else {
                        Clicked12 = true;
                        Clicked11 = false;
                        COMscore = COMscore -6;
                        COMscore = COMscore +6;
                        NextPage();
                    }
                }else {
                    Clicked12 = true;
                    COMscore = COMscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked9 || Clicked10 || Clicked11 || Clicked12){
                    NextPage();
                }else {
                    Toast.makeText(Study_test3.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test4.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test2.class);
        startActivity(previouspage);
    }

}
