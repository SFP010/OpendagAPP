package com.example.homescreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;

public class Study_test extends AppCompatActivity {

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mNextButton;



    public static int CMIscore = 0;

    public static boolean Clicked1 = false;
    public static boolean Clicked2 = false;
    public static boolean Clicked3 = false;
    public static boolean Clicked4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test);

        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mNextButton = (Button)findViewById(R.id.Nextbutton);


        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked1 || Clicked2 || Clicked3 || Clicked4){
                    if (Clicked1) {
                        NextPage();
                    }else if (Clicked2) {
                        Clicked1 = true;
                        Clicked2 = false;
                        CMIscore = CMIscore -2;
                        NextPage();
                    }else if (Clicked3){
                            Clicked1 = true;
                            Clicked3 = false;
                            CMIscore = CMIscore -3;
                            CMIscore = CMIscore -2;
                            NextPage();
                    }else {
                            Clicked1 = true;
                            Clicked4 = false;
                            CMIscore = CMIscore -6;
                            CMIscore = CMIscore -2;
                            NextPage();
                    }
                }else {
                    Clicked1 = true;
                    CMIscore = CMIscore -2;
                    NextPage();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked1 || Clicked2 || Clicked3 || Clicked4){
                    if (Clicked2) {
                        NextPage();
                    }else if (Clicked1) {
                        Clicked2 = true;
                        Clicked1 = false;
                        CMIscore = CMIscore +2;
                        NextPage();
                    }else if (Clicked3){
                        Clicked2 = true;
                        Clicked3 = false;
                        CMIscore = CMIscore -3;
                        NextPage();
                    }else {
                        Clicked2 = true;
                        Clicked4 = false;
                        CMIscore = CMIscore -6;
                        NextPage();
                    }
                }else {
                    Clicked2 = true;
                    NextPage();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked1 || Clicked2 || Clicked3 || Clicked4){
                    if (Clicked3) {
                        NextPage();
                    } else if (Clicked1) {
                        Clicked3 = true;
                        Clicked1 = false;
                        CMIscore = CMIscore +2;
                        CMIscore = CMIscore +3;
                        NextPage();
                    }else if (Clicked2){
                        Clicked3 = true;
                        Clicked2 = false;
                        CMIscore = CMIscore +3;
                        NextPage();
                    }else {
                        Clicked3 = true;
                        Clicked4 = false;
                        CMIscore = CMIscore -6;
                        CMIscore = CMIscore +3;
                        NextPage();
                    }
                }else {
                    Clicked3 = true;
                    CMIscore = CMIscore +3;
                    NextPage();
                }
            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Clicked1 || Clicked2 || Clicked3 || Clicked4){
                    if (Clicked4) {
                        NextPage();
                    } else if (Clicked1) {
                        Clicked4 = true;
                        Clicked1 = false;
                        CMIscore = CMIscore +2;
                        CMIscore = CMIscore +6;
                        NextPage();
                    }else if (Clicked2){
                        Clicked4 = true;
                        Clicked2 = false;
                        CMIscore = CMIscore +6;
                        NextPage();
                    }else {
                        Clicked4 = true;
                        Clicked3 = false;
                        CMIscore = CMIscore -6;
                        CMIscore = CMIscore +6;
                        NextPage();
                    }
                }else {
                    Clicked4 = true;
                    CMIscore = CMIscore +6;
                    NextPage();
                }
            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Clicked1 || Clicked2 || Clicked3 || Clicked4){
                    NextPage();
                }else {
                    Toast.makeText(Study_test.this, "Please enter the question first", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private void NextPage() {
        Intent nextpage = new Intent(this, Study_test2.class);
        startActivity(nextpage);
    }

}