package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {


    private Button Category;
    private Button Account;
    private Button Track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        Category = findViewById(R.id.category);
        Account = findViewById(R.id.account);
        Track = findViewById(R.id.track);

        Category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToCategory = new Intent(HomePage.this, Category.class);
                startActivity(goToCategory);

            }
        });
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToAccount = new Intent(HomePage.this, Account.class);
                startActivity(goToAccount);

            }
        });

        Track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToTrack = new Intent(HomePage.this, TrackOrder.class);
                startActivity(goToTrack);

            }
        });
    }
}
