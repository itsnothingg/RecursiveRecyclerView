package com.choiintack.recursiverecyclerviewdemo;

import com.choiintack.recursiverecyclerview.RecursiveItem;

import java.util.List;

/**
 * Created by choiintack on 2017. 1. 31..
 */

public class DummyData implements RecursiveItem{
    String data;
    List<DummyData> dummyDataList;

    public DummyData(String data, List<DummyData> dummyDataList) {
        this.data = data;
        this.dummyDataList = dummyDataList;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public List getChildren() {
        return dummyDataList;
    }
}
