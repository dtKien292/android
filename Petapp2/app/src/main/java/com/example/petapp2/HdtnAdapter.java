package com.example.petapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HdtnAdapter extends RecyclerView.Adapter<HdtnAdapter.HdtnViewHolder> {
    private List<hdtn> hdtnList;

    public HdtnAdapter(List<hdtn> hdtnList) {
        this.hdtnList = hdtnList;
    }

    @NonNull
    @Override
    public HdtnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hdtn, parent, false);
        return new HdtnViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HdtnViewHolder holder, int position) {
        hdtn hdtnItem = hdtnList.get(position);
        holder.timeTextView.setText(hdtnItem.getTime());
        holder.detailTextView.setText(hdtnItem.getDetail_hdtn());
    }

    @Override
    public int getItemCount() {
        return hdtnList.size();
    }

    public static class HdtnViewHolder extends RecyclerView.ViewHolder {
        public TextView timeTextView;
        public TextView detailTextView;

        public HdtnViewHolder(View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.time_hdtn);
            detailTextView = itemView.findViewById(R.id.detail_hdtn);
        }
    }
}
