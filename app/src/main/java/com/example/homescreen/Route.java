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

}
