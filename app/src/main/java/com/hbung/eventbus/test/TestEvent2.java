package com.hbung.eventbus.test;

import android.util.Log;

import com.hbung.eventbus.EventBus;
import com.hbung.eventbus.Subscribe;

/**
 * 作者　　: 李坤
 * 创建时间:2017/4/25 0025　16:54
 * 邮箱　　：496546144@qq.com
 * <p>
 * 功能介绍：
 */

public class TestEvent2 {
    public TestEvent2() {
        EventBus.getDefault().register(this);
    }

    @Subscribe(tag = "likun2", priority = 1)
    public void aaa() {
        Log.e("TestEvent2", "likun2");
    }

    @Subscribe(tag = "likun3")
    public void aaaa(String aaa) {
        Log.e("TestEvent2", "likun3");
    }
}
