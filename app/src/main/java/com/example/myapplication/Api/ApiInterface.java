package com.example.myapplication.Api;

import com.example.myapplication.Model.Video;
import com.example.myapplication.Model.VideoResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("v2/?p=showAllVideos")
    Call<VideoResponse> getVideos();
}
