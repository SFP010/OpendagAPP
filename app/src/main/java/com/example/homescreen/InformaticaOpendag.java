package com.example.homescreen;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InformaticaOpendag extends AppCompatActivity {
Button copen;
Button share;
Button question;
Button route;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informatica1);
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

                return true;
            }
        });






        share = findViewById(R.id.ShareIt);
        share.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Resources resources = getResources();

                                         Intent myIntent = new Intent();
                                         myIntent.setAction(Intent.ACTION_SEND);
                                         // Native email client doesn't currently support HTML, but it doesn't hurt to try in case they fix it
                                         myIntent.putExtra(Intent.EXTRA_TEXT, Html.fromHtml(resources.getString(R.string.share_email_native)));
                                         myIntent.putExtra(Intent.EXTRA_SUBJECT, resources.getString(R.string.share_email_subject));
                                         myIntent.setType("message/rfc822");

                                         PackageManager pm = getPackageManager();
                                         Intent sendIntent = new Intent(Intent.ACTION_SEND);
                                         sendIntent.setType("text/plain");


                                         Intent openInChooser = Intent.createChooser(myIntent, resources.getString(R.string.share_chooser_text));

                                         List<ResolveInfo> resInfo = pm.queryIntentActivities(sendIntent, 0);
                                         List<LabeledIntent> intentList = new ArrayList<LabeledIntent>();
                                         for (int i = 0; i < resInfo.size(); i++) {
                                             // Extract the label, append it, and repackage it in a LabeledIntent
                                             ResolveInfo ri = resInfo.get(i);
                                             String packageName = ri.activityInfo.packageName;
                                             if (packageName.contains("android.email")) {
                                                 myIntent.setPackage(packageName);
                                             } else if (packageName.contains("twitter") || packageName.contains("facebook") || packageName.contains("mms")) {
                                                 Intent intent = new Intent();
                                                 intent.setComponent(new ComponentName(packageName, ri.activityInfo.name));
                                                 intent.setAction(Intent.ACTION_SEND);
                                                 intent.setType("text/plain");
                                                 if (packageName.contains("twitter")) {
                                                     intent.putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.share_twitter));
                                                 } else if (packageName.contains("facebook")) {
                                                     // Warning: Facebook IGNORES our text. They say "These fields are intended for users to express themselves. Pre-filling these fields erodes the authenticity of the user voice."
                                                     // One workaround is to use the Facebook SDK to post, but that doesn't allow the user to choose how they want to share. We can also make a custom landing page, and the link
                                                     // will show the <meta content ="..."> text from that page with our link in Facebook.
                                                     intent.putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.share_facebook));
                                                 } else if (packageName.contains("mms")) {
                                                     intent.putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.share_sms));
                                                 }

                                                 intentList.add(new LabeledIntent(intent, packageName, ri.loadLabel(pm), ri.icon));
                                             }
                                         }

                                         // convert intentList to array
                                         LabeledIntent[] extraIntents = intentList.toArray(new LabeledIntent[intentList.size()]);

                                         openInChooser.putExtra(Intent.EXTRA_INITIAL_INTENTS, extraIntents);
                                         startActivity(openInChooser);
                                     }
                                 });

        copen = findViewById(R.id.AddToCalender);
        copen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long startTime;

                String startDate = "2018-12-03-13-15";
                Calendar cal = Calendar.getInstance();

                try{
                    Date date = new SimpleDateFormat("yyyy-MM-dd-HH-mm").parse(startDate);
                    startTime = date.getTime();
                }

                catch(Exception e) {
                    startTime = cal.getTimeInMillis();
                }


                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", startTime);
                intent.putExtra("allDay", false);
                intent.putExtra("title", "Openday");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Rotterdam, Wijnhaven 107");
                String endDate = startDate + 1000 * 60 * 60;
                startActivity(intent);


            }
        });
        question = findViewById(R.id.Questions);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformaticaOpendag.this, questionform.class ));
            }
        });

        route = findViewById(R.id.route);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformaticaOpendag.this, Route.class));
            }
        });
    }  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);


    }

}



