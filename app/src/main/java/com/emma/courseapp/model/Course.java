package com.emma.courseapp.model;

import java.io.Serializable;

public class Course implements Serializable {
    private String title;
    private String price;
    private String picPath;
    public Course() {
    }

    public Course(String title, String price, String picPath) {
        this.title = title;
        this.price = price;
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
