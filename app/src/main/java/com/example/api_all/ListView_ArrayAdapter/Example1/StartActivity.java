package com.example.api_all.ListView_ArrayAdapter.Example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.api_all.R;

public class StartActivity extends AppCompatActivity {
    // набор данных, которые свяжем со списком

    //dataset to link to the list
    String[] countries = {"Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        // get item ListView
        ListView countriesList = findViewById(R.id.listView);

        // add adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        // set for list adapter
        countriesList.setAdapter(adapter);

    }
    //StartActivity.java
    //activity_start.xml
}