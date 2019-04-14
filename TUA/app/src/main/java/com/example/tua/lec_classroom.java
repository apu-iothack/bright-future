package com.example.tua;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lec_classroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_classroom);

        Button start = (Button)findViewById(R.id.StartTest_Btn);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(lec_classroom.this).create();
                alertDialog.setTitle("Notice");
                alertDialog.setMessage("The test has been initiated.\nNew countdown feature will be introduced soon.\nYou will be redirected back to your home screen.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();

                Intent startIntent = new Intent(getApplicationContext(), lecHome.class);
                startActivity(startIntent);
            }
        });
    }
}
