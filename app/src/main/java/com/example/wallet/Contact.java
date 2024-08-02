package com.example.wallet;

public class Contact {
    private String picturePath;
    private String name;

    public Contact(String name, String picturePath) {
        this.picturePath = picturePath;
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
