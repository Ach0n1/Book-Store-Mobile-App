package com.example.bookstoremobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class LoggedInMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.logged_in_navigation_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.logged_in_nav_main:
                setContentView(R.layout.activity_logged_in_main);
                return true;
            case R.id.logged_in_nav_about:
                changeActivityToAbout();
                return true;
            case R.id.logged_in_nav_user_data:
                changeActivityToUserData();
                return true;
            case R.id.logout:
                changeActivityToMainLoggedOut();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToAbout() {
        Intent intent = new Intent(this, LoggedInAbout.class);
        startActivity(intent);
    }

    public void changeActivityToMainLoggedOut() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void changeActivityToUserData() {
        Intent intent = new Intent(this, UserData.class);
        startActivity(intent);
    }
}