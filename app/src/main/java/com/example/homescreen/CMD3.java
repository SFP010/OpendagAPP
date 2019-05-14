package com.example.homescreen;

import android.content.ContentValues;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CMD3 extends AppCompatActivity {
    Button copen;
    Button share;
    Button question;
    Button route;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmd3);

        share = findViewById(R.id.ShareIt);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Hi do you want to come to the openday with me?";
                String shareSub = "Openday";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent, "Share openday"));
            }
        });
        copen = findViewById(R.id.AddToCalender);
        copen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long startTime;

                String startDate = "2019-01-05-13-15";
                Calendar cal = Calendar.getInstance();

                try{
                    Date date = new SimpleDateFormat("yyyy-MM-dd-HH-mm").parse(startDate);
                    startTime = date.getTime();
                }

                catch(Exception e) {
                    startTime = cal.getTimeInMillis();
                }


                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", startTime);
                intent.putExtra("allDay", false);
                intent.putExtra("title", "Openday");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Rotterdam, Wijnhaven 107");
                String endDate = startDate + 1000 * 60 * 60;
                startActivity(intent);


            }
        });
        question = findViewById(R.id.Questions);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CMD3.this, questionform.class ));
            }
        });
        route = findViewById(R.id.route);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CMD3.this, Route.class));
            }
        });
    }
}