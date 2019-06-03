package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test9 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int ISOscore = 0;

    public static boolean Clicked33 = false;
    public static boolean Clicked34 = false;
    public static boolean Clicked35 = false;
    public static boolean Clicked36 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test9);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked33 || Clicked34 || Clicked35 || Clicked36){
                    if (Clicked33) {
                        NextPage();
                    }else if (Clicked34) {
                        Clicked33 = true;
                        Clicked34 = false;
                        ISOscore = ISOscore -2;
                        NextPage();
                    }else if (Clicked35){
                        Clicked33 = true;
                        Clicked35 = false;
                        ISOscore = ISOscore -3;
                        ISOscore = ISOscore -2;
                        NextPage();
                    }else {
                        Clicked33 = true;
                        Clicked36 = false;
                        ISOscore = ISOscore -6;
                        ISOscore = ISOscore -2;
                        NextPage();
                    }
                }else {
                    Clicked33 = true;
                    ISOscore = ISOscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked33 || Clicked34 || Clicked35 || Clicked36){
                    if (Clicked34) {
                        NextPage();
                    }else if (Clicked33) {
                        Clicked34 = true;
                        Clicked33 = false;
                        ISOscore = ISOscore +2;
                        NextPage();
                    }else if (Clicked35){
                        Clicked34 = true;
                        Clicked35 = false;
                        ISOscore = ISOscore -3;
                        NextPage();
                    }else {
                        Clicked34 = true;
                        Clicked36 = false;
                        ISOscore = ISOscore -6;
                        NextPage();
                    }
                }else {
                    Clicked34 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked33 || Clicked34 || Clicked35 || Clicked36){
                    if (Clicked35) {
                        NextPage();
                    } else if (Clicked33) {
                        Clicked35 = true;
                        Clicked33 = false;
                        ISOscore = ISOscore +2;
                        ISOscore = ISOscore +3;
                        NextPage();
                    }else if (Clicked34){
                        Clicked35 = true;
                        Clicked34 = false;
                        ISOscore = ISOscore +3;
                        NextPage();
                    }else {
                        Clicked35 = true;
                        Clicked36 = false;
                        ISOscore = ISOscore -6;
                        ISOscore = ISOscore +3;
                        NextPage();
                    }
                }else {
                    Clicked35 = true;
                    ISOscore = ISOscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked33 || Clicked34 || Clicked35 || Clicked36){
                    if (Clicked36) {
                        NextPage();
                    } else if (Clicked33) {
                        Clicked36 = true;
                        Clicked33 = false;
                        ISOscore = ISOscore +2;
                        ISOscore = ISOscore +6;
                        NextPage();
                    }else if (Clicked34){
                        Clicked36 = true;
                        Clicked34 = false;
                        ISOscore = ISOscore +6;
                        NextPage();
                    }else {
                        Clicked36 = true;
                        Clicked35 = false;
                        ISOscore = ISOscore -6;
                        ISOscore = ISOscore +6;
                        NextPage();
                    }
                }else {
                    Clicked36 = true;
                    ISOscore = ISOscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked33 || Clicked34 || Clicked35 || Clicked36){
                    NextPage();
                }else {
                    Toast.makeText(Study_test9.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test10.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test8.class);
        startActivity(previouspage);
    }

}
