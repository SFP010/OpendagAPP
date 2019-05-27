package com.example.homescreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_page);

        Button websiteBtn = findViewById(R.id.website);
        Button routeBtn = findViewById(R.id.route);
        Button questionBtn = findViewById(R.id.question);

        routeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRoute();
            }
        });

        questionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion();
            }
        });

        websiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite();
            }


        });




    }
    public void openRoute(){
        Intent intent = new Intent(this, Route.class);
        startActivity(intent);
    }


    public void openQuestion(){
        Intent intent = new Intent(this, questionform.class);
        startActivity(intent);
    }

    public void openWebsite(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hogeschoolrotterdam.nl"));
        startActivity(intent);
    }

}
