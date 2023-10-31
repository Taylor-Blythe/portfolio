package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//public for all files to access it
//class -> defining a class for the JVM
//MainActivity -> this is where your entire app starts
//extends AppCompatActivity -> DO NOT TOUCH this is the library to connect the java to XML
public class MainActivity extends AppCompatActivity {
//This overrides the onCreate method in AppCompatActivity -> thi runs on start up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //creating a function or method for the button to do something
    public void sayHello(View v){
        //View v is a object of the View class which assists the button to find this f(x)
        // This oes back to the Model view Controller set up or Game Loop in Love2d
        // v will now allow the XML to see the f(x)
        // YOU MUT DO THIS for using an noClick

        //obtain the info from the widgets
        EditText userInput = findViewById(R.id.userInputEditTextText);
        TextView greetingText = findViewById(R.id.OutputTextView4);


        //output something to the outputTextView
        greetingText.setText("Hi " + userInput.getText() + ", nice to meet you!");
    }

}