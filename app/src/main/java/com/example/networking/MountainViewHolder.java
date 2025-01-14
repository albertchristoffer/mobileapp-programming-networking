package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MountainViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView height;
    public TextView location;

    public MountainViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        location = itemView.findViewById(R.id.location);
        height = itemView.findViewById(R.id.height);
    }
}
