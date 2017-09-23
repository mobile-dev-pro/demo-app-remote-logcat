package com.mobiledevpro.remotedebugging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobiledevpro.remotelogcat.RemoteLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RemoteLog.d("TestTag", "Message");
    }
}
