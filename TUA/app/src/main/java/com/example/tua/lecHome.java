package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lecHome extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_home);

        Button result = (Button) findViewById(R.id.lecResult_Btn);
        Button profile = (Button) findViewById(R.id.lecProfile_Btn);
        Button settings = (Button) findViewById(R.id.lecSettings_Btn);


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),lecResults.class);
                startActivity(startIntent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecProfile.class);
                startActivity(startIntent);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecSettings.class);
                startActivity(startIntent);
            }
        });

    }
}
