package com.example.terra.learnthroughgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EconFinLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econfin_lesson);

        LinearLayout l = (LinearLayout)findViewById(R.id.linearLayoutEconFinBar);
        TextView tv = (TextView)l.getChildAt(0);
        tv.setRotation(-90);

        initActivity(Field.ECON_FIN);
    }

    enum Field {
        ECON_FIN,
        MATH,
        MUSIC
    }

    private void initActivity(Field aField) {
        TextView tvTitleBar = (TextView) findViewById(R.id.textView_EconFinBar);
        switch (aField) {
            case ECON_FIN:
                tvTitleBar.setText(R.string.titleBarEconFinPart1);
                break;
            case MATH:
                tvTitleBar.setText(R.string.main_text_EconFinTitle);
                break;
            case MUSIC:
                tvTitleBar.setText(R.string.main_text_EconFinTitle);
                break;
        }
    }
}
