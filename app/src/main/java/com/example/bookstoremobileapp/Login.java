package com.example.bookstoremobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editTextUsername;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
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
                changeActivityToAbout();
                return true;
            case R.id.nav_login:
                setContentView(R.layout.activity_login);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void changeActivityToAbout() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void registration(View v) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);

    }

    public void login(View v) {
        if (editTextUsername.getText().toString().equals("pera") && editTextPassword.getText().toString().equals("pera.123")) {
            Intent intent = new Intent(this, LoggedInMain.class);
            startActivity(intent);
        } else {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Uneti podaci nisu ispravni! Pokušajte ponovo!",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

    }
}