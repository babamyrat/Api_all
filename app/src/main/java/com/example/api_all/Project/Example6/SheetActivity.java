package com.example.api_all.Project.Example6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.api_all.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet);

        Button OpenBottomSheet = findViewById(R.id.open_bottom_sheet);

        OpenBottomSheet.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
//                        BottomSheetDialog bottomSheet = new BottomSheetDialog(this);
//                        bottomSheet.show(getSupportFragmentManager(), "ModalBottomSheet");
                    }
                });

    }
}