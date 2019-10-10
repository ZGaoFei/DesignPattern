package com.example.designpattern.test_code.observer.test_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    protected NotifyData notifyData = NotifyData.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notifyData.attach(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        notifyData.detach(this);
    }

    public abstract void update();
}
