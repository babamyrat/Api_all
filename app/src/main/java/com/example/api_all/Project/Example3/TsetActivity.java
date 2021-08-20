package com.example.api_all.Project.Example3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.api_all.R;

public class TsetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tset);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add("Settings");
        menu.add("Open");
        menu.add("Save");
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
    String title = item.getTitle().toString();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        headerView.setText(title);
        
        return super.onOptionsItemSelected(item);
    }
}