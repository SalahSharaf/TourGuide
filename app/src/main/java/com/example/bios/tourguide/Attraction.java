package com.example.bios.tourguide;

import java.util.ArrayList;

public class Attraction {
    int background;
    ArrayList<Integer> resources;
    String basic,content;

    public Attraction(int background, ArrayList<Integer> resources, String basic, String content) {
        this.background = background;
        this.resources = resources;
        this.basic = basic;
        this.content = content;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public ArrayList<Integer> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Integer> resources) {
        this.resources = resources;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
