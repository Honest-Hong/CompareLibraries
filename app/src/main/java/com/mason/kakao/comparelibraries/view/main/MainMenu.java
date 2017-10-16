package com.mason.kakao.comparelibraries.view.main;

/**
 * Created by kakao on 2017. 10. 16..
 */

public class MainMenu {
    private String text;
    private int index;

    public MainMenu(String text, int index) {
        this.text = text;
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
