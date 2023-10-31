package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText adjective1 = findViewById(R.id.adjective1);
        EditText noun1 = findViewById(R.id.noun1);
        EditText verb1 = findViewById(R.id.verb1);
        EditText adjective2 = findViewById(R.id.adjective2);
        EditText noun2 = findViewById(R.id.noun2);
        EditText adverb1 = findViewById(R.id.adverb);
        EditText verb2 = findViewById(R.id.verb2);
        EditText adjective3 = findViewById(R.id.adjective3);

        Button madLib1 = findViewById(R.id.madLib1);
        Button madLib2 = findViewById(R.id.madLib2);
        Button madLib3 = findViewById(R.id.madLib3);
        Button Rando = findViewById(R.id.randomizer);
        TextView textLib1 = findViewById(R.id.libText1);
        TextView textLib2 = findViewById(R.id.libText2);
        TextView textLib3 = findViewById(R.id.libText3);


        Rando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rando = new Random();
                int lib = rando.nextInt(3) + 1;

                String adjectiveFirst = String.valueOf(adjective1.getText());
                String nounFirst = String.valueOf(noun1.getText());
                String verbFirst = String.valueOf(verb1.getText());
                String adjectiveSecond = String.valueOf(adjective2.getText());
                String nounSecond = String.valueOf(noun2.getText());
                String adverbFirst = String.valueOf(adverb1.getText());
                String verbSecond = String.valueOf(verb2.getText());
                String adjectiveThird = String.valueOf(adjective3.getText());



                if(lib == 1) {
                    textLib3.setVisibility(View.GONE);
                    textLib3.setVisibility(View.GONE);
                    textLib1.setVisibility(View.VISIBLE);
                    textLib1.setText("In a " + adjectiveFirst + " land, there was a curious " + nounFirst + " who loved to " + verbFirst + " with " + adjectiveSecond + " " + nounSecond + "s. One day, they " + adverbFirst + " " + verbSecond + adjectiveThird + " and discovered a hidden treasure!");
                } else if (lib == 2) {
                    textLib1.setVisibility(View.GONE);
                    textLib3.setVisibility(View.GONE);
                    textLib2.setVisibility(View.VISIBLE);
                    textLib2.setText("The" + " " + adjectiveFirst + " " + nounFirst + " " + "decided to " + verbFirst + " " + "in the " + " " + adjectiveSecond + " " + nounSecond + " " + adverbFirst + "." + " " + "They planned to" + " " + verbSecond + " " + adjectiveThird + " " + "and create something truly great.");
                } else {
                    textLib1.setVisibility(View.GONE);
                    textLib2.setVisibility(View.GONE);
                    textLib3.setVisibility(View.VISIBLE);
                    textLib3.setText("The " + adjectiveFirst + " " + nounFirst + " wanted to " + verbFirst + " with " + adjectiveSecond + " " + nounSecond + " " + adverbFirst + "." + " They decided to " + verbSecond + " " + adjectiveThird + ".");
                }
            }
        });

        madLib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adjectiveFirst = String.valueOf(adjective1.getText());
                String nounFirst = String.valueOf(noun1.getText());
                String verbFirst = String.valueOf(verb1.getText());
                String adjectiveSecond = String.valueOf(adjective2.getText());
                String nounSecond = String.valueOf(noun2.getText());
                String adverbFirst = String.valueOf(adverb1.getText());
                String verbSecond = String.valueOf(verb2.getText());
                String adjectiveThird = String.valueOf(adjective3.getText());
                textLib3.setVisibility(View.GONE);
                textLib2.setVisibility(View.GONE);
                textLib1.setVisibility(View.VISIBLE);
                textLib1.setText("In a " + adjectiveFirst + " land, there was a curious " + nounFirst + " who loved to " + verbFirst + " with " + adjectiveSecond + " " + nounSecond + "s. One day, they " + adverbFirst + " " + verbSecond + adjectiveThird + " and discovered a hidden treasure!");
            }
        });

        madLib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adjectiveFirst = String.valueOf(adjective1.getText());
                String nounFirst = String.valueOf(noun1.getText());
                String verbFirst = String.valueOf(verb1.getText());
                String adjectiveSecond = String.valueOf(adjective2.getText());
                String nounSecond = String.valueOf(noun2.getText());
                String adverbFirst = String.valueOf(adverb1.getText());
                String verbSecond = String.valueOf(verb2.getText());
                String adjectiveThird = String.valueOf(adjective3.getText());
                textLib3.setVisibility(View.GONE);
                textLib2.setVisibility(View.VISIBLE);
                textLib1.setVisibility(View.GONE);
                textLib2.setText("The" + " " + adjectiveFirst + " " + nounFirst + " " + "decided to " + verbFirst + " " + "in the " + " " + adjectiveSecond + " " + nounSecond + " " + adverbFirst + "." + " " + "They planned to" + " " + verbSecond + " " + adjectiveThird + " " + "and create something truly great.");

            }
        });

        madLib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adjectiveFirst = String.valueOf(adjective1.getText());
                String nounFirst = String.valueOf(noun1.getText());
                String verbFirst = String.valueOf(verb1.getText());
                String adjectiveSecond = String.valueOf(adjective2.getText());
                String nounSecond = String.valueOf(noun2.getText());
                String adverbFirst = String.valueOf(adverb1.getText());
                String verbSecond = String.valueOf(verb2.getText());
                String adjectiveThird = String.valueOf(adjective3.getText());
                textLib3.setVisibility(View.VISIBLE);
                textLib2.setVisibility(View.GONE);
                textLib1.setVisibility(View.GONE);
                textLib3.setText("The " + adjectiveFirst + " " + nounFirst + " wanted to " + verbFirst + " with " + adjectiveSecond + " " + nounSecond + " " + adverbFirst + "." + " They decided to " + verbSecond + " " + adjectiveThird + ".");


            }
        });
    }
}