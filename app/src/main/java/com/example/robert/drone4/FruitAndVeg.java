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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_and_veg);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);
        Apple = findViewById(R.id.apple);

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
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(FruitAndVeg.this, Account.class);
                startActivity(goToAccount);

            }
        });
    }
}
