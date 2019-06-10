package com.example.homescreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Route extends FragmentActivity implements OnMapReadyCallback {
    EditText title1, title2;
    GoogleMap map;
    Button routeOption;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_xml);
        dl = (DrawerLayout) findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();


        final NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.myprofile) {
                    Intent myIntent = new Intent(nav_view.getContext(), HomeScreen.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                } else if (id == R.id.mysettings) {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                } else if (id == R.id.myedit) {
                    Intent myIntent = new Intent(nav_view.getContext(), InstitutePage.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                } else if (id == R.id.mysocial) {
                    Intent myIntent = new Intent(nav_view.getContext(), questionform.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                } else if (id == R.id.codingquiz) {
                    Intent myIntent = new Intent(nav_view.getContext(), CodingQuizInfo.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                } else if ( id == R.id.studychoice) {
                    Intent myIntent = new Intent(nav_view.getContext(), QuizActivity.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });

        routeOption = findViewById(R.id.routeOption);
        title1 = findViewById(R.id.editText);
        title1.setEnabled(false);
        title2 = findViewById(R.id.editText2);
        title2.setEnabled(false);

        routeOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng HRwijnhaven = new LatLng(51.917261, 4.484192);
        map.addMarker(new MarkerOptions().position(HRwijnhaven).title("Hogeschool Rotterdam Wijnhaven"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(HRwijnhaven,13));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

}
