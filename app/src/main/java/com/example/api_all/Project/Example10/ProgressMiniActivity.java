package com.example.api_all.Project.Example10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.api_all.R;
import com.qifan.library.ChatTypingIndicatorView;

public class ProgressMiniActivity extends AppCompatActivity {

    Button message;
    ChatTypingIndicatorView indicatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_mini);

       message = findViewById(R.id.buttonE10);
       indicatorView = findViewById(R.id.indicatorView);

       message.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               indicatorView.setVisibility(View.INVISIBLE);
           }
       });

    }
}