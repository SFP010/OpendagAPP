package com.example.homescreen;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CMD1 extends AppCompatActivity {
    Button copen;
    Button email, whatsapp, twitter, facebook;
    Button question;
    Button route;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmd1);
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

                else if (id == R.id.contactpage) {
                    Intent myintent = new Intent(nav_view.getContext(), ContactPage.class);
                    startActivityForResult(myintent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }


                return true;
            }
        });
//email, WhatsApp, Facebook and Twitter needed!
        email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:")); //only email apps
                    emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"Spoot@hotmail.nl"});
                    String shareBody = "Hi, 3th of December there is an open day of Communicatie and multimedia design, would you like to come with me? The address is Rotterdam Wijnhaven 107.";
                    String shareSub = "Openday";
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                    emailIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                    if (emailIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(emailIntent);
                    } else {
                        Toast.makeText(CMD1.this, "Email not installed", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wappIntent = new Intent(Intent.ACTION_SEND);
                wappIntent.setType("text/plain");
                wappIntent.setPackage("com.whatsapp");
                wappIntent.putExtra(Intent.EXTRA_TEXT, "Hi, 3th of December there is an open day of Communicatie and multimedia design, would you like to come with me? The address is Rotterdam Wijnhaven 107.");
                if (wappIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(wappIntent);
                } else {
                    Toast.makeText(CMD1.this, "Whatsapp not installed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        twitter = findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitterIntent = new Intent(Intent.ACTION_SEND);
                twitterIntent.setType("text/plain");
                twitterIntent.setPackage("com.twitter.android");
                twitterIntent.putExtra(Intent.EXTRA_TEXT, "Hi, 3th of December there is an open day of Communicatie and multimedia design, would you like to come with me? The address is Rotterdam Wijnhaven 107.");
                if (twitterIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(twitterIntent);
                } else {
                    Toast.makeText(CMD1.this, "Twitter not installed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_SEND);
                facebookIntent.setType("text/plain");
                facebookIntent.setPackage("com.facebook.android");
                facebookIntent.putExtra(Intent.EXTRA_TEXT, "Hi, 3th of December there is an open day of Communicatie and multimedia design, would you like to come with me? The address is Rotterdam Wijnhaven 107.");
                if (facebookIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(facebookIntent);
                } else {
                    Toast.makeText(CMD1.this, "Facebook not installed", Toast.LENGTH_SHORT).show();
                }
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
                startActivity(new Intent(CMD1.this, questionform.class ));
            }
        });
        route = findViewById(R.id.floor_plans);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CMD1.this, Route.class));
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }



}


