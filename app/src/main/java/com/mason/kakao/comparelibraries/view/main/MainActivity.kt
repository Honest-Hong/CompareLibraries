package com.mason.kakao.comparelibraries.view.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.mason.kakao.comparelibraries.LibraryType
import com.mason.kakao.comparelibraries.ListItemEvent
import com.mason.kakao.comparelibraries.R
import com.mason.kakao.comparelibraries.view.HighQualityActivity
import com.mason.kakao.comparelibraries.view.many.ManyImagesActivity
import com.nostra13.universalimageloader.core.ImageLoader
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration

class MainActivity : AppCompatActivity(), ListItemEvent {
    private var recyclerView: RecyclerView? = null
    private var adapter: MainAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.setHasFixedSize(true)
        adapter = MainAdapter(this, this)
        adapter?.setArrayList(resources.getStringArray(R.array.menus))
        recyclerView?.adapter = adapter

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this))
    }

    override fun click(index: Int) {
        when(index) {
            0 -> { startActivity(Intent(this, HighQualityActivity::class.java))}
            1 -> {
                var intent = Intent(this, ManyImagesActivity::class.java)
                intent.putExtra(LibraryType.Type.name, LibraryType.Glide.name)
                startActivity(intent)
            }
            2 -> {
                var intent = Intent(this, ManyImagesActivity::class.java)
                intent.putExtra(LibraryType.Type.name, LibraryType.Picasso.name)
                startActivity(intent)
            }
            3 -> {
                var intent = Intent(this, ManyImagesActivity::class.java)
                intent.putExtra(LibraryType.Type.name, LibraryType.AUIL.name)
                startActivity(intent)
            }
        }
    }
}
