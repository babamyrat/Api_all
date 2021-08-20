package com.example.api_all.Project.Example5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.api_all.R;
import com.tapadoo.alerter.Alerter;
import com.tapadoo.alerter.OnHideAlertListener;
import com.tapadoo.alerter.OnShowAlertListener;

public class MessageStartActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_start);

        button = findViewById(R.id.buttonE3);


    }

    public void showAlerter(View v){
        Alerter.create(this)
                .setTitle("Alert Title")
                .setText("Alert Text")
                .setIcon(R.drawable.ggg)
                .setBackgroundColorRes(R.color.black)
                .setDuration(3000)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                   //message

                    }
                }).setOnShowListener(new OnShowAlertListener() {
            @Override
            public void onShow() {
                //message shows
            }

        }).setOnHideListener(new OnHideAlertListener() {
            @Override
            public void onHide() {
                //message hides
            }
        })
                .show();
    }

}