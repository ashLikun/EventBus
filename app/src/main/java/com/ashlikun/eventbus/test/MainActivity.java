package com.ashlikun.eventbus.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ashlikun.eventbus.EventBus;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestEvent();
        new TestEvent2();
    }

    public void onClick(View view) {
        EventBus.getDefault().post("likun2");
    }

    public void onClick1(View view) {
        EventBus.getDefault().post("aaaa","likun3");
    }
}
