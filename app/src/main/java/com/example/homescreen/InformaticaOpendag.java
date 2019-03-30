package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InformaticaOpendag extends AppCompatActivity {
Button copen;
Button share;
Button question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informatica1);

        share = findViewById(R.id.ShareIt);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your body here";
                String shareSub = "Your Subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent, "Share openday"));
            }
        });
        copen = findViewById(R.id.AddToCalender);
        copen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long startTime,endTime;

                String startDate = "2019-01-05";
                Calendar cal = Calendar.getInstance();

                try{
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
                    startTime = date.getTime();
                }

                catch(Exception e) {
                    startTime = cal.getTimeInMillis();
                }

                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", startTime);
                intent.putExtra("allDay", true);
                intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
                intent.putExtra("title", "Openday");
                startActivity(intent);
            }
        });
        question = findViewById(R.id.Questions);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformaticaOpendag.this, questionform.class ));
            }
        });
    }
        }


