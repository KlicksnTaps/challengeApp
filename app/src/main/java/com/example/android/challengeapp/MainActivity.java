package com.example.android.challengeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.profile_button);
        b2 = findViewById(R.id.andela_button);

    }


    public void profileCall(View view) {
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void andelaCall(View view) {

        Intent intent = new Intent(this, AboutALCPage.class);
        startActivity(intent);

    }
}