package com.example.terra.learnthroughgame;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import utils.DrawingView;
import utils.Triangle;


public class EconFinAssignmentActivity extends AppCompatActivity {

    private DrawingView m_drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econfin_assignment);


        m_drawView = (DrawingView)findViewById(R.id.DrawingViewBlackboard);
    }
}
