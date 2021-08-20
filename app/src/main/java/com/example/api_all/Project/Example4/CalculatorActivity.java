package com.example.api_all.Project.Example4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.api_all.R;

public class CalculatorActivity extends AppCompatActivity {

    EditText editText, editText2;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = findViewById(R.id.editTextE4);
        editText2 = findViewById(R.id.editTextE4_2);
        textView = findViewById(R.id.textViewE4);

        button = findViewById(R.id.buttonE3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editText.getText().toString();
                String num2 = editText2.getText().toString();

                textView.setText(num1 + num2);

            }
        });
    }
}