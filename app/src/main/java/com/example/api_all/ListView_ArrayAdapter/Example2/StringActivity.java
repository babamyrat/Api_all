package com.example.api_all.ListView_ArrayAdapter.Example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.api_all.R;

public class StringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);

        // get item ListView
        ListView countriesList = findViewById(R.id.listView);

        //get resources
        String[] countries = getResources().getStringArray(R.array.countries);

        //add adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        //set for list adapter
        countriesList.setAdapter(adapter);

    }

    //StringActivity.java
    //activity_string.xml
    //value.string.xml
}