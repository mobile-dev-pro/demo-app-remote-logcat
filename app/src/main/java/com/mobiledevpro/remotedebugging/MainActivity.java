package com.mobiledevpro.remotedebugging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mobiledevpro.remotelogcat.RemoteLog;
import com.mobiledevpro.remotelogcat.UserInfoModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RemoteLog.setUserInfo(new UserInfoModel("testuser"));

        findViewById(R.id.btn_send_debug).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RemoteLog.d(MainActivity.class.getSimpleName(), "It's a long debug message");
            }
        });

        findViewById(R.id.btn_send_error).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RemoteLog.e(MainActivity.class.getSimpleName(), "It's an ERROR message");
            }
        });
    }
}
