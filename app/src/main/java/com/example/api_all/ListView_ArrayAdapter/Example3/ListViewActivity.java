package com.example.api_all.ListView_ArrayAdapter.Example3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.api_all.R;

public class ListViewActivity extends AppCompatActivity {

    String[] countries = { "Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //get item TextView
        TextView selection = findViewById(R.id.txtView3);

        //get item ListView
        ListView countriesList = findViewById(R.id.ListView3);

        //Add adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, countries);

        countriesList.setAdapter(adapter);
        //set for item adapter
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
             /**   parent : нажатый элемент AdapterView (в роли которого в данном случае выступает наш элемент ListView)
                   view : нажатый виджет внутри AdapterView
                   position : индекс нажатого виждета внутри AdapterView
                   id : идентификатор строки нажатого элемента*/
                SparseBooleanArray selected = countriesList.getCheckedItemPositions();

                String selectedItems = "";
                for (int i=0; i < countries.length; i++){
                    if (selected.get(i))
                        selectedItems += countries[i]+",";
                }

                //set text item TextView
                selection.setText("Выбырано: " + selectedItems);

            }
        });
    }
}