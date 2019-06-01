package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.homescreen.R;
import com.example.homescreen.Study_test;
import com.example.homescreen.Study_test2;

//https://github.com/JohnsAndroidStudioTutorials/ChangeTextViewOnButtonClick i used this github repository to figure out how to change text

public class Study_test_results extends AppCompatActivity {

    int oldVaue;

    private Button HomeButton;

    private int CMItotal = Study_test.CMIscore + Study_test2.CMIscore2;
    private int COMtotal = Study_test3.COMscore + Study_test4.COMscore2;
    private int IGOtotal = Study_test5.IGOscore + Study_test6.IGOscore2;
    private int LVGtotal = Study_test7.LVGscore + Study_test8.LVGscore2;
    private int ISOtotal = Study_test9.ISOscore + Study_test10.ISOscore2;
    private int IVLtotal = Study_test11.IVLscore + Study_test12.IVLscore2;
    private int RMItotal = Study_test13.RMIscore + Study_test14.RMIscore2;
    private int Biggest = CMItotal;
    private String Biggest2 = "CMItotal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_test_results);
        HomeButton = (Button)findViewById(R.id.home_button);
        changeTextOnce();


        HomeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Study_test.Clicked1 = false;Study_test.Clicked2 = false;Study_test.Clicked3 = false;Study_test.Clicked4 = false;
                Study_test2.Clicked5 = false;Study_test2.Clicked6 = false;Study_test2.Clicked7 = false;Study_test2.Clicked8 = false;
                Study_test3.Clicked9 = false;Study_test3.Clicked10 = false;Study_test3.Clicked11 = false;Study_test3.Clicked12 = false;
                Study_test4.Clicked13 = false;Study_test4.Clicked14 = false;Study_test4.Clicked15 = false;Study_test4.Clicked16 = false;
                Study_test5.Clicked17 = false;Study_test5.Clicked18 = false;Study_test5.Clicked19 = false;Study_test5.Clicked20 = false;
                Study_test6.Clicked21 = false;Study_test6.Clicked22 = false;Study_test6.Clicked23 = false;Study_test6.Clicked24 = false;
                Study_test7.Clicked25 = false;Study_test7.Clicked26 = false;Study_test7.Clicked27 = false;Study_test7.Clicked28 = false;
                Study_test8.Clicked29 = false;Study_test8.Clicked30 = false;Study_test8.Clicked31 = false;Study_test8.Clicked32 = false;
                Study_test9.Clicked33 = false;Study_test9.Clicked34 = false;Study_test9.Clicked35 = false;Study_test9.Clicked36 = false;
                Study_test10.Clicked37 = false;Study_test10.Clicked38 = false;Study_test10.Clicked39 = false;Study_test10.Clicked40 = false;
                Study_test11.Clicked41 = false;Study_test11.Clicked42 = false;Study_test11.Clicked43 = false;Study_test11.Clicked44 = false;
                Study_test12.Clicked45 = false;Study_test12.Clicked46 = false;Study_test12.Clicked47 = false;Study_test12.Clicked48 = false;
                Study_test13.Clicked49 = false;Study_test13.Clicked50= false;Study_test13.Clicked51 = false;Study_test13.Clicked52 = false;
                Study_test14.Clicked53 = false;Study_test14.Clicked54 = false;Study_test14.Clicked55 = false;Study_test14.Clicked56 = false;

                Study_test.CMIscore=0; Study_test2.CMIscore2=0;
                Study_test3.COMscore=0; Study_test4.COMscore2=0;
                Study_test5.IGOscore=0; Study_test6.IGOscore2=0;
                Study_test7.LVGscore=0; Study_test8.LVGscore2=0;
                Study_test9.ISOscore=0; Study_test10.ISOscore2=0;
                Study_test11.IVLscore=0; Study_test12.IVLscore2=0;
                Study_test13.RMIscore=0; Study_test14.RMIscore2=0;

                Homebutton();
            }
        });
    }


    public void changeTextOnce(){
        final TextView changingText1 = (TextView) findViewById(R.id.text_to_change);
        final TextView changingText2 = (TextView) findViewById(R.id.text_to_change2);
        final TextView changingText3 = (TextView) findViewById(R.id.text_to_change3);
        final TextView textchange = (TextView) findViewById(R.id.text_to_show);
        Button changeTextButton = (Button) findViewById(R.id.change_text_button);


        if (COMtotal > Biggest){
            Biggest = COMtotal;
            Biggest2 = "COMtotal";
        }else if (IGOtotal > Biggest) {
            Biggest2 = "IGOtotal";
            Biggest = IGOtotal;
        }else if (LVGtotal > Biggest) {
            Biggest2 = "LVGtotal";
            Biggest = LVGtotal;
        }else if (ISOtotal > Biggest) {
            Biggest2 = "ISOtotal";
            Biggest = ISOtotal;
        }else if (IVLtotal > Biggest) {
            Biggest2 = "IVLtotal";
            Biggest = IVLtotal;
        }else if (RMItotal > Biggest){
            Biggest2 = "RMItotal";
            Biggest = RMItotal;
        }else{

        }

        if (Biggest2 == "CMItotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Informatica");
                    changingText2.setText("Creative media and games technology");
                    changingText3.setText("Technical informatica");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });

        }else if (Biggest2 == "COMtotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Accountancy");
                    changingText2.setText("Business administration");
                    changingText3.setText("Commercial economy");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2 == "IGOtotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Engineering");
                    changingText2.setText("Civil engineering");
                    changingText3.setText("Urban design");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2 == "LVGtotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Nursing school");
                    changingText2.setText("Obstetrics");
                    changingText3.setText("Medical support");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2 == "ISOtotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Social work");
                    changingText2.setText("Social work and services");
                    changingText3.setText("Pedagogy");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else if (Biggest2 == "IVLtotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Teacher training primary education");
                    changingText2.setText("Academic teacher training");
                    changingText3.setText("English teacher training");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }else { //if (Biggest == "RMItotal") {
            changeTextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changingText1.setText("Maritime officer" );
                    changingText2.setText("Logistics engineering");
                    changingText3.setText("Maritime technology");
                    textchange.setText("These are 3 studies you might be interested in:");
                }
            });
        }


    }




    private void Homebutton() {
        Intent gohome = new Intent(this, HomeScreen.class);
        startActivity(gohome);
    }
}


