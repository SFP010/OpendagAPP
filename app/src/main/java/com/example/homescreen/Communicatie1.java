package com.example.homescreen;

import android.content.ContentValues;
import android.content.Intent;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Communicatie1 extends AppCompatActivity {
    Button copen;
    Button share;
    Button question;
    Button route;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.communicatie1);
        dl = (DrawerLayout)findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if ( id == R.id.myprofile)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), HomeScreen.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.mysettings)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.myedit)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), InstitutePage.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.mysocial)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), questionform.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.studychoice)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Study_test.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.codingquiz) {
                    Intent myIntent = new Intent(nav_view.getContext(), CodingQuizInfo.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });

        share = findViewById(R.id.ShareIt);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Hi, 3th of December there is an open day of Communicatie, would you like to come with me? The address is Rotterdam Wijnhaven 107.";
                String shareSub = "openday";
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

                String startDate = "2018-12-03-13-15";
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
                startActivity(new Intent(Communicatie1.this, questionform.class ));
            }
        });
        route = findViewById(R.id.route);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Communicatie1.this, Route.class));
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);


    }

}


