package com.example.homescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class Floorplans3 extends AppCompatActivity {
    Button HR_99;
    Button HR_103;
    Button HR_107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floorplans3);

        PhotoView photoView = findViewById(R.id.Plattegrond1);
        photoView.setImageResource(R.drawable.bg107);

        final ImageView imageView = (ImageView) findViewById(R.id.Plattegrond1);
        imageView.setImageResource(R.drawable.bg107);

        final Button FloorButtonbg = (Button) findViewById(R.id.Floor_plan_buttonbg);

        FloorButtonbg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.bg107);
            }
        });
        final Button FloorButton1 = (Button) findViewById(R.id.Floor_plan_button1);

        FloorButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.floor1_107);
            }
        });
        final Button FloorButton2 = (Button) findViewById(R.id.Floor_plan_button2);

        FloorButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.floor2_107);
            }
        });

        final Button FloorButton3 = (Button) findViewById(R.id.Floor_plan_button3);

        FloorButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.floor3_107);
            }
        });

        final Button FloorButton4 = (Button) findViewById(R.id.Floor_plan_button4);

        FloorButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.floor4_107);
            }
        });

        final Button FloorButton5 = (Button) findViewById(R.id.Floor_plan_button5);

        FloorButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.floor5_107);
            }
        });

        HR_99 = findViewById(R.id.HR_99);
        HR_99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent floor1 = new Intent(view.getContext(), Floorplans.class);
                startActivity(floor1);
            }
        });

        HR_103 = findViewById(R.id.HR_103);
        HR_103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent floor2 = new Intent(view.getContext(), Floorplans2.class);
                startActivity(floor2);
            }
        });

        HR_107 = findViewById(R.id.HR_107);
        HR_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent floor3 = new Intent(view.getContext(), Floorplans3.class);
                startActivity(floor3);
            }
        });




    }
}