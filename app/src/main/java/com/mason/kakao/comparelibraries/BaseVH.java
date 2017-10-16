package com.mason.kakao.comparelibraries;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by kakao on 2017. 10. 16..
 */

public abstract class BaseVH<T> extends RecyclerView.ViewHolder {
    public BaseVH(View itemView) {
        super(itemView);
    }

    public abstract void setupView(T o);
}
