package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.designpattern.home.DataHelper;
import com.example.designpattern.home.ItemModel;
import com.example.designpattern.home.RecycleViewAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);

        initRecycleView();
    }

    private void initRecycleView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<ItemModel> data = DataHelper.getData();
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, data);
        recyclerView.setAdapter(adapter);
    }
}
