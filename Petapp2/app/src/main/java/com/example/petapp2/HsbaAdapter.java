package com.example.petapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HsbaAdapter extends RecyclerView.Adapter<HsbaAdapter.HsbaViewHolder> {
    private List<hsba> hsbaList;

    public HsbaAdapter(List<hsba> hsbaList) {
        this.hsbaList = hsbaList;
    }

    @NonNull
    @Override
    public HsbaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hsba, parent, false);
        return new HsbaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HsbaViewHolder holder, int position) {
        hsba hsbaItem = hsbaList.get(position);
        holder.timeTextView.setText(hsbaItem.getTime_hsba());
        holder.detailTextView.setText(hsbaItem.getDetail_hsba());
    }

    @Override
    public int getItemCount() {
        return hsbaList.size();
    }

    public static class HsbaViewHolder extends RecyclerView.ViewHolder {
        public TextView timeTextView;
        public TextView detailTextView;

        public HsbaViewHolder(View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.time_hsba);
            detailTextView = itemView.findViewById(R.id.detail_hsba);
        }
    }
}
