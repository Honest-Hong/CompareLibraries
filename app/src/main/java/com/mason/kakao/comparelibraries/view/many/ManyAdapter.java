package com.mason.kakao.comparelibraries.view.many;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mason.kakao.comparelibraries.LibraryType;
import com.mason.kakao.comparelibraries.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kakao on 2017. 10. 16..
 */

public class ManyAdapter extends RecyclerView.Adapter<ManyVH> {
    private Context context;
    private List<String> list;
    private LibraryType libraryType;

    public ManyAdapter(Context context, LibraryType libraryType) {
        this.context = context;
        this.libraryType = libraryType;
        this.list = Collections.emptyList();
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public ManyVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ManyVH(LayoutInflater.from(context).inflate(R.layout.item_many,  parent, false), libraryType);
    }

    @Override
    public void onBindViewHolder(ManyVH holder, int position) {
        holder.setupView(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
