package com.example.bookstoremobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                setContentView(R.layout.activity_main);
                return true;
            case R.id.nav_about:
                changeActivityToAbout();
                return true;
            case R.id.nav_login:
                changeActivityToLogin();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToAbout() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void changeActivityToLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}