package com.ding.coolweather2.util;

/**
 * Created by dingsheng on 2016/6/6.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
