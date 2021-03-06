package com.mkrolak;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


//I CREDIT THE CREATION OF THIS CLASS TO SOME GUY ON STACK OVERFLOW %100

public class NonSwipingPagerView extends ViewPager {

    private boolean enabled;

    public NonSwipingPagerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = true;
    }

    public NonSwipingPagerView(@NonNull Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}