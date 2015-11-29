package com.mydrawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.mydrawing.DrawView;

public class MainActivity extends AppCompatActivity {

    private DrawView m_DrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        m_DrawView = new (DrawView)findViewById(R.id.DrawingViewBlackboard);
    }

}
