package com.example.homescreen;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questionform extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionform_activity);
        dl = (DrawerLayout)findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if ( id == R.id.myprofile)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), HomeScreen.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.mysettings)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Studies.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.myedit)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), InstitutePage.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.mysocial)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), questionform.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.studychoice)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Study_test.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if ( id == R.id.studychoice)
                {
                    Intent myIntent = new Intent(nav_view.getContext(), Study_test.class);
                    startActivityForResult(myIntent,0);
                    dl.closeDrawer(GravityCompat.START);
                }
                else if (id == R.id.codingquiz) {
                    Intent myIntent = new Intent(nav_view.getContext(), CodingQuizInfo.class);
                    startActivityForResult(myIntent, 0);
                    dl.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });

        final EditText nameEdit = (EditText) findViewById(R.id.nameEdit);
        final EditText emailEdit = (EditText) findViewById(R.id.emailEdit);
        final EditText subjectEdit = (EditText) findViewById(R.id.phoneEdit);
        final EditText questionEdit = (EditText) findViewById(R.id.questionEdit);

        Button sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEdit.getText().toString();
                String email = emailEdit.getText().toString();
                String subject = subjectEdit.getText().toString();
                String question = questionEdit.getText().toString();
                if (TextUtils.isEmpty(name)){
                    nameEdit.setError("Enter a name");
                    nameEdit.requestFocus();
                    return;
                }
                Boolean onError = false;
                if (!isValidEmail(email)){
                    onError = true;
                    emailEdit.setError("Invalid email adress");
                    return;
                }
                if (TextUtils.isEmpty(subject)){
                    subjectEdit.setError("Enter a subject");
                    subjectEdit.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(question)){
                    questionEdit.setError("Enter a question");
                    questionEdit.requestFocus();
                    return;
                }

                Intent sendEmail = new Intent(android.content.Intent.ACTION_SEND);


                sendEmail.setType("plain/text");
                sendEmail.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"timopolderman@gmail.com"});
                sendEmail.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
                sendEmail.putExtra(android.content.Intent.EXTRA_TEXT,
                        "Name: "+name+'\n'+"Email ID: "+email+'\n'+" Question: "+'\n'+question);


                startActivity(Intent.createChooser(sendEmail, "Send mail..."));
            }
        });


    }

    // email check

    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);


    }

}


