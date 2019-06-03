package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CMGTpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmgtpage);

        Button opendayBTN = findViewById(R.id.opendayButton);
        opendayBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOpenday();
            }
        });

    }

    public void openOpenday() {
        Intent intent = new Intent(this, CreativeMGT1.class);
        startActivity(intent);
    }


}
