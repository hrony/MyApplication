package com.example.administrator.myapplication.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/5/30.
 */

public class PresentView extends LinearLayout {
    public PresentView(Context context) {
        super(context);
    }

    public PresentView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("presenter dispatchTouchEvent : ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                System.out.println("presenter dispatchTouchEvent : ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                System.out.println("presenter dispatchTouchEvent : ACTION_UP");
                break;

        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("presenter onInterceptTouchEvent : ACTION_DOWN");
                return false;

            case MotionEvent.ACTION_MOVE:
                System.out.println("presenter onInterceptTouchEvent : ACTION_MOVE");
                return true;

            case MotionEvent.ACTION_UP:
                System.out.println("presenter onInterceptTouchEvent : ACTION_UP");
                break;

        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                System.out.println("presenter onTouchEvent : ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                System.out.println("presenter onTouchEvent : ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                System.out.println("presenter onTouchEvent : ACTION_UP");
                break;

        }
        return super.onTouchEvent(ev);
    }
}





























