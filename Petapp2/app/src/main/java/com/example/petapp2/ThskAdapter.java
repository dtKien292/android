package com.example.petapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ThskAdapter extends RecyclerView.Adapter<ThskAdapter.ThskViewHolder> {
    private List<thsk> thskList;

    public ThskAdapter(List<thsk> thskList) {
        this.thskList = thskList;
    }

    @NonNull
    @Override
    public ThskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.thsk, parent, false);
        return new ThskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ThskViewHolder holder, int position) {
        thsk thskItem = thskList.get(position);
        holder.timeTextView.setText(thskItem.getTime_thsk());
        holder.detailTextView.setText(thskItem.getDetail_thsk());
    }

    @Override
    public int getItemCount() {
        return thskList.size();
    }

    public static class ThskViewHolder extends RecyclerView.ViewHolder {
        public TextView timeTextView;
        public TextView detailTextView;

        public ThskViewHolder(View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.time_thsk);
            detailTextView = itemView.findViewById(R.id.detail_thsk);
        }
    }
}
