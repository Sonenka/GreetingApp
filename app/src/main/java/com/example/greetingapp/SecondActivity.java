package com.example.greetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button closeActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameEditText = findViewById(R.id.nameEditText);
        closeActivityButton = findViewById(R.id.closeActivityButton);

        String greeting = getIntent().getStringExtra("greeting");

        closeActivityButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("name", name);
            intent.putExtra("greeting", greeting);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}
