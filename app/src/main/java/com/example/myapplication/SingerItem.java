package com.example.myapplication;

public class SingerItem {
    private String name;
    private String telnum;
    private int resId;
    private String gender;

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }


    public String getTelnum() {
        return telnum;
    }


    public int getResId() {
        return resId;
    }

    public SingerItem(String name, String telnum, int resId, String gender) {
        this.name = name;
        this.telnum = telnum;
        this.resId = resId;
        this.gender = gender;
    }
}
