package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lecSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_settings1);

        Button setQuestion = (Button) findViewById(R.id.SetQuestion_Btn);
        Button deployTest = (Button) findViewById(R.id.deployTest_btn);

        setQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lecQuestions.class);
                startActivity(startIntent);
            }
        });
        deployTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), lec_deployTest.class);
                startActivity(startIntent);
            }
        });
    }
}
