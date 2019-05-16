package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TechInformaticaPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_informatica_page);

        Button opendayBtns = findViewById(R.id.btnOpendays);
        opendayBtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpendays();
            }
        });
    }

    public void openOpendays(){
        Intent intent = new Intent(this, TechnInform1.class);
        startActivity(intent);


    }

}
