package com.example.api_all.ListView_ArrayAdapter.Example11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.api_all.R;

public class GridViewActivity extends AppCompatActivity {

    String[] countries = {"keyword", "hello", "heard", "keyword", "laved", "city", "send"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

    //get element GridView
        GridView countriesList = findViewById(R.id.gridview);
        //create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        countriesList.setAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You select: "+ parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }
}