package com.example.scifiname;

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
        /*
         * SciFi Name Generator
         * SciFiFirstName = a portion of the FirstName and LastName
         * SciFiLastName = a portion of the City and School
         * SciFiOrigin = a portion of the PetName and SiblingName
         *
         * prints out >> SciFiFirstName SciFiLastName from the planet SciFiOrigin
         *
         * a portion means a random portion of that String
         *   because we need this name to be a unique name, so each time
         *   you run the program a new name will be generated
         */

        //connect a java object to the widget
        EditText firstETXT = findViewById(R.id.FirstEditText10);
        EditText lastETXT = findViewById(R.id.LastEditText);
        EditText cityETXT = findViewById(R.id.CityEditText);
        EditText schoolETXT = findViewById(R.id.SchoolEditText);
        EditText siblingETXT = findViewById(R.id.PetEditText);
        EditText petETXT = findViewById(R.id.SchoolEditText);
        Button generateBTN = findViewById(R.id.generateButton);
        TextView outputTXT = findViewById(R.id.OutputTextView);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randy = new Random();

                String first = String.valueOf(firstETXT.getText());
                String last = String.valueOf(lastETXT.getText());
                String city = String.valueOf(cityETXT.getText());
                String school = String.valueOf(schoolETXT.getText());
                String sibling = String.valueOf(siblingETXT.getText());
                String pet = String.valueOf(petETXT.getText());


                int firstPortion = randy.nextInt(first.length());
                int lastPortion = randy.nextInt(last.length());
                String scifiFirst = first.substring(0,firstPortion)+last.substring(0,lastPortion);
                firstPortion = randy.nextInt(city.length());
                lastPortion = randy.nextInt(school.length());
                String scifiLast = city.substring(0,firstPortion)+school.substring(0,lastPortion);
                firstPortion = randy.nextInt(pet.length());
                lastPortion = randy.nextInt(sibling.length());
                String scifiOrigin = pet.substring(0,firstPortion)+sibling.substring(0,lastPortion);
                outputTXT.setText(scifiFirst+" "+scifiLast+" of the planet " + scifiOrigin);

            }
        });





    }
}