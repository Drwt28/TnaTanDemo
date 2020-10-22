package com.example.myapplication.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("fb_id")
    @Expose
    private String fbId;
    @SerializedName("user_info")
    @Expose
    private UserInfo userInfo;
    @SerializedName("count")
    @Expose
    private Count count;
    @SerializedName("liked")
    @Expose
    private Integer liked;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("shared_video")
    @Expose
    private String sharedVideo;
    @SerializedName("gif")
    @Expose
    private String gif;
    @SerializedName("thum")
    @Expose
    private String thum;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("sound")
    @Expose
    private Sound sound;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("allowed_duet")
    @Expose
    private String allowedDuet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    public Integer getLiked() {
        return liked;
    }

    public void setLiked(Integer liked) {
        this.liked = liked;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getSharedVideo() {
        return sharedVideo;
    }

    public void setSharedVideo(String sharedVideo) {
        this.sharedVideo = sharedVideo;
    }

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public String getThum() {
        return thum;
    }

    public void setThum(String thum) {
        this.thum = thum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAllowedDuet() {
        return allowedDuet;
    }

    public void setAllowedDuet(String allowedDuet) {
        this.allowedDuet = allowedDuet;
    }

}
