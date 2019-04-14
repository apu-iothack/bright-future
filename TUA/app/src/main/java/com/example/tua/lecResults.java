package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lecResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_results);

        Button result1 = (Button) findViewById(R.id.lecAnnounce1_Btn);
        Button result2 = (Button) findViewById(R.id.lecAnnounce2_Btn);
        Button result3 = (Button) findViewById(R.id.lecAnnounce3_btn);

        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecAnnouce.class);
                startActivity(startIntent);
            }
        });
        result2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecAnnouce.class);
                startActivity(startIntent);
            }
        });
        result3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecAnnouce.class);
                startActivity(startIntent);
            }
        });
    }
}
