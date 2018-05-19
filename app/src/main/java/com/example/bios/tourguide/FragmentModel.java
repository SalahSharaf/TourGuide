package com.example.bios.tourguide;

public class FragmentModel {
    String pageText;
    String content;
    int imageView1, imageView2, imageView3, background;

    public FragmentModel(String pageText, String content, int imageView1, int imageView2, int imageView3, int background) {
        this.pageText = pageText;
        this.content = content;
        this.imageView1 = imageView1;
        this.imageView2 = imageView2;
        this.imageView3 = imageView3;
        this.background = background;
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

    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }

    public int getImageView2() {
        return imageView2;
    }

    public void setImageView2(int imageView2) {
        this.imageView2 = imageView2;
    }

    public int getImageView3() {
        return imageView3;
    }

    public void setImageView3(int imageView3) {
        this.imageView3 = imageView3;
    }
}
