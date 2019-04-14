package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class timesupScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timesup_screen);

        Button dc = (Button) findViewById(R.id.disconnect_Btn);
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), disconnectScreen.class);
                startActivity(startIntent);
            }
        });

        Button success = (Button) findViewById(R.id.success_Btn);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), successScreen.class);
                startActivity(startIntent);
            }
        });

        Button exit = (Button) findViewById(R.id.exitBtn);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), studentHome.class);
                startActivity(startIntent);
            }
        });
    }
}
