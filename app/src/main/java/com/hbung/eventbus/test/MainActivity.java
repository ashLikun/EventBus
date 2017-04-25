package com.hbung.eventbus.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hbung.eventbus.EventBus;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new TestEvent();
    }

    public void onClick(View view) {
        EventBus.getDefault().post(11111, "likun2");
    }
}
