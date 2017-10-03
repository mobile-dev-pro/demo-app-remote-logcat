package com.mobiledevpro.remotedebugging;

import android.app.Application;

import com.mobiledevpro.remotelogcat.RemoteLog;

/**
 * Main class of app
 * <p>
 * Created by Dmitriy V. Chernysh on 23.09.17.
 * dmitriy.chernysh@gmail.com
 * <p>
 * https://fb.me/mobiledevpro/
 * <p>
 * #MobileDevPro
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //init remote logcat
        RemoteLog.init(this, "tokentest123");
    }
}
