package com.example.networking;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class mountainAdapter extends RecyclerView.Adapter<mountainViewHolder> {

    private List<Mountain> mountains;

    public mountainAdapter(List<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public mountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull mountainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
}
