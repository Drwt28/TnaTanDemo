package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AudioPath {

    @SerializedName("mp3")
    @Expose
    private String mp3;
    @SerializedName("aac")
    @Expose
    private String aac;

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }

    public String getAac() {
        return aac;
    }

    public void setAac(String aac) {
        this.aac = aac;
    }

}
