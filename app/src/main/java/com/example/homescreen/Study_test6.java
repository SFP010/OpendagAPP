package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test6 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int IGOscore2 = 0;

    public static boolean Clicked21 = false;
    public static boolean Clicked22 = false;
    public static boolean Clicked23 = false;
    public static boolean Clicked24 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test6);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked21 || Clicked22 || Clicked23 || Clicked24){
                    if (Clicked21) {
                        NextPage();
                    }else if (Clicked22) {
                        Clicked21 = true;
                        Clicked22 = false;
                        IGOscore2 = IGOscore2 -2;
                        NextPage();
                    }else if (Clicked23){
                        Clicked21 = true;
                        Clicked23 = false;
                        IGOscore2 = IGOscore2 -3;
                        IGOscore2 = IGOscore2 -2;
                        NextPage();
                    }else {
                        Clicked21 = true;
                        Clicked24 = false;
                        IGOscore2 = IGOscore2 -6;
                        IGOscore2 = IGOscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked21 = true;
                    IGOscore2 = IGOscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked21 || Clicked22 || Clicked23 || Clicked24){
                    if (Clicked22) {
                        NextPage();
                    }else if (Clicked21) {
                        Clicked22 = true;
                        Clicked21 = false;
                        IGOscore2 = IGOscore2 +2;
                        NextPage();
                    }else if (Clicked23){
                        Clicked22 = true;
                        Clicked23 = false;
                        IGOscore2 = IGOscore2 -3;
                        NextPage();
                    }else {
                        Clicked22 = true;
                        Clicked24 = false;
                        IGOscore2 = IGOscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked22 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked21 || Clicked22 || Clicked23 || Clicked24){
                    if (Clicked23) {
                        NextPage();
                    } else if (Clicked21) {
                        Clicked23 = true;
                        Clicked21 = false;
                        IGOscore2 = IGOscore2 +2;
                        IGOscore2 = IGOscore2 +3;
                        NextPage();
                    }else if (Clicked22){
                        Clicked23 = true;
                        Clicked22 = false;
                        IGOscore2 = IGOscore2 +3;
                        NextPage();
                    }else {
                        Clicked23 = true;
                        Clicked24 = false;
                        IGOscore2 = IGOscore2 -6;
                        IGOscore2 = IGOscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked23 = true;
                    IGOscore2 = IGOscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked21 || Clicked22 || Clicked23 || Clicked24){
                    if (Clicked24) {
                        NextPage();
                    } else if (Clicked21) {
                        Clicked24 = true;
                        Clicked21 = false;
                        IGOscore2 = IGOscore2 +2;
                        IGOscore2 = IGOscore2 +6;
                        NextPage();
                    }else if (Clicked22){
                        Clicked24 = true;
                        Clicked22 = false;
                        IGOscore2 = IGOscore2 +6;
                        NextPage();
                    }else {
                        Clicked24 = true;
                        Clicked23 = false;
                        IGOscore2 = IGOscore2 -6;
                        IGOscore2 = IGOscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked24 = true;
                    IGOscore2 = IGOscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked21 || Clicked22 || Clicked23 || Clicked24){
                    NextPage();
                }else {
                    Toast.makeText(Study_test6.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test7.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test5.class);
        startActivity(previouspage);
    }

}