package com.example.homescreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstitutePage extends AppCompatActivity {
Button Route;
Button Website;
Button Floorplans;
Button Openingshours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_page);

            Website = findViewById(R.id.website);
            Website.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent openweb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hogeschoolrotterdam.nl/"));
                    startActivity(openweb);

                }
            });

            Route = findViewById(R.id.route);
            Route.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent oproute = new Intent(view.getContext(), Route.class);
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

            }
        }



