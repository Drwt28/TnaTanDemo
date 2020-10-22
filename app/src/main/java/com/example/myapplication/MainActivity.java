package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.Adapters.VideoAdapter;
import com.example.myapplication.Model.Video;
import com.example.myapplication.ViewModel.MainActivityViewModel;
import com.example.myapplication.recyclerView.VideoPlayerRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    MainActivityViewModel viewModel;
    private VideoPlayerRecyclerView recyclerView;
    private VideoAdapter videoAdapter;
    Boolean isLoading ;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = findViewById(R.id.progress_bar);

        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        viewModel.init();
        viewModel.getVideoLList().observe(this, new Observer<ArrayList<Video>>() {
            @Override
            public void onChanged(ArrayList<Video> videos) {
                initRecyclerView();
            }
        });

        viewModel.getIsLoading().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if(aBoolean)
                {
                    showProgressBar();
                }
                else{
                    hideProgressBar();
                }
            }
        });




    }
    private void initRecyclerView(){
        recyclerView = findViewById(R.id.rv_videosList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setVideos(viewModel.getVideoLList().getValue());
        videoAdapter = new VideoAdapter(viewModel.getVideoLList().getValue(),MainActivity.this,initGlide());
        recyclerView.setAdapter(videoAdapter);
    }

    private RequestManager initGlide(){
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.white_background)
                .error(R.drawable.white_background);

        return Glide.with(this)
                .setDefaultRequestOptions(options);
    }

    private void showProgressBar(){
        mProgressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar(){
        mProgressBar.setVisibility(View.GONE);
    }

}