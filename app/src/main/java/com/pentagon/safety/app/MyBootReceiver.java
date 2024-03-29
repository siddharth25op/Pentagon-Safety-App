package com.pentagon.safety.app;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBootReceiver extends BroadcastReceiver {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(MainActivity.TAG, "boot completed");

        // start the PowerButton Service
        context.startService(new Intent(context, PowerButtonService.class));
    }
}