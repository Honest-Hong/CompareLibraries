package com.mason.kakao.comparelibraries.view.many;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mason.kakao.comparelibraries.BaseVH;
import com.mason.kakao.comparelibraries.LibraryType;
import com.mason.kakao.comparelibraries.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

/**
 * Created by kakao on 2017. 10. 16..
 */

public class ManyVH extends BaseVH<String> {
    private Context context;
    private String url;
    private ImageView imageView;
    private LibraryType libraryType;

    public ManyVH(View itemView, LibraryType libraryType) {
        super(itemView);
        this.context = itemView.getContext();
        this.libraryType = libraryType;
        imageView = itemView.findViewById(R.id.image_view);
    }

    @Override
    public void setupView(String url) {
        this.url = url;
        switch(libraryType) {
            case Glide:
                Glide.with(context)
                        .load(url)
                        .into(imageView);
                break;
            case Picasso:
                Picasso.with(context)
                        .load(url)
                        .into(imageView);
                break;
            case AUIL:
                ImageLoader.getInstance().displayImage(url, imageView);
                break;
        }
    }
}
