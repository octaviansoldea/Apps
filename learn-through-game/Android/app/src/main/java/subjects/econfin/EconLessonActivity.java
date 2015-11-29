package com.example.terra.learnthroughgame;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

class TitleContent  {
    private String m_strTitle;
    private String m_strContent;

    public String getTitle() {
        return m_strTitle;
    }

    public void setTitle(String astrTitle) {
        this.m_strTitle = astrTitle;
    }

    public String getContent() {
        return m_strContent;
    }

    public void setContent(String astrContent) {
        this.m_strContent = astrContent;
    }
}

public class EconLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econ_lesson);

        LinearLayout l = (LinearLayout)findViewById(R.id.linearLayoutEconBar);
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
        TextView tvTitleBar = (TextView) findViewById(R.id.textView_EconBar);
        switch (aField) {
            case ECON_FIN:
                tvTitleBar.setText(R.string.titleBarEconPart1);
                break;
            case MATH:
                tvTitleBar.setText(R.string.main_text_EconTitle);
                break;
            case MUSIC:
                tvTitleBar.setText(R.string.main_text_EconTitle);
                break;
        }
    }
}
