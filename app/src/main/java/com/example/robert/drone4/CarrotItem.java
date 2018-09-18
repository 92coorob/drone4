package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarrotItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private  Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrot_item);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(CarrotItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(CarrotItem.this, Account.class);
                startActivity(goToAccount);

            }
        });
    }
}
