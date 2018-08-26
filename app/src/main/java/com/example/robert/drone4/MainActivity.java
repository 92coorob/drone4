package com.example.robert.drone4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Info = findViewById(R.id.info);
        Login = findViewById(R.id.login);

        Info.setText("Attempts Remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if ((userName.equals("cp3407")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, HomePage.class);
            startActivity(intent);}
        if ((userName.equals("rcook")) && (userPassword.equals("test"))){
            Intent rob = new Intent(MainActivity.this, HomePage.class);
            startActivity(rob);
        }else{
            counter--;
            Info.setText(String.format("Attempts Remaining: %s", String.valueOf(counter)));
            if (counter == 0){
                Login.setEnabled(false);
            }

        }
    }
}
