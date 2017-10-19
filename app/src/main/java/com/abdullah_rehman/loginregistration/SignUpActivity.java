package com.abdullah_rehman.loginregistration;

import android.app.ProgressDialog;
import android.content.AbstractThreadedSyncAdapter;
import android.os.AsyncTask;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText etName;
    EditText etEmail;
    EditText etPassword;
    EditText etPassword1;
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassword1 = (EditText) findViewById(R.id.etPassword1);
        btnSignup = (Button) findViewById(R.id.btnSignUp);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

    }

    private void registerUser() {
        String name = etName.getText().toString().trim().toLowerCase();
        String email = etEmail.getText().toString().trim().toLowerCase();
        String password = etPassword.getText().toString().trim().toLowerCase();
        String password1 = etPassword1.getText().toString().trim().toLowerCase();

//        register(name, email, password, password1);

        new RegisterUser().execute();
    }

    class RegisterUser extends AsyncTask<String, Void, String> {

        ProgressDialog loading;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            loading = ProgressDialog.show(SignUpActivity.this, "Please wait", null, true, true);

        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }


        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(), "Internet not found please check", Toast.LENGTH_SHORT).show();
        }
    }
}
