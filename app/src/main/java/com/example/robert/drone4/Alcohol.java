package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Alcohol extends AppCompatActivity {


    private Button Home;
    private Button Account;
    private ImageView Beer;
    private ImageView Cider;
    private ImageView White;
    private ImageView Red;
    private ImageView Chapagne;
    private ImageView Vodka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohol);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Beer = findViewById(R.id.beer);
        Cider = findViewById(R.id.cider);
        White = findViewById(R.id.white);
        Red = findViewById(R.id.red);
        Chapagne = findViewById(R.id.champagne);
        Vodka = findViewById(R.id.vodka);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Alcohol.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBeer = new Intent(Alcohol.this, BeerItem.class);
                startActivity(goToBeer);
            }
        });
        Cider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCider = new Intent(Alcohol.this, CiderItem.class);
                startActivity(goToCider);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Alcohol.this, Account.class);
                startActivity(goToAccount);

            }
        });
        White.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToWhite= new Intent(Alcohol.this, WhiteItem.class);
                startActivity(goToWhite);

            }
        });
        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToRed = new Intent(Alcohol.this, RedItem.class);
                startActivity(goToRed);

            }
        });
        Chapagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToChapagne = new Intent(Alcohol.this, ChampagneItem.class);
                startActivity(goToChapagne);

            }
        });
        Vodka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToVodka = new Intent(Alcohol.this, VodkaItem.class);
                startActivity(goToVodka);

            }
        });


    }
}
