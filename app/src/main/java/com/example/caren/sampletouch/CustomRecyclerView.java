package com.example.caren.sampletouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class CustomRecyclerView extends RelativeLayout {

    public CustomRecyclerView(Context context) {
        super(context);
    }

    public CustomRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "dispatchTouchVent RECYCLER_VIEW");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "onTouchEvent RECYCLER_VIEW");
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "onInterceptTouchEVENT RECYCLER_VIEW");
        return super.onInterceptTouchEvent(motionEvent);
    }

}
