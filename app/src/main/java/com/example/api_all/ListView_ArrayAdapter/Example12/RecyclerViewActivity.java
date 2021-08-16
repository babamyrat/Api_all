package com.example.api_all.ListView_ArrayAdapter.Example12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.api_all.ListView_ArrayAdapter.Example12.adapter.StateAdapter;
import com.example.api_all.ListView_ArrayAdapter.Example12.model.State;
import com.example.api_all.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //initial list initialization
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView12);

        //create adapter
        StateAdapter adapter = new StateAdapter(this, states);
        //set for list adapter
        recyclerView.setAdapter(adapter);
    }

    public void setInitialData() {

        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));
        states.add(new State("hello", "bye", R.mipmap.ic_launcher));

    }
}