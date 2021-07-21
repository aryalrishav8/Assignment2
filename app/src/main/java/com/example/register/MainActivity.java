package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.register.RESULT";
    Button btnReg;
    String result;
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
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                String fname = edtFirst.getText().toString();
                String uname = edtUser.getText().toString();
                String password = edtPass.getText().toString();
                String email = edtEmail.getText().toString();
                result = ("Name: \t" + fname + "      Username: \t" + uname + "\nPassword:\t" + password + "\nEmail: \t" + email);
                intent.putExtra(EXTRA_MESSAGE, result);
                startActivity(intent);
            }


        });
    }
}