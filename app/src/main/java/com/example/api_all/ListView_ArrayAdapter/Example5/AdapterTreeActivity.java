package com.example.api_all.ListView_ArrayAdapter.Example5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.api_all.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterTreeActivity extends AppCompatActivity {

    ArrayList<TreeModel> treeModels = new ArrayList<>();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_tree);

        //add adapter
        countriesList = findViewById(R.id.listView5);
        TreeAdapter treeAdapter = new TreeAdapter(this, R.layout.tree_item, treeModels);

        //add adapter
        countriesList.setAdapter(treeAdapter);

        //random select in list
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                //get select item
                TreeModel treeModel = (TreeModel)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "yes man much: " + treeModel.getName(), Toast.LENGTH_SHORT).show();
            }
        };

        countriesList.setOnItemClickListener(itemListener);
        setInitialData();
    }

    private void setInitialData(){
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
        treeModels.add(new TreeModel("Hello", "Man", R.drawable.ic_launcher_background));
    }
}