package com.example.api_all.ListView_ArrayAdapter.Example10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.api_all.R;

public class MultiAutoCompleteActivity extends AppCompatActivity {

    String[] cities = {"Hello", "name", "man", "Myself", "MY work", "My computer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete);

        //get url on the element AutoCompleteTextView in markup

        MultiAutoCompleteTextView autoCompleteTextView =  findViewById(R.id.multiply);

        //create adapter for autoComplete element AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, cities);
        autoCompleteTextView.setAdapter(adapter);

        //set comma as separator
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());




    }
}