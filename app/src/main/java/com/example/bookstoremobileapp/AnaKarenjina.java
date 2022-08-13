package com.example.bookstoremobileapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AnaKarenjina extends AppCompatActivity {

    private int loggedIn;
    private TextView bookTitleTextView;
    private String bookTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_karenjina);
        bookTitleTextView = findViewById(R.id.bookTitle);
        bookTitle = bookTitleTextView.getText().toString();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            loggedIn = extras.getInt("loggedIn");
        } else {
            loggedIn = 0;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        if (loggedIn == 0){
            inflater.inflate(R.menu.navigation_menu, menu);
        }
        else if (loggedIn == 1){
            inflater.inflate(R.menu.logged_in_navigation_menu, menu);
        }
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
                changeActivityToLogin();
                return true;
            case R.id.logged_in_nav_main:
                changeActivityToMain();
                return true;
            case R.id.logged_in_nav_about:
                changeActivityToAbout();
                return true;
            case R.id.logged_in_nav_recommended:
                changeActivityToRecommendation();
                return true;
            case R.id.logged_in_nav_user_data:
                changeActivityToUserData();
                return true;
            case R.id.logged_in_nav_cart:
                changeActivityToCart();
                return true;
            case R.id.logout:
                changeActivityToMainLoggedOut();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void changeActivityToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);

    }

    public void changeActivityToAbout() {
        Intent intent = new Intent(this, About.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeActivityToLogin() {
        Intent intent = new Intent(this, Login.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeActivityToRecommendation() {
        Intent intent = new Intent(this, Recommendation.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeActivityToUserData() {
        Intent intent = new Intent(this, UserData.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeActivityToCart() {
        Intent intent = new Intent(this, Cart.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeActivityToMainLoggedOut() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("loggedIn", 0);
        startActivity(intent);
    }

    public void recommend(View view) {

//

    }


    public void addToCart(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Knjiga je uspešno dodata u korpu!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void bookComments(View view) {
        Intent intent = new Intent(this, Comments.class);
        intent.putExtra("loggedIn", loggedIn);
        intent.putExtra("bookTitle", bookTitle);
        startActivity(intent);
    }
}