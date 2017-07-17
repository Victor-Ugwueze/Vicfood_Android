package com.example.gozmanvictor.linear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mybar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mybar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true); //optional
//        getSupportActionBar().setIcon(R.drawable.barlogo); //also displays wide logo

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.search:
                Intent i = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(i);
                return true;
            case R.id.signUp:
                Intent ij = new Intent(MainActivity.this, SignUp.class);
                startActivity(ij);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
