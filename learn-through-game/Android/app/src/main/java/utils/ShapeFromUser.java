package utils;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;


public class ShapeFromUser {
    private Paint m_Paint;
    private Path m_Path;

    public ShapeFromUser() {
        m_Paint = new Paint();
        m_Paint.setColor(Color.BLUE);
        m_Paint.setStrokeWidth(3);
        m_Paint.setStyle(Paint.Style.STROKE);

        m_Path = new Path();
    }

    public void setPolygon(float [] aflPoints)    {
        int nNumPoints = aflPoints.length;

        if (nNumPoints%2!=0)
            return;

        m_Path.reset();
        m_Path.moveTo(aflPoints[0], aflPoints[1]);

        for (int nI=2;nI<nNumPoints;) {
            m_Path.lineTo(aflPoints[nI], aflPoints[++nI]);
            nI++;
        }
//        m_Path.close();   //To make a closed set of points
    }

    public Path getPath(){
        return m_Path;
    }

    public Paint getPaint() {
        return m_Paint;
    }
}