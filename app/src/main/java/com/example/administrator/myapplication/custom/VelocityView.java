package com.example.administrator.myapplication.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/**
 * 检测速度
 */

public class VelocityView extends View {
    VelocityTracker velocityTracker;
    public VelocityView(Context context) {
        super(context);
    }

    public VelocityView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private void init() {
        velocityTracker = VelocityTracker.obtain();

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                init();
                velocityTracker.addMovement(event);

                System.out.println("velocity touchSlop "+ ViewConfiguration.get(getContext()).getScaledTouchSlop());
                System.out.println("velocity get left "+ getLeft());
                ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                System.out.println("velocity left margin "+ layoutParams.leftMargin);
                break;

            case MotionEvent.ACTION_MOVE:
                velocityTracker.addMovement(event);
                velocityTracker.computeCurrentVelocity(1000);
                System.out.println("velocity 1000 x : "+velocityTracker.getXVelocity());
                System.out.println("velocity 1000 y : "+velocityTracker.getYVelocity());
                break;

            case MotionEvent.ACTION_UP:
                velocityTracker.addMovement(event);
                velocityTracker.computeCurrentVelocity(100);
                System.out.println("velocity 100 x : "+velocityTracker.getXVelocity());
                System.out.println("velocity 100 y : "+velocityTracker.getYVelocity());
                velocityTracker.clear();
                velocityTracker.recycle();
                break;
        }
        return true;

    }
}
































