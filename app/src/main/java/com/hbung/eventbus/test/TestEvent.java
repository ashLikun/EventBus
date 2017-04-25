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

public class TestEvent {
    public TestEvent() {
        EventBus.getDefault().register(this);
    }

    @Subscribe(tag = "likun2")
    public void aaa(Integer aaa) {
        Log.e("aaaaaa", String.valueOf(aaa));
    }
}
