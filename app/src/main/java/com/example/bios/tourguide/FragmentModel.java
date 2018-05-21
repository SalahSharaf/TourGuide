package com.example.bios.tourguide;

import java.util.ArrayList;

public class FragmentModel {
    String pageText;
    String content;
    int background;
    ArrayList<Integer> resources;

    public FragmentModel(String pageText, String content, ArrayList<Integer> resources, int background) {
        this.pageText = pageText;
        this.content = content;
        this.resources = resources;
        this.background = background;
    }

    public ArrayList<Integer> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Integer> resources) {
        this.resources = resources;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getPageText() {
        return pageText;
    }

    public void setPageText(String pageText) {
        this.pageText = pageText;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
