package com.example.myapplication.Repo;

import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.Api.ApiClient;
import com.example.myapplication.Model.Video;
import com.example.myapplication.Model.VideoResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VideoListService {
    private static VideoListService instance;
    ArrayList<Video> videoArrayList = new ArrayList<>();

    public static VideoListService getInstance() {
        if (instance == null) {
            instance = new VideoListService();
        }
        return instance;
    }

    public MutableLiveData<ArrayList<Video>> getVideoList() {
        setVideoList();
        MutableLiveData<ArrayList<Video>> data = new MutableLiveData<>();
        data.setValue(setVideoList());
        return data;
    }

    ArrayList<Video> temp = new ArrayList<>();

    private ArrayList<Video> setVideoList() {


        Call<VideoResponse> call = ApiClient.getApiClient().getVideos();

        call.enqueue(new Callback<VideoResponse>() {
            @Override
            public void onResponse(Call<VideoResponse> call, Response<VideoResponse> response) {
                if (response.code() == 200 && response.isSuccessful()) {

                    temp = response.body().getVideoArrayList();
                }
            }

            @Override
            public void onFailure(Call<VideoResponse> call, Throwable t) {

            }
        });

        return  temp;
    }

}
