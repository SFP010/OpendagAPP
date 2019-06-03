package com.example.homescreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class  HomeScreen extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
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

        String[] values = new String[]{
                "The first open day", "Informatica  03-12-18", "Technische informatica  03-12-18", "Communicatie 03-12-18", "Communication and Multimedia Design 03-12-18",
                "Creative Media and Game Technologies 03-12-18", "","The second open day" ,"Informatica 23-02-19", "Technische informatica 23-02-19", "Communicatie 23-02-19", "Communication and Multimedia Design 23-02-19",
                "Creative Media and Game Technologies 23-02-19", "", "The third open day", "Informatica 04-04-19", "Technische informatica 04-04-19", "Communicatie 04-04-19", "Communication and Multimedia Design 04-04-19",
                "Creative Media and Game Technologies 04-04-19"
        };

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        final ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), InformaticaOpendag.class);
                    startActivityForResult(myIntent, 0 );
                }
                if (position==2){
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent,0);
                }
                if (position==3) {
                    Intent myIntent = new Intent(view.getContext(), Communicatie1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==4) {
                    Intent myIntent = new Intent(view.getContext(), CMD1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==5) {
                    Intent myIntent = new Intent(view.getContext(), CreativeMGT1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==8) {
                    Intent myIntent = new Intent(view.getContext(), InformaticaOpendag2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==9) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==10) {
                    Intent myIntent = new Intent(view.getContext(), Communicatie2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==11) {
                    Intent myIntent = new Intent(view.getContext(), CMD2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==12) {
                    Intent myIntent = new Intent(view.getContext(), Creativemgt2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==15) {
                    Intent myIntent = new Intent(view.getContext(), InformaticaOpendag3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==16) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==17) {
                    Intent myIntent = new Intent(view.getContext(), Communicatie3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==18) {
                    Intent myIntent = new Intent(view.getContext(), CMD3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==19) {
                    Intent myIntent = new Intent(view.getContext(), Creativemgt3.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);


    }

}
