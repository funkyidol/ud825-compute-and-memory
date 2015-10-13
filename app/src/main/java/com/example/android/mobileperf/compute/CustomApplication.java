package com.example.android.mobileperf.compute;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by kshitij on 11/10/15.
 */
public class CustomApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);
    }
}
