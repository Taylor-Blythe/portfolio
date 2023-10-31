package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //create global var
    private Button first;
    private EditText firstInformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the java obj with widget
        first = findViewById(R.id.firstBTN);
        firstInformation = findViewById(R.id.firstUi);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set up intent
                Intent i = new Intent(MainActivity.this,secondActivity.class);


                //this is for implicit or passing data
                i.putExtra("user input",String.valueOf(firstInformation.getText()));


                //go to your new activity
                startActivity(i);
            }
        });
    }
}