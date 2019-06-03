package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test2 extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;
    private Button mPreviousButton;

    public static int CMIscore2 = 0;

    public static boolean Clicked5 = false;
    public static boolean Clicked6 = false;
    public static boolean Clicked7 = false;
    public static boolean Clicked8 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test2);


        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);
        mPreviousButton = (Button)findViewById(R.id.Previousbutton);

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked5 || Clicked6 || Clicked7 || Clicked8){
                    if (Clicked5) {
                        NextPage();
                    }else if (Clicked6) {
                        Clicked5 = true;
                        Clicked6 = false;
                        CMIscore2 = CMIscore2 -2;
                        NextPage();
                    }else if (Clicked7){
                        Clicked5 = true;
                        Clicked7 = false;
                        CMIscore2 = CMIscore2 -3;
                        CMIscore2 = CMIscore2 -2;
                        NextPage();
                    }else {
                        Clicked5 = true;
                        Clicked8 = false;
                        CMIscore2 = CMIscore2 -6;
                        CMIscore2 = CMIscore2 -2;
                        NextPage();
                    }
                }else {
                    Clicked5 = true;
                    CMIscore2 = CMIscore2 -2;
                    NextPage();
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked5 || Clicked6 || Clicked7 || Clicked8){
                    if (Clicked6) {
                        NextPage();
                    }else if (Clicked5) {
                        Clicked6 = true;
                        Clicked5 = false;
                        CMIscore2 = CMIscore2 +2;
                        NextPage();
                    }else if (Clicked7){
                        Clicked6 = true;
                        Clicked7 = false;
                        CMIscore2 = CMIscore2 -3;
                        NextPage();
                    }else {
                        Clicked6 = true;
                        Clicked8 = false;
                        CMIscore2 = CMIscore2 -6;
                        NextPage();
                    }
                }else {
                    Clicked6 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked5 || Clicked6 || Clicked7 || Clicked8){
                    if (Clicked7) {
                        NextPage();
                    } else if (Clicked5) {
                        Clicked7 = true;
                        Clicked5 = false;
                        CMIscore2 = CMIscore2 +2;
                        CMIscore2 = CMIscore2 +3;
                        NextPage();
                    }else if (Clicked6){
                        Clicked7 = true;
                        Clicked6 = false;
                        CMIscore2 = CMIscore2 +3;
                        NextPage();
                    }else {
                        Clicked7 = true;
                        Clicked8 = false;
                        CMIscore2 = CMIscore2 -6;
                        CMIscore2 = CMIscore2 +3;
                        NextPage();
                    }
                }else {
                    Clicked7 = true;
                    CMIscore2 = CMIscore2 +3;
                    NextPage();
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked5 || Clicked6 || Clicked7 || Clicked8){
                    if (Clicked8) {
                        NextPage();
                    } else if (Clicked5) {
                        Clicked8 = true;
                        Clicked5 = false;
                        CMIscore2 = CMIscore2 +2;
                        CMIscore2 = CMIscore2 +6;
                        NextPage();
                    }else if (Clicked6){
                        Clicked8 = true;
                        Clicked6 = false;
                        CMIscore2 = CMIscore2 +6;
                        NextPage();
                    }else {
                        Clicked8 = true;
                        Clicked7 = false;
                        CMIscore2 = CMIscore2 -6;
                        CMIscore2 = CMIscore2 +6;
                        NextPage();
                    }
                }else {
                    Clicked8 = true;
                    CMIscore2 = CMIscore2 +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked5 || Clicked6 || Clicked7 || Clicked8){
                    NextPage();
                }else {
                    Toast.makeText(Study_test2.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
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
        Intent nextpage = new Intent(this, Study_test3.class);
        startActivity(nextpage);
    }

    private void Previouspage() {
        Intent previouspage = new Intent(this, Study_test.class);
        startActivity(previouspage);
    }

}
