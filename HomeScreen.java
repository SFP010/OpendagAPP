package com.example.homescreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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

        Button InformButton = findViewById(R.id.InformClick);
        InformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage1();
            }
        });


        Button TechButton = findViewById(R.id.TechClick);
        TechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage2();
            }
        });


        Button CreativeButton = findViewById(R.id.CreativeClick);
        CreativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage3();
            }
        });

        Button CMDButton = findViewById(R.id.cmdClick);
        CMDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage4();
            }
        });

        final NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if ( id == R.id.myprofile)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), HomeScreen.class);
                    startActivityForResult(myIntent,0);
                }
                if ( id == R.id.mysettings)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent,0);
                }
                if ( id == R.id.myedit)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
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

    }

    private void openpage4() {
        Intent intent4 = new Intent(this, CMD1.class);
        startActivity(intent4);
    }

    private void openpage3() {
        Intent intent3 = new Intent(this, CreativeMGT1.class);
        startActivity(intent3);
    }

    private void openpage2() {
        Intent intent2 = new Intent(this, TechnInform1.class);
        startActivity(intent2);
    }

    public void openpage1() {
        Intent intent1 = new Intent(this, InformaticaOpendag.class);
        startActivity(intent1);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

}
