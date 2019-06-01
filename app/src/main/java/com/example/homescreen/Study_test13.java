package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test13 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int RMIscore = 0;

    public static boolean Clicked49 = false;
    public static boolean Clicked50 = false;
    public static boolean Clicked51 = false;
    public static boolean Clicked52 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test13);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked49 || Clicked50 || Clicked51 || Clicked52){
                    if (Clicked49) {
                        NextPage();
                    }else if (Clicked50) {
                        Clicked49 = true;
                        Clicked50 = false;
                        RMIscore = RMIscore -2;
                        NextPage();
                    }else if (Clicked51){
                        Clicked49 = true;
                        Clicked51 = false;
                        RMIscore = RMIscore -3;
                        RMIscore = RMIscore -2;
                        NextPage();
                    }else {
                        Clicked49 = true;
                        Clicked52 = false;
                        RMIscore = RMIscore -6;
                        RMIscore = RMIscore -2;
                        NextPage();
                    }
                }else {
                    Clicked49 = true;
                    RMIscore = RMIscore -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked49 || Clicked50 || Clicked51 || Clicked52){
                    if (Clicked50) {
                        NextPage();
                    }else if (Clicked49) {
                        Clicked50 = true;
                        Clicked49 = false;
                        RMIscore = RMIscore +2;
                        NextPage();
                    }else if (Clicked51){
                        Clicked50 = true;
                        Clicked51 = false;
                        RMIscore = RMIscore -3;
                        NextPage();
                    }else {
                        Clicked50 = true;
                        Clicked52 = false;
                        RMIscore = RMIscore -6;
                        NextPage();
                    }
                }else {
                    Clicked50 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked49 || Clicked50 || Clicked51 || Clicked52){
                    if (Clicked51) {
                        NextPage();
                    } else if (Clicked49) {
                        Clicked51 = true;
                        Clicked49 = false;
                        RMIscore = RMIscore +2;
                        RMIscore = RMIscore +3;
                        NextPage();
                    }else if (Clicked50){
                        Clicked51 = true;
                        Clicked50 = false;
                        RMIscore = RMIscore +3;
                        NextPage();
                    }else {
                        Clicked51 = true;
                        Clicked52 = false;
                        RMIscore = RMIscore -6;
                        RMIscore = RMIscore +3;
                        NextPage();
                    }
                }else {
                    Clicked51 = true;
                    RMIscore = RMIscore +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked49 || Clicked50 || Clicked51 || Clicked52){
                    if (Clicked52) {
                        NextPage();
                    } else if (Clicked49) {
                        Clicked52 = true;
                        Clicked49 = false;
                        RMIscore = RMIscore +2;
                        RMIscore = RMIscore +6;
                        NextPage();
                    }else if (Clicked50){
                        Clicked52 = true;
                        Clicked50 = false;
                        RMIscore = RMIscore +6;
                        NextPage();
                    }else {
                        Clicked52 = true;
                        Clicked51 = false;
                        RMIscore = RMIscore -6;
                        RMIscore = RMIscore +6;
                        NextPage();
                    }
                }else {
                    Clicked52 = true;
                    RMIscore = RMIscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked49 || Clicked50 || Clicked51 || Clicked52){
                    NextPage();
                }else {
                    Toast.makeText(Study_test13.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test14.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test12.class);
        startActivity(previouspage);
    }

}