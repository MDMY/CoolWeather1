package com.ding.coolweather2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ding.coolweather2.service.AutoUpdateService;

/**
 * Created by dingsheng on 2016/6/13.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
