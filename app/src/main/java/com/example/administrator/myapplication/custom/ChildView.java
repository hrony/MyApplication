package com.example.administrator.myapplication.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ChildView extends View {
    public ChildView(Context context) {
        super(context);
    }

    public ChildView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("child dispatchTouchEvent : ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                System.out.println("child dispatchTouchEvent : ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                System.out.println("child dispatchTouchEvent : ACTION_UP");
                break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("child onTouchEvent : ACTION_DOWN");
                return true;

            case MotionEvent.ACTION_MOVE:
                System.out.println("child onTouchEvent : ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                System.out.println("child onTouchEvent : ACTION_UP");
                break;

        }
        return super.onTouchEvent(event);
    }
}
