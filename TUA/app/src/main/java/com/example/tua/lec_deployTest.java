package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lec_deployTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_deploy_test);

        Button deploy1 = (Button) findViewById(R.id.deploy1_btn);
        Button deploy2 = (Button) findViewById(R.id.deploy2_btn);
        Button deploy3 = (Button) findViewById(R.id.deploy3_btn);

        deploy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lec_classroom.class);
                startActivity(startIntent);
            }
        });
        deploy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lec_classroom.class);
                startActivity(startIntent);
            }
        });
        deploy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lec_classroom.class);
                startActivity(startIntent);
            }
        });
    }
}
