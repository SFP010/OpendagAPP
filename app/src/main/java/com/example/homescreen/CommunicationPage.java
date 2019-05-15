package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommunicationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_page);

        Button opendayBtn = findViewById(R.id.opendayButton);
        opendayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openComopenday();
            }
        });
    }

    public void openComopenday(){
        Intent intent = new Intent(this,Communicatie1.class);
        startActivity(intent);

    }
}
