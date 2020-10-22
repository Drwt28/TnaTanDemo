package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sound {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("audio_path")
    @Expose
    private AudioPath audioPath;
    @SerializedName("sound_name")
    @Expose
    private String soundName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("thum")
    @Expose
    private String thum;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("created")
    @Expose
    private String created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AudioPath getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(AudioPath audioPath) {
        this.audioPath = audioPath;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThum() {
        return thum;
    }

    public void setThum(String thum) {
        this.thum = thum;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
