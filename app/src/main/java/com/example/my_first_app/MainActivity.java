package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Result;
        EditText edtweight;
        EditText edtheightFt;
        EditText edtheightInch;
        Button btncalc;

        edtweight = findViewById(R.id.edtweight);
        edtheightFt = findViewById(R.id.edtheightFt);
        edtheightInch = findViewById(R.id.edtheightInch);
        btncalc = findViewById(R.id.btncalc);
        Result = findViewById(R.id.txtResult);


        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtweight.getText().toString());
                int ft = Integer.parseInt(edtheightFt.getText().toString());
                int in = Integer.parseInt(edtheightInch.getText().toString());

                int totalIn = ft*12+in;
                double totalcm = totalIn * 2.53;
                double totalm = totalcm / 100;
                double bmi = wt/(totalm*totalm);

                if(bmi>25)
                {
                    Result.setText("You are Overweight");
                }
                else if(bmi<25)
                {
                    Result.setText("You are Underweight");
                }
                else
                {
                    Result.setText("You are healthy");
                }
            }
        });
    }
}




























