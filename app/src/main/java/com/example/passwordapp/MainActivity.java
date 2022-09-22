package com.example.passwordapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private EditText pass1;
    private EditText pass2;
    private Button checker;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (TextView) findViewById(R.id.answer);
        pass1 = (EditText) findViewById(R.id.pass1);
        pass2 = (EditText) findViewById(R.id.pass2);
        checker = (Button) findViewById(R.id.checker);

        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = pass1.getText().toString();
                String val2 = pass2.getText().toString();

                if (val1.equals(val2)) {
                    answer.setBackgroundColor(Color.parseColor("#55FF00"));
                    answer.setText("WELCOME USER");
                } else {
                    answer.setBackgroundColor(Color.parseColor("#FF0000"));
                    answer.setText("NOT MATCHING");
                }
            }
        } );
    }
}