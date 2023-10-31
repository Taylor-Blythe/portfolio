package com.example.intentpractice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private Button third;
    private EditText thirdInformation;

    private TextView thirdLBL;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        thirdLBL = findViewById(R.id.thirdUI);

        thirdLBL.setText(getIntent().getStringExtra("user input"));

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set up intent
                Intent i = new Intent(ThirdActivity.this,MainActivity.class);

                //go to your new activity
                startActivity(i);
            }
        });
    }
}