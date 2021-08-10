package com.example.api_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.api_all.ListView_ArrayAdapter.Example1.StartActivity;
import com.example.api_all.ListView_ArrayAdapter.Example2.StringActivity;
import com.example.api_all.ListView_ArrayAdapter.Example3.ListViewActivity;
import com.example.api_all.ListView_ArrayAdapter.Example4.AddAllActivity;

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
                Intent intent = new Intent(MainActivity.this, AddAllActivity.class);
                startActivity(intent);
            }
        });
    }

}