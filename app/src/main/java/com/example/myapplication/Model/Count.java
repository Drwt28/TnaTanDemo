package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Count {

    @SerializedName("like_count")
    @Expose
    private Integer likeCount;
    @SerializedName("video_comment_count")
    @Expose
    private Integer videoCommentCount;
    @SerializedName("view")
    @Expose
    private Integer view;
    @SerializedName("share_count")
    @Expose
    private Integer shareCount;

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getVideoCommentCount() {
        return videoCommentCount;
    }

    public void setVideoCommentCount(Integer videoCommentCount) {
        this.videoCommentCount = videoCommentCount;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

}