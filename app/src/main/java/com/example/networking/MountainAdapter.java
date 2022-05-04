package com.example.networking;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<MountainViewHolder> {

    private List<Mountain> mountains = new ArrayList();

    @NonNull
    @Override
    public MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MountainViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull MountainViewHolder holder, int position) {
        holder.name.setText(mountains.get(position).getName());
        holder.location.setText(mountains.get(position).getLocation());
        holder.height.setText(String.valueOf(mountains.get(position).getHeight()));
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public void setMountains(List<Mountain> mountains) {
        this.mountains = mountains;
    }
}
