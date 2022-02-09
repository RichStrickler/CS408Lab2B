package com.example.cs408lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textTop;
    private TextView textBottom;

    private EditText fahrenheit;
    private EditText celsius;

    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTop = findViewById(R.id.textTop);
        textBottom = findViewById(R.id.textBottom);

        fahrenheit = findViewById(R.id.fahrenheit);
        celsius = findViewById(R.id.celsius);

        convert = findViewById(R.id.convert);

        findViewById(R.id.convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {


                    if (!fahrenheit.getText().toString().isEmpty()) {
                        int degreesF = Integer.parseInt(fahrenheit.getText().toString());

                        float celsiusOut = 0;

                        celsiusOut = ((degreesF - 32) * 5) / 9;

                        String output;

                        output = "" + celsiusOut;

                        celsius.setText(output);

                    } else if (fahrenheit.getText().toString().isEmpty() && !celsius.toString().isEmpty()) {
                        int degreesC = Integer.parseInt(celsius.getText().toString());

                        float fahrenheitOut = 0;

                        fahrenheitOut = (degreesC * (9/5))+32;

                        String output;

                        output = "" + fahrenheitOut;

                        fahrenheit.setText(output);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }
        });


    }
}