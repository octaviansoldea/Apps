package com.example.terra.learnthroughgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicLessonsTOCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_lessons_toc);
        findViewById(R.id.button_Music_TOC_musical_instruments_quiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicLessonsTOCActivity.this, MusicalInstrumentsQuizActivity.class));
            }
        });
    }
}
