package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppleItem extends AppCompatActivity {

    private Button Home;
    private Button Account;
    private  Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_item);

        Home = findViewById(R.id.home);
        Account = findViewById(R.id.account);



        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHomePage = new Intent(AppleItem.this, HomePage.class);
                startActivity(goToHomePage);
            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent goToAccount = new Intent(AppleItem.this, Account.class);
                startActivity(goToAccount);

            }
        });

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent goToAccount = new Intent(AppleItem.this, Account.class);
                startActivity(goToAccount);

            }
        });




    }
}
