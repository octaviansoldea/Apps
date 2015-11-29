package com.example.terra.learnthroughgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.app.Activity;

//public class EconFinActivity extends AppCompatActivity {
public class EconFinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econfin);

        findViewById(R.id.button_Main_EconFin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EconFinActivity.this, com.example.terra.learnthroughgame.EconFinLessonActivity.class));
            }
        });
    }

}
