package com.dorelsaig.common;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;

public abstract class Activity_TheBuzzer_Parent extends AppCompatActivity {

    private MaterialTextView stats_LBL_save;

    private ImageButton hype;

    private MediaPlayer mp;


    protected abstract int getImage();
    protected abstract int getSound();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thebuzzer);

        findViews();

        createSound();

        updateUI();

    }

    private void updateUI() {

        hype.setImageResource(getImage());

    }

    private void createSound() {
        mp = MediaPlayer.create(this, getSound());

        hype.setOnClickListener(view -> {

                if (mp.isPlaying()) {
                    createSound();
                    mp.start();
                } else {
                    mp.reset();
                    createSound();
                    mp.start();
                }
            });
    }


    private void findViews() {
        stats_LBL_save = findViewById(R.id.stats_LBL_save);
        hype = findViewById(R.id.hype);
    }
}