package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Beverages extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private ImageView Coke;
    private ImageView Sprite;
    private ImageView Fanta;
    private ImageView Lipton;
    private ImageView Water;
    private ImageView Chocolate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Coke = findViewById(R.id.coke);
        Sprite = findViewById(R.id.sprite);
        Fanta = findViewById(R.id.fanta);
        Lipton = findViewById(R.id.lipton);
        Water = findViewById(R.id.water);
        Chocolate = findViewById(R.id.chocolate);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(Beverages.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Coke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCoke = new Intent(Beverages.this, CokeItem.class);
                startActivity(goToCoke);
            }
        });
        Sprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFish = new Intent(Beverages.this, SpriteItem.class);
                startActivity(goToFish);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(Beverages.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Fanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToFanta= new Intent(Beverages.this, FantaItem.class);
                startActivity(goToFanta);

            }
        });
        Lipton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToLipton = new Intent(Beverages.this, lipton.class);
                startActivity(goToLipton);

            }
        });
        Water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToWater = new Intent(Beverages.this, WaterItem.class);
                startActivity(goToWater);

            }
        });
        Chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToChocolate = new Intent(Beverages.this, ChocolateItem.class);
                startActivity(goToChocolate);

            }
        });
    }
}
