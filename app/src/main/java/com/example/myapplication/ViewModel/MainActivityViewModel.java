package com.example.myapplication.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.Api.ApiClient;
import com.example.myapplication.Model.Video;
import com.example.myapplication.Model.VideoResponse;
import com.example.myapplication.Repo.VideoListService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends ViewModel {

    VideoListService videoListService;
    MutableLiveData<ArrayList<Video>> videoLList = new MutableLiveData<>();
    MutableLiveData<Boolean> isLoading = new MutableLiveData<Boolean>();


    public MutableLiveData<ArrayList<Video>> getVideoLList() {
        return videoLList;
    }

    public MutableLiveData<Boolean> getIsLoading() {
        return isLoading;
    }

    public void init()
    {
        isLoading.setValue(true);

        getData();
//        `
    }

    public void getData(){

        videoLList.setValue(new ArrayList<>());
        isLoading.setValue(true);
        Call<VideoResponse> call = ApiClient.getApiClient().getVideos();

        call.enqueue(new Callback<VideoResponse>() {
            @Override
            public void onResponse(Call<VideoResponse> call, Response<VideoResponse> response) {
                if (response.code() == 200 && response.isSuccessful()) {

                    System.out.println(response.body().getVideoArrayList());
                    isLoading.setValue(false);
                     videoLList.setValue(response.body().getVideoArrayList());
                }else{
                    System.out.println(response.body());
                }
            }

            @Override
            public void onFailure(Call<VideoResponse> call, Throwable t) {

                System.out.println(t.getMessage());
            }
        });

    }
  }
