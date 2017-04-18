package com.example.caren.sampletouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {
    private float initialDownYCoord;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }


    private boolean isTouchInView(MotionEvent motionEvent) {
        int[] location = new int[2];
        getLocationOnScreen(location);

        return motionEvent.getRawX() > location[0]
                && motionEvent.getRawX() < location[0] + getWidth()
                && motionEvent.getRawY() > location[1]
                && motionEvent.getRawY() < location[1] + getHeight();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "dispatchTouchEvent CUSTOM_VIEW");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "onTouchEvent CUSTOM_VIEW");
//        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
//            initialDownYCoord = motionEvent.getRawY();
//        }
//
//        if (motionEvent.getAction() == MotionEvent.ACTION_UP && isTouchInView(motionEvent)) {
//
//            // if swiped down, animate view down and away
//            if (motionEvent.getRawY() - initialDownYCoord > 2000) {
//                Animation slide_down = AnimationUtils.loadAnimation(getContext(),
//                        R.anim.slide_down_animation);
//                slide_down.setDuration(2000);
//                startAnimation(slide_down);
//                return true;
//            }
//        }
        return super.onTouchEvent(motionEvent);
    }

}
