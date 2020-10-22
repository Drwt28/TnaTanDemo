package com.example.myapplication.Adapters;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.myapplication.Model.Video;
import com.example.myapplication.R;

public class VideoPlayerViewHolder extends RecyclerView.ViewHolder {

    public FrameLayout media_container;
    public  TextView title,profile;
    public ImageView thumbnail, volumeControl;
    public  ProgressBar progressBar;
    public View parent;
    public RequestManager requestManager;

    public VideoPlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        parent = itemView;
        media_container = itemView.findViewById(R.id.media_container);
        thumbnail = itemView.findViewById(R.id.thumbnail);
        title = itemView.findViewById(R.id.title);
        profile = itemView.findViewById(R.id.profile);
        progressBar = itemView.findViewById(R.id.progressBar);
        volumeControl = itemView.findViewById(R.id.volume_control);
    }

    public void onBind(Video Video, RequestManager requestManager) {
        this.requestManager = requestManager;
        parent.setTag(this);
        profile.setText(Video.getUserInfo().getUsername());
        title.setText(Video.getDescription());
        this.requestManager
                .load(Video.getThum())
                .into(thumbnail);
    }

}