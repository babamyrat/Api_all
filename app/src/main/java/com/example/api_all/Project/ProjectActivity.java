package com.example.api_all.Project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.api_all.Project.Example1.SplashActivity;
import com.example.api_all.Project.Example10.ProgressMiniActivity;
import com.example.api_all.Project.Example11.PushActivity;
import com.example.api_all.Project.Example2.ViewDispleyActivity;
import com.example.api_all.Project.Example3.TsetActivity;
import com.example.api_all.Project.Example4.CalculatorActivity;
import com.example.api_all.Project.Example5.MessageStartActivity;
import com.example.api_all.Project.Example6.SheetActivity;
import com.example.api_all.Project.Example7.CardSmsActivity;
import com.example.api_all.Project.Example8.TestOneActivity;
import com.example.api_all.Project.Example9.ListOkActivity;
import com.example.api_all.R;

public class ProjectActivity extends AppCompatActivity {
     CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        card1 = findViewById(R.id.cardSum1);
        card2 = findViewById(R.id.cardSum2);
        card3 = findViewById(R.id.cardSum3);
        card4 = findViewById(R.id.cardSum4);
        card5 = findViewById(R.id.cardSum5);
        card6 = findViewById(R.id.cardSum6);
        card7 = findViewById(R.id.cardSum7);
        card8 = findViewById(R.id.cardSum8);
        card9 = findViewById(R.id.cardSum9);
        card10 = findViewById(R.id.cardSum10);
        card11 = findViewById(R.id.cardSum11);

        card1.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, SplashActivity.class)));
        card2.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, ViewDispleyActivity.class)));
        card3.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, TsetActivity.class)));
        card4.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, CalculatorActivity.class)));
        card5.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, MessageStartActivity.class)));
        card6.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, SheetActivity.class)));
        card7.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, CardSmsActivity.class)));
        card8.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, TestOneActivity.class)));
        card9.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, ListOkActivity.class)));
        card10.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, ProgressMiniActivity.class)));
        card11.setOnClickListener(view -> startActivity(new Intent(ProjectActivity.this, PushActivity.class)));
    }
}