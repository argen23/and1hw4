package com.example.and1hw4.SecondFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.and1hw4.R;
import com.example.and1hw4.Models.User;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MainHolder> {
    private ArrayList<User> list = new ArrayList<>();;
    private TextView number , name , musicName , musicDuration;
    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MainHolder(view);
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
        notifyDataSetChanged();
    }


    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface OnClickListener{
        void onClick();
    }
    public  class MainHolder extends RecyclerView.ViewHolder {
        public MainHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.tv_music_number);
            name  = itemView.findViewById(R.id.tv_name);
            musicName = itemView.findViewById(R.id.tv_music_name);
            musicDuration = itemView.findViewById(R.id.tv_music_duration);
        }
        public void onBind(User list) {
            number.setText(list.getNumber());
            name.setText(list.getName());
            musicName.setText(list.getMusicName());
            musicDuration.setText(list.getMusicDuration());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.onClick();
                }
            });
        }

    }

}
