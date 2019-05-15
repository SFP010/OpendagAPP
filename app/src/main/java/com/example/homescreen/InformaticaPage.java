package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformaticaPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatica_page);

        Button opendayBtn = findViewById(R.id.ButtonOpenday);
        opendayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpenday();
            }
        });

    }

    public void openOpenday(){
        Intent intent = new Intent(this, InformaticaOpendag.class);
        startActivity(intent);


    }


}
