package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Category extends AppCompatActivity {
    private Button Home;
    private Button Account;
    private ImageView Fruit;
    private ImageView Meat;
    private ImageView Beverages;
    private ImageView Alcohol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Fruit = findViewById(R.id.fruitveg);
        Meat = findViewById(R.id.meat);
        Beverages = findViewById(R.id.beverages);
        Alcohol = findViewById(R.id.alcohol);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Category.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Category.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFruitAndVeg = new Intent(Category.this, FruitAndVeg.class);
                startActivity(goToFruitAndVeg);
            }
        });
        Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMeats = new Intent(Category.this, Meats.class);
                startActivity(goToMeats);
            }
        });
        Beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBeverages = new Intent(Category.this, Beverages.class);
                startActivity(goToBeverages);
            }
        });

        Alcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAlcohol = new Intent(Category.this, Alcohol.class);
                startActivity(goToAlcohol);
            }
        });

    }
}