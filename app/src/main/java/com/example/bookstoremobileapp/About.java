package com.example.bookstoremobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_main:
                changeActivityToMain();
                return true;
            case R.id.nav_about:
                setContentView(R.layout.activity_about);
                return true;
            case R.id.nav_login:
                changeActivityToLogin();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void changeActivityToLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}