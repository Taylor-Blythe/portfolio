package com.example.intentpractice;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity{
    private Button second;
    private EditText secondInformation;

    private TextView secondLBL;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondLBL = findViewById(R.id.secondLBL);
        second = findViewById(R.id.secondBTN);
        secondInformation = findViewById(R.id.secondUI);
        String dataFromPageOne = getIntent().getStringExtra("user input");
        secondLBL.setText(dataFromPageOne);


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set up intent
                Intent i = new Intent(secondActivity.this,ThirdActivity.class);
                i.putExtra("user input",String.valueOf(secondInformation.getText())+" "+dataFromPageOne);
                startActivity(i);
            }
        });
    }
}
