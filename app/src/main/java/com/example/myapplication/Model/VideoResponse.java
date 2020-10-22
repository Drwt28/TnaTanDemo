package com.example.myapplication.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class VideoResponse {
    public ArrayList<Video> getVideoArrayList() {
        return videoArrayList;
    }

    @SerializedName("msg")
    ArrayList<Video> videoArrayList;
}
