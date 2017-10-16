package com.mason.kakao.comparelibraries.view.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.mason.kakao.comparelibraries.BaseVH;
import com.mason.kakao.comparelibraries.ListItemEvent;
import com.mason.kakao.comparelibraries.R;

/**
 * Created by kakao on 2017. 10. 15..
 */

public class MainVH extends BaseVH<MainMenu> {
    private MainMenu mainMenu;
    private Button button;

    public MainVH(View itemView, final ListItemEvent listItemEvent) {
        super(itemView);
        button = (Button) itemView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listItemEvent.click(mainMenu.getIndex());
            }
        });
    }

    public void setupView(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        button.setText(mainMenu.getText());
    }
}
