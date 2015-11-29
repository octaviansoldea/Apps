package com.example.terra.learnthroughgame;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

import com.example.terra.learnthroughgame.MusicLessonsTOCActivity;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        findViewById(R.id.button_Music_begin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicActivity.this, MusicLessonsTOCActivity.class));
            }
        });

        final List<String> list=new ArrayList<String>();
        list.add("German");
        list.add("Hebrew");
        list.add("Hungarian");
        list.add("English");
        list.add("Romanian");
        list.add("Slovenian");
        list.add("Turkish");

        final Spinner sp=(Spinner) findViewById(R.id.spinner_Music_choose_language);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,list);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adp);
        sp.setSelection(3);
    }
}
