package com.sdl.hellosdlandroid;

import android.app.Application;
import android.content.Intent;

public class SdlApplication extends Application{

    private static final String TAG = SdlApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        LockScreenActivity.registerActivityLifecycle(this);
    }

}
