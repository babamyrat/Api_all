package com.example.api_all.Project.Example9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.api_all.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ListOkActivity extends AppCompatActivity {

 private SwipeRefreshLayout swipeRefreshLayout;
  ListView listView;
  ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hello", "How", "Click", "Push", "Say", "Get", "Set", "Full", "Java", "change", "String", "keyword"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ok);

        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        listView = findViewById(R.id.listOk);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefreshLayout.setRefreshing(false);

                shuffleListItem();
            }
        });
    }

    private void shuffleListItem() {

        Collections.shuffle(arrayList, new Random(System.currentTimeMillis()));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

    }
}