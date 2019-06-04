package com.example.homescreen;

import android.content.Intent;
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

public class InstitutePage extends AppCompatActivity {
    Button Route;
    Button Website;
    Button Floorplans;
    Button Openingshours;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_page);
        dl = (DrawerLayout) findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.myprofile) {
                    Intent myIntent = new Intent(nav_view.getContext(), HomeScreen.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);

                }
                else if (id == R.id.mysettings) {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.myedit) {
                    Intent myIntent = new Intent(nav_view.getContext(), InstitutePage.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.mysocial) {
                    Intent myIntent = new Intent(nav_view.getContext(), questionform.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.studychoice)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Study_test.class);
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





        Route = findViewById(R.id.floor_plans);
        Route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent oproute = new Intent(view.getContext(), ContactPage.class);
                startActivity(oproute);
            }
        });

        Openingshours = findViewById(R.id.opening_hours);
        Openingshours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent opening = new Intent(view.getContext(), openingsHours.class);
                startActivity(opening);
            }
        });

        Floorplans = findViewById(R.id.floor_plans);
        Floorplans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent opfloor = new Intent(view.getContext(), Floorplans.class);
                startActivity(opfloor);

            }
        });

        Website = findViewById(R.id.website);
        Website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent contact = new Intent(view.getContext(), ContactPage.class);
                startActivity(contact);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }
}



