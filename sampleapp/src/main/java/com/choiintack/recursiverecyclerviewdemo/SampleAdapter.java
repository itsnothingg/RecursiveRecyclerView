package com.choiintack.recursiverecyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.choiintack.recursiverecyclerview.RecursiveRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by choiintack on 2017. 1. 31..
 */

public class SampleAdapter extends RecursiveRecyclerAdapter<SampleAdapter.ViewHolder> {

    List<DummyData> mData;

    void setData(List<DummyData> data) {
        setItems(data);
        mData = data;
    }

    @Override
    public SampleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SampleAdapter.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        holder.sampleTextView.setText(getItem(position).toString());
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView sampleTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            sampleTextView = (TextView) itemView.findViewById(R.id.sample_text);
        }
    }
}
