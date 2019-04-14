package com.example.tua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.Login_Btn);
        final EditText login_id = (EditText) findViewById(R.id.LoginID_EditText);
        final String ID = login_id.getText().toString();
        EditText password = (EditText) findViewById(R.id.Password_EditText);
        final String pw = password.getText().toString();

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(login_id.getText().toString().trim().equals("L")){
                    Intent startIntent = new Intent(getApplicationContext(), lecHome.class);
                    startActivity(startIntent);
                }
                else if (login_id.getText().toString().trim().equals("S")){
                    Intent startIntent = new Intent(getApplicationContext(), studentHome.class);
                    startActivity(startIntent);
                }
                //Intent startIntent = new Intent(getApplicationContext(), lecSettings.class);
                //startActivity(startIntent);
            }
        });
    }
}
