package com.example.api_all.Project.Example8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.api_all.R;

import java.util.ArrayList;
import java.util.List;

public class TestOneActivity extends AppCompatActivity {

    List<Test> tests = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_one);

        recyclerView = findViewById(R.id.recyclerViewTest);

        TestAdapter adapter = new TestAdapter(tests, this);
        recyclerView.setAdapter(adapter);

        initData();

    }

    private void initData() {
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
        tests.add(new Test("hello", R.mipmap.ic_launcher, 1));
    }
}