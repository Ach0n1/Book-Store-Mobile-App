package com.example.bookstoremobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class UserData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);
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
                changeActivityToMainLoggedIn();
                return true;
            case R.id.logged_in_nav_about:
                changeActivityToAboutLoggedIn();
                return true;
            case R.id.logout:
                changeActivityToMain();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToMainLoggedIn() {
        Intent intent = new Intent(this, LoggedInMain.class);
        startActivity(intent);
    }

    public void changeActivityToAboutLoggedIn() {
        Intent intent = new Intent(this, LoggedInAbout.class);
        startActivity(intent);
    }

    public void changeActivityToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void saveChanges(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Izmene su sačuvane",
                Toast.LENGTH_SHORT);

        toast.show();

    }
}