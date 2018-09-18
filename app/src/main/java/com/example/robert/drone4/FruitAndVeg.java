package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FruitAndVeg extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private ImageView Apple;
    private ImageView Banana;
    private ImageView Broccoli;
    private ImageView Carrot;
    private ImageView Orange;
    private ImageView Watermelon;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_and_veg);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Apple = findViewById(R.id.chicken);
        Banana = findViewById(R.id.fish);
        Broccoli = findViewById(R.id.shrimp);
        Carrot = findViewById(R.id.burger);
        Orange = findViewById(R.id.beef);
        Watermelon = findViewById(R.id.bacon);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(FruitAndVeg.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });
        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToApple = new Intent(FruitAndVeg.this, AppleItem.class);
                startActivity(goToApple);
            }
        });
        Banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToBanana = new Intent(FruitAndVeg.this, BananaItem.class);
                startActivity(goToBanana);
            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(FruitAndVeg.this, Account.class);
                startActivity(goToAccount);

            }
        });
        Broccoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToBroccoli = new Intent(FruitAndVeg.this, BroccoliItem.class);
                startActivity(goToBroccoli);

            }
        });
        Carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCarrot = new Intent(FruitAndVeg.this, CarrotItem.class);
                startActivity(goToCarrot);

            }
        });
        Orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToOrange = new Intent(FruitAndVeg.this, OrangeItem.class);
                startActivity(goToOrange);

            }
        });
        Watermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToWatermelon = new Intent(FruitAndVeg.this, WatermelonItem.class);
                startActivity(goToWatermelon);

            }
        });
    }
}
