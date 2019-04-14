package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class studentHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);

        Button btnresult = (Button) findViewById(R.id.studentResults_Btn);
        Button btnprofile = (Button) findViewById(R.id.studentProfile_Btn);
        Button btnclassroom = (Button) findViewById(R.id.studentAnswer_Btn);


        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), studentResults.class);
                startActivity(startIntent);
            }
        });

        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), studentProfile.class);
                startActivity(startIntent);
            }
        });

        btnclassroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), studentAnswers.class);
                startActivity(startIntent);
            }
        });
    }
}