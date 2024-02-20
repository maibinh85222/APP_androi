package com.example.demointeviti.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demointeviti.R;
import com.example.demointeviti.model.tenkhachsan;

import java.util.List;

public class tenkhachsanAdapter extends RecyclerView.Adapter<tenkhachsanAdapter.tenkhachsanViewHolder> {

    private List<tenkhachsan> listtenkhachsan;

    public tenkhachsanAdapter(List<tenkhachsan> listtenkhachsan) {
        this.listtenkhachsan = listtenkhachsan;
    }

    @NonNull
    @Override
    public tenkhachsanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpart_home1,parent,false);

        return new tenkhachsanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tenkhachsanViewHolder holder, int position) {
        tenkhachsan Tenkhachsan = listtenkhachsan.get(position);

        if(Tenkhachsan == null) return;
        holder.namks.setText(Tenkhachsan.getNameks());
    }

    @Override
    public int getItemCount() {
        if(listtenkhachsan != null) return listtenkhachsan.size();
        return 0;
    }

    class tenkhachsanViewHolder extends RecyclerView.ViewHolder{

        private TextView namks;

        public tenkhachsanViewHolder(@NonNull View itemView) {

            super(itemView);

            namks = namks.findViewById(R.id.text_view);


        }
    }
}
