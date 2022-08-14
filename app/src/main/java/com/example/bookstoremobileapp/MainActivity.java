package com.example.bookstoremobileapp;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


public class MainActivity extends AppCompatActivity {

    private int loggedIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//                setContentView(R.layout.activity_main);
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





    public void changeToAnaKarenjina(View view) {
        Intent intent = new Intent(this, AnaKarenjina.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }


    public void changeToEvgenijeOnjegin(View view) {
        Intent intent = new Intent(this, EvgenijeOnjegin.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeToDigitalGold(View view) {
        Intent intent = new Intent(this, DigitalGold.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeToWarrior(View view) {
        Intent intent = new Intent(this, Warrior.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeToServeToWin(View view) {
        Intent intent = new Intent(this, ServeToWin.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeToImpureBlood(View view) {
        Intent intent = new Intent(this, ImpureBlood.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }

    public void changeToSemperIdem(View view) {
        Intent intent = new Intent(this, SemperIdem.class);
        intent.putExtra("loggedIn", loggedIn);
        startActivity(intent);
    }
}