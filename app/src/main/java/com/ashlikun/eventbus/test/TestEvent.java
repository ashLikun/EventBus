package com.ashlikun.eventbus.test;

import android.util.Log;

import com.ashlikun.eventbus.EventBus;
import com.ashlikun.eventbus.Subscribe;

/**
 * 作者　　: 李坤
 * 创建时间:2017/4/25 0025　16:54
 * 邮箱　　：496546144@qq.com
 * <p>
 * 功能介绍：
 */

public class TestEvent {
    public TestEvent() {
        EventBus.getDefault().register(this);
    }

    @Subscribe(tag = "likun2")
    public void aaa() {
        Log.e("TestEvent", "likun2");
    }

    @Subscribe(tag = "likun3")
    public void aaaa(String aaa) {
        Log.e("TestEvent", "likun3");
    }
}
