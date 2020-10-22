package com.example.myapplication.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    Retrofit retrofit;

    public static final String  BASE_URL = "http://tntn-env.eba-9dek2y2y.ap-south-1.elasticbeanstalk.com/";
    public static ApiInterface getApiClient()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface service = retrofit.create(ApiInterface.class);

        return  service;
    }
}
