package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Meats extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private ImageView Chicken;
    private ImageView Fish;
    private ImageView Shrimp;
    private ImageView Burger;
    private ImageView Beef;
    private ImageView Bacon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meats);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Chicken = findViewById(R.id.chicken);
        Fish = findViewById(R.id.fish);
        Shrimp = findViewById(R.id.shrimp);
        Burger = findViewById(R.id.burger);
        Beef = findViewById(R.id.beef);
        Bacon = findViewById(R.id.bacon);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Meats.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChicken = new Intent(Meats.this, Chicken.class);
                startActivity(goToChicken);
            }
        });
        Fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFish = new Intent(Meats.this, Fish.class);
                startActivity(goToFish);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Meats.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Shrimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToShrimp = new Intent(Meats.this, Shrimp.class);
                startActivity(goToShrimp);

            }
        });
        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBurger = new Intent(Meats.this, Burger.class);
                startActivity(goToBurger);

            }
        });
        Beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBeef = new Intent(Meats.this, Beef.class);
                startActivity(goToBeef);

            }
        });
        Bacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBacon = new Intent(Meats.this, Bacon.class);
                startActivity(goToBacon);

            }
        });
    }
}
