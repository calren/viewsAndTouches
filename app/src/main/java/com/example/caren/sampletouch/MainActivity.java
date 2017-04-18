package com.example.caren.sampletouch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "dispatchTouchEvent ACTIVITY");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.i("touchevent", "onTouchEvent ACTIVITY");
        return super.onTouchEvent(motionEvent);
    }
}
