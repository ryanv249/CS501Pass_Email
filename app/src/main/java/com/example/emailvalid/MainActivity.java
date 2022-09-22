package com.example.emailvalid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private Button checker;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (TextView) findViewById(R.id.answer);
        email = (EditText) findViewById(R.id.email);
        checker = (Button) findViewById(R.id.checker);

        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = email.getText().toString();

                if (val.indexOf('@') != -1) {
                    answer.setBackgroundColor(Color.parseColor("#55FF00"));
                    answer.setText("VALID EMAIL");
                } else {
                    answer.setBackgroundColor(Color.parseColor("#FF0000"));
                    answer.setText("INVALID EMAIL");
                }
            }
        });
    }
}