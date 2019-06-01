package com.example.homescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Studies extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studies);
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

                return true;
            }
        });

        Button informaticaBtn = findViewById(R.id.informaticaClick);
        Button techInformaticaBtn = findViewById(R.id.techinformaticaClick);
        Button communicationBtn = findViewById(R.id.communicationClick);

        informaticaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformaticaPage();
            }

        });

        techInformaticaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTechInformaticaPage();

            }
        });

        communicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommunicationPage();

            }
        });
    }
    public void openInformaticaPage(){
        Intent intent = new Intent(this, InformaticaPage.class);
        startActivity(intent);
    }

    public void openTechInformaticaPage(){
        Intent intent1 = new Intent(this, TechInformaticaPage.class);
        startActivity(intent1);
    }

    public void openCommunicationPage() {
        Intent intent2 = new Intent(this, CommunicationPage.class);
        startActivity(intent2);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);


    }

}
