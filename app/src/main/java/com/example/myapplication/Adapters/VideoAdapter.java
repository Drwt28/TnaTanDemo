package com.example.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.myapplication.Model.Video;
import com.example.myapplication.R;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoPlayerViewHolder> {

    ArrayList<Video> videoArrayList;
    RequestManager requestManager;
    Context context;


    public VideoAdapter(ArrayList<Video> videoArrayList, Context context, RequestManager requestManager) {
        this.videoArrayList = videoArrayList;
        this.context = context;
        this.requestManager = requestManager;
    }

    @NonNull
    @Override
    public VideoPlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_video_list_item, parent, false);
        return new VideoPlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoPlayerViewHolder holder, int position) {

        Video video = videoArrayList.get(holder.getAdapterPosition());

        holder.onBind(video, requestManager);

    }

    @Override
    public int getItemCount() {

        return videoArrayList.size();

    }

    class viewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_name);
        }

        public void updateUi(Video video) {
            textView.setText(video.getDescription());
        }
    }
}
