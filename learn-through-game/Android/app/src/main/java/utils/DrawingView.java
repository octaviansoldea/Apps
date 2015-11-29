package utils;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import android.graphics.Bitmap;
import android.graphics.Canvas; //A surface on which to draw
import android.graphics.Paint;  //holds the style, color, and other information needed
                                // to draw any graphics including bitmaps, text, and geometric shapes
import android.graphics.Path;   //A set of vector-drawing commands such as lines, curves, rectangles


public class DrawingView extends View {
    private Paint m_DrawPaint, canvasPaint;   //drawing and canvas paint
    private Canvas drawCanvas;      //canvas
    private Bitmap canvasBitmap;    //canvas bitmap
    private ShapeFromUser m_ShapeFromUser;

    public DrawingView(Context context, AttributeSet attrs){
        super(context, attrs);

        init();
    }

    private void init(){
        m_DrawPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        m_DrawPaint.setColor(Color.BLACK);
        m_ShapeFromUser = new ShapeFromUser();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int nWidth = getWidth();
        int nHeight = getHeight();

        if((nWidth==0) || (nHeight==0)){
            return;
        }

        float [] flPoints = {30, 30, 50, 50};
        canvas.drawPoints(flPoints, m_DrawPaint);

        canvas.drawLine(0, 0, 20, 20, m_DrawPaint);
        canvas.drawLine(20, 0, 0, 20, m_DrawPaint);


        float [] flPoints1 = {28, 30, 93, 105, 85, 44};
        m_ShapeFromUser.setPolygon(flPoints1);
        canvas.drawPath(m_ShapeFromUser.getPath(), m_ShapeFromUser.getPaint());
    }
}
