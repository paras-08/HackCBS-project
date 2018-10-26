package com.example.hackcbs;

public class Crop {
    private String name;
    private int photoId;

    Crop(String name, int photoId) {
        this.name = name;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public int getPhotoId() {
        return photoId;
    }
}
