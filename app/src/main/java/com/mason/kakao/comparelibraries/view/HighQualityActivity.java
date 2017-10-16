package com.mason.kakao.comparelibraries.view;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mason.kakao.comparelibraries.R;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.squareup.picasso.Picasso;

public class HighQualityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_quality);

        ImageView imageViewGlide = findViewById(R.id.image_view_glide);
        ImageView imageViewPicasso = findViewById(R.id.image_view_picasso);
        ImageView imageViewAUIL = findViewById(R.id.image_view_auil);

        Glide.with(this)
                .load(R.drawable.high_quality)
                .into(imageViewGlide);

        Picasso.with(this)
                .load(R.drawable.high_quality)
                .fit()
                .into(imageViewPicasso);

        ImageLoader.getInstance().displayImage("drawable://" + R.drawable.high_quality, imageViewAUIL);
    }
}