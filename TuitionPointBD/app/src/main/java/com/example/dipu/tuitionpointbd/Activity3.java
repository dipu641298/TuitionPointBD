package com.example.dipu.tuitionpointbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Activity3 extends AppCompatActivity {

    private DatabaseReference mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        mdata = FirebaseDatabase.getInstance().getReference();
        final EditText FullName = (EditText) findViewById(R.id.etFullName);
        final EditText Occupation = (EditText) findViewById(R.id.etOccupation);
        final EditText Instiute = (EditText) findViewById(R.id.etInstitute);
        final EditText Pre_Area = (EditText) findViewById(R.id.etPreferredArea);
        final EditText User_ID = (EditText) findViewById(R.id.etRegisterUserID);
        final EditText Password = (EditText) findViewById(R.id.etPass);
        final EditText Con_Pass =  (EditText) findViewById(R.id.etConfirmPass);

        Button Submit = (Button) findViewById(R.id.SubmitButton);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = FullName.getText().toString();
                String occupation = Occupation.getText().toString().trim();
                String institute = Instiute.getText().toString().trim();
                String pref_area = Pre_Area.getText().toString().trim();
                String user_id = User_ID.getText().toString().trim();
                String password = Password.getText().toString().trim();
                String con_pass = Con_Pass.getText().toString().trim();


            }
        });

    }
}
