package com.example.ilwoof;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            String username = ((EditText)findViewById(R.id.editTextTextPersonName)).getText().toString();;
            String password = ((EditText)findViewById(R.id.editTextTextPassword)).getText().toString();
            if (username.equals("Jack") && password.equals("54321")) {
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Incorrect username or password",
                        Toast.LENGTH_LONG
                ).show();
            }

        });

    }
}