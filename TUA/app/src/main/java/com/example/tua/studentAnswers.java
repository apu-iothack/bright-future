package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class studentAnswers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_answers);

        Button btnsubmit = (Button) findViewById(R.id.studentSubmit_Btn);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), successScreen.class);
                startActivity(startIntent);
            }
        });

        final TextView sec = (TextView) findViewById(R.id.second);
        new CountDownTimer(20000, 1000) {
            public void onTick(long millisUntilFinished) {
                long new_sec = millisUntilFinished/1000;
                String Sec = Long.toString(new_sec);
                sec.setText(Sec);
            }
            public void onFinish() {
                Intent startIntent = new Intent(getApplicationContext(), timesupScreen.class);
                startActivity(startIntent);
            }
        }.start();
    }
}
