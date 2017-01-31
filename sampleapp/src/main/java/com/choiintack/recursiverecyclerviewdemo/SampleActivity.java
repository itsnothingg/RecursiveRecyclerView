package com.choiintack.recursiverecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by choiintack on 2017. 1. 31..
 */

public class SampleActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SampleAdapter adapter = new SampleAdapter();
        adapter.setData(getDummyData(""));
        recyclerView.setAdapter(adapter);
    }

    List<DummyData> getDummyData(String prefix) {
        if (prefix.split("Sub").length > 2) return new ArrayList<>();
        int max = 5;
        List<DummyData> list = new ArrayList<>();
        for (int i = 1; i <= max; i ++) {
            String space = " ";
            DummyData data = new DummyData(prefix + " Dummy Data " + i, getDummyData("Sub " + prefix));
            list.add(data);
        }
        return list;
    }
}
