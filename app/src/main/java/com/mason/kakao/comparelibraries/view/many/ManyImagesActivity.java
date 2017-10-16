package com.mason.kakao.comparelibraries.view.many;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.mason.kakao.comparelibraries.LibraryType;
import com.mason.kakao.comparelibraries.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ManyImagesActivity extends AppCompatActivity {
    private LibraryType libraryType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_many_images);

        String type = getIntent().getStringExtra(LibraryType.Type.name());
        libraryType = LibraryType.valueOf(type);

        TextView textView = findViewById(R.id.text_view);
        textView.setText(libraryType.name());

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        ManyAdapter adapter = new ManyAdapter(this, libraryType);
        adapter.setList(Arrays.asList(getResources().getStringArray(R.array.images)));
        recyclerView.setAdapter(adapter);
    }
}
