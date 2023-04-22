package com.dorelsaig.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Home extends AppCompatActivity {

    private Button home_BTN_stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViews();
        initViews();



    }



    private void initViews() {

        home_BTN_stats.setOnClickListener(v -> statsClicked());
    }

    private void statsClicked() {
        Intent intent = new Intent(this, App_Parent.theBuzzer);
        startActivity(intent);
    }




    private void findViews() {

        home_BTN_stats = findViewById(R.id.home_BTN_stats);
    }
}