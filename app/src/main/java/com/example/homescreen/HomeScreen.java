package com.example.homescreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
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
                    startActivityForResult(myIntent,0);;
                }
                if ( id == R.id.mysettings)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent,0);
                }
                if ( id == R.id.myedit)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), InstitutePage.class);
                    startActivityForResult(myIntent,0);
                }
                if ( id == R.id.mysocial)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), questionform.class);
                    startActivityForResult(myIntent,0);
                }

                return true;
            }
        });

        String[] values = new String[]{
                "Informatica  03-12-18", "Technische informatica  03-12-18", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies", "Informatica", "Technische informatica", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies", "Informatica", "Technische informatica", "Communicatie", "Communication and Multimedia Design",
                "Creative Media and Game Technologies"
        };

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        final ListView listView = (ListView) findViewById(R.id.mylist);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent myIntent = new Intent(view.getContext(), InformaticaOpendag.class);
                    startActivityForResult(myIntent, 0 );
                }
                if (position==1){
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent,0);
                }
                if (position==2) {
                    Intent myIntent = new Intent(view.getContext(), Communicatie1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==3) {
                    Intent myIntent = new Intent(view.getContext(), CMD1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==4) {
                    Intent myIntent = new Intent(view.getContext(), CreativeMGT1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==5) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==6) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==7) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==8) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==9) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==10) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==11) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==12) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==13) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position==14) {
                    Intent myIntent = new Intent(view.getContext(), TechnInform1.class);
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
