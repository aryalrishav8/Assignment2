package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnReg;
    TextView result;
    EditText edtFirst, edtLast, edtUser, edtPass, edtConfPass, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtFirst = (EditText) findViewById(R.id.edtfirstname);
        edtLast = (EditText) findViewById(R.id.edtlastname);
        edtUser = (EditText) findViewById(R.id.edtUsername);
        edtPass = (EditText) findViewById(R.id.edtPass);
        edtConfPass = (EditText) findViewById(R.id.edtConfirmPass);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        //Initialization of Register Button
        btnReg = (Button) findViewById(R.id.button1);
        //Registration button functionality
        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fname = edtFirst.getText().toString();
                String uname = edtUser.getText().toString();
                String password = edtPass.getText().toString();
                String email = edtEmail.getText().toString();
                result = (TextView)findViewById(R.id.textview1);
                result.setText("Name: \t" + fname + "Username: \t" + uname + "\nPassword:\t" + password + "\nEmail: \t" + email);
            }


        });
    }
}