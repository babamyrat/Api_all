package com.example.api_all.ListView_ArrayAdapter.Example4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.api_all.R;

import java.util.ArrayList;
import java.util.Collections;

public class AddAllActivity extends AppCompatActivity {
   ArrayList<String> users = new ArrayList<>();
   ArrayList<String> selectedUser = new ArrayList<>();
   ArrayAdapter<String> adapter;
   ListView usersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_all);

        // add initial elements
        Collections.addAll(users, "Tom", "Bob", "Sam", "Alice");

         //get element ListView
        usersList = findViewById(R.id.ListView4);

        //add adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, users);

        //set for list adapter
        usersList.setAdapter(adapter);

        usersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String user = adapter.getItem(position);
                if (usersList.isItemChecked(position))
                    selectedUser.add(user);
                    else
                        selectedUser.remove(user);
            }
        });
    }

    public void add(View view) {
        EditText userName = findViewById(R.id.editText4);
        String user = userName.getText().toString();
        if (!user.isEmpty()){
            adapter.add(user);
            userName.setText("");
            adapter.notifyDataSetChanged();
        }
    }

    public void remove(View view){

        //set and delete select elements
        for (int i=0; i < selectedUser.size(); i++){
            adapter.remove(selectedUser.get(i));
        }
        // remove all previously sen marks
        usersList.clearChoices();

        //clear the array of selected objects
        selectedUser.clear();

        adapter.notifyDataSetChanged();

    }
}