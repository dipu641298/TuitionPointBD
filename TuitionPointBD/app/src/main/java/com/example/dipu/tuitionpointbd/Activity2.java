package com.example.dipu.tuitionpointbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText LoginUserID = (EditText)findViewById(R.id.etLoginUserID);
        final EditText LoginPass = (EditText)findViewById(R.id.etLoginPassword);
        Button LoginButton = (Button) findViewById(R.id.MainLogin);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid = LoginUserID.getText().toString().trim();
                String password = LoginPass.getText().toString().trim();

            }
        });
    }
}
