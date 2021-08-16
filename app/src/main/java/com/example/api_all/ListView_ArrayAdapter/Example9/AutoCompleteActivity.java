package com.example.api_all.ListView_ArrayAdapter.Example9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.api_all.R;

public class AutoCompleteActivity extends AppCompatActivity {

    String[] cities = {"hello", "read", "While", "Write", "when", "Then", "face"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        //get url on the element AutoCompleteTextView in markup
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoComplete);

        //create adapter for autocomplete element AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);



    }
}