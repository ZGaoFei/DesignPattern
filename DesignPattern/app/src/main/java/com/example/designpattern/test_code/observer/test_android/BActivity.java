package com.example.designpattern.test_code.observer.test_android;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.designpattern.R;

public class BActivity extends BaseActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        textView = findViewById(R.id.text_b);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BActivity.this.notifyData.setType(0);
            }
        });
        button = findViewById(R.id.skip_c);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this, CActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void update() {
        int type = this.notifyData.getType();
        textView.setText("b activity set type: " + type);
    }
}
