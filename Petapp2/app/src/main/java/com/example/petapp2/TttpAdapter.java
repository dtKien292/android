package com.example.petapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TttpAdapter extends RecyclerView.Adapter<TttpAdapter.TttpViewHolder> {
    private List<tttp> tttpList;

    public TttpAdapter(List<tttp> tttpList) {
        this.tttpList = tttpList;
    }

    @NonNull
    @Override
    public TttpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tttp, parent, false);
        return new TttpViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TttpViewHolder holder, int position) {
        tttp tttpItem = tttpList.get(position);
        holder.timeTextView.setText(tttpItem.getTime_tttp());
        holder.detailTextView.setText(tttpItem.getDetail_tttp());
    }

    @Override
    public int getItemCount() {
        return tttpList.size();
    }

    public static class TttpViewHolder extends RecyclerView.ViewHolder {
        public TextView timeTextView;
        public TextView detailTextView;

        public TttpViewHolder(View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.time_tttp);
            detailTextView = itemView.findViewById(R.id.detail_tttp);
        }
    }
}
