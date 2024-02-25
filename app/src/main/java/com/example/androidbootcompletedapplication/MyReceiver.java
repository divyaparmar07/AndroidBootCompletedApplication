package com.example.androidbootcompletedapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.d("MyReceiver", "Boot Completed");
            Toast.makeText(context.getApplicationContext(), "Boot Completed", Toast.LENGTH_SHORT).show();
        }
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}