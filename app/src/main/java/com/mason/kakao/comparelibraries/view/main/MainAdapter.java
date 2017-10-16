package com.mason.kakao.comparelibraries.view.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mason.kakao.comparelibraries.ListItemEvent;
import com.mason.kakao.comparelibraries.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kakao on 2017. 10. 15..
 */

public class MainAdapter extends RecyclerView.Adapter<MainVH> {
    private Context context;
    private List<String> arrayList;
    private ListItemEvent listItemEvent;

    public MainAdapter(Context context, ListItemEvent listItemEvent) {
        this.context = context;
        this.listItemEvent = listItemEvent;
        arrayList = Collections.<String>emptyList();
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    public void setArrayList(String[] arrayList) {
        this.arrayList = new ArrayList<>(Arrays.asList(arrayList));
    }

    @Override
    public MainVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainVH(LayoutInflater.from(context).inflate(R.layout.item_main, parent, false), listItemEvent);
    }

    @Override
    public void onBindViewHolder(MainVH holder, int position) {
        holder.setupView(new MainMenu(arrayList.get(position), position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
