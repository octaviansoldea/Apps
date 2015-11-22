package com.example.terra.learnthroughgame;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class MusicalInstrumentsQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_instruments_quiz);

        ImageView iv = (ImageView)findViewById(R.id.imageView_Music_WhichInstrumentIsThis);
        iv.setImageResource(R.drawable.guitar);

    }
}
