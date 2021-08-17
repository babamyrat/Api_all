package com.example.api_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.api_all.ListView_ArrayAdapter.Example13.DragLinearLayoutActivity;
import com.example.api_all.Projct.Example1.SplashActivity;
import com.example.api_all.Projct.Example2.ViewDispleyActivity;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewDispleyActivity.class);
                startActivity(intent);
            }
        });
    }
}