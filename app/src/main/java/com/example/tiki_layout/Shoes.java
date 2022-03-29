package com.example.tiki_layout;

public class Shoes {
    private int img;
    private String description;

    public Shoes(int img, String description) {
        this.img = img;
        this.description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public String getDescription() {
        return description;
    }
}
