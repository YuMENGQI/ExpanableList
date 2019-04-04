package com.android.byc.expanablelist;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author yu
 * @version 1.0
 * @date 2019/4/4 10:45
 * @description
 */
public class MyApplication extends Application {
        @Override
        public void onCreate() {
            super.onCreate();
            Fresco.initialize(this);
        }
    }

