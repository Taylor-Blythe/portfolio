package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox cheese = findViewById(R.id.cheCB);
        CheckBox pepperoni = findViewById(R.id.pepCB);
        CheckBox sausage = findViewById(R.id.sauCB);
        Button orderBTN = findViewById(R.id.orderBTN);
        RadioGroup rbGroup = findViewById(R.id.radioGroup);
        RadioButton smallRB = findViewById(R.id.smallRB);
        RadioButton medRB = findViewById(R.id.medRB);
        RadioButton larRB = findViewById(R.id.larRB);

        orderBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String order = "";
                String topping = "";
                if (cheese.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping = "cheese";
                } else if (pepperoni.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping = "pepperoni";
                } else if (sausage.isChecked()) {
                    TextView t = findViewById(R.id.textView);
                    topping = "sausage";
                }

                if(smallRB.isChecked()){
                    order="small "+topping+" pizza";
                }
                Toast.makeText(MainActivity.this,order,Toast.LENGTH_LONG).show();
                Log.d("Pizza Order",order);


            }
        });
        }
    }