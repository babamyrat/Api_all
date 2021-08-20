package com.example.api_all.ListView_ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.api_all.ListView_ArrayAdapter.Example1.StartActivity;
import com.example.api_all.ListView_ArrayAdapter.Example10.MultiAutoCompleteActivity;
import com.example.api_all.ListView_ArrayAdapter.Example11.GridViewActivity;
import com.example.api_all.ListView_ArrayAdapter.Example12.RecyclerViewActivity;
import com.example.api_all.ListView_ArrayAdapter.Example13.DragLinearLayoutActivity;
import com.example.api_all.ListView_ArrayAdapter.Example2.StringActivity;
import com.example.api_all.ListView_ArrayAdapter.Example3.ListViewActivity;
import com.example.api_all.ListView_ArrayAdapter.Example4.AddAllActivity;
import com.example.api_all.ListView_ArrayAdapter.Example5.AdapterTreeActivity;
import com.example.api_all.ListView_ArrayAdapter.Example6.HelloActivity;
import com.example.api_all.ListView_ArrayAdapter.Example7.SpinnerActivity;
import com.example.api_all.ListView_ArrayAdapter.Example8.SpinnerBigActivity;
import com.example.api_all.ListView_ArrayAdapter.Example9.AutoCompleteActivity;
import com.example.api_all.MainActivity;
import com.example.api_all.R;

public class ListAdapterActivity extends AppCompatActivity {

    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter);

        card1 = findViewById(R.id.cardNum1);
        card2 = findViewById(R.id.cardNum2);
        card3 = findViewById(R.id.cardNum3);
        card4 = findViewById(R.id.cardNum4);
        card5 = findViewById(R.id.cardNum5);
        card6 = findViewById(R.id.cardNum6);
        card7 = findViewById(R.id.cardNum7);
        card8 = findViewById(R.id.cardNum8);
        card9 = findViewById(R.id.cardNum9);
        card10 = findViewById(R.id.cardNum10);
        card11 = findViewById(R.id.cardNum11);
        card12 = findViewById(R.id.cardNum12);
        card13 = findViewById(R.id.cardNum13);

        card1.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, StartActivity.class)));
        card2.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, StringActivity.class)));
        card3.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, ListViewActivity.class)));
        card4.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, AddAllActivity.class)));
        card5.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, AdapterTreeActivity.class)));
        card6.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, HelloActivity.class)));
        card7.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, SpinnerActivity.class)));
        card8.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, SpinnerBigActivity.class)));
        card9.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, AutoCompleteActivity.class)));
        card10.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, MultiAutoCompleteActivity.class)));
        card11.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, GridViewActivity.class)));
        card12.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, RecyclerViewActivity.class)));
        card13.setOnClickListener(view -> startActivity(new Intent(ListAdapterActivity.this, DragLinearLayoutActivity.class)));
    }
}