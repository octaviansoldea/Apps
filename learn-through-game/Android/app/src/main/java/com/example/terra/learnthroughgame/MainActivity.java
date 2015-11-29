package com.example.terra.learnthroughgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.media.AudioManager;

import com.example.terra.learnthroughgame.EconActivity;
import com.example.terra.learnthroughgame.EconLessonActivity;

public class MainActivity extends AppCompatActivity {

    private AudioManager m_AudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        findViewById(R.id.button_Enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EconLessonActivity.class));
            }
        });

        //AUDIO MANAGER
        m_AudioManager = (AudioManager)getSystemService(AUDIO_SERVICE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    public void onStartClickMusic() {}
    public void onStartClickEcon() {}
    public void onStartClickMathematics() {}

    @Override
    protected void onStart() {
        super.onStart();
        /*
            Called when your activity is becoming visible to the user.

            Maintain the resources that are needed to show and run your activity.
            For instance: create an event handler
        */
    }

    @Override
    protected void onPause()    {
        super.onPause();

        /*
            Called when the system is about to resume a previous activity or if the user
            has navigated away to another portion of the system, such as pressing the home key.

            This stage is typically used to commit unsaved changes to data that needs to be persisted.
        */
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        //Final call to the activity before it is destroyed
    }
}
