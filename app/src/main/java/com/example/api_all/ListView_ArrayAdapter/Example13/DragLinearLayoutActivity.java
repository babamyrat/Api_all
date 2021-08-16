package com.example.api_all.ListView_ArrayAdapter.Example13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.api_all.R;
import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class DragLinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_linear_layout);

        DragLinearLayout dragLinearLayout = findViewById(R.id.container);

        for (int i = 0; i < dragLinearLayout.getChildCount(); i++){

            View view = dragLinearLayout.getChildAt(i);

            dragLinearLayout.setViewDraggable(view, view);
        }

    }
}