package com.mydrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class DrawView extends View {
    private Path drawPath;          //drawing path
    private Paint drawPaint, canvasPaint;   //drawing and canvas paint
    private int paintColor = 0xFF660000;    //initial color
    private Canvas drawCanvas;      //canvas
    private Bitmap canvasBitmap;    //canvas bitmap

    public DrawView(Context context, AttributeSet attrs){
        super(context, attrs);
        drawPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawBitmap(canvasBitmap, 0, 0, canvasPaint);
//       canvas.drawPath(drawPath, drawPaint);

//        canvas.drawLine(0, 0, 20, 20, drawPaint);
 //       canvas.drawLine(20, 0, 0, 20, drawPaint);
    }

}
