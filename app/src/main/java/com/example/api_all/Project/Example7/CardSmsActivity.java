package com.example.api_all.Project.Example7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.api_all.R;

import hotchemi.android.rate.AppRate;

public class CardSmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_sms);

        AppRate.with(this)

                .setInstallDays(1)

                .setLaunchTimes(3)

                .setRemindInterval(1)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);

    }
}