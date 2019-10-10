package com.example.designpattern.test_code.observer.test_android;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.designpattern.R;

public class CActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        textView = findViewById(R.id.text_c);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CActivity.this.notifyData.setType(1);
            }
        });
    }

    @Override
    public void update() {
        int type = this.notifyData.getType();
        textView.setText("c activity set type: " + type);
    }
}
