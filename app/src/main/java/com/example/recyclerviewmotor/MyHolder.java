package com.example.recyclerviewmotor;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView mIcon;
    TextView mJudul, mdes;

    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mIcon = itemView.findViewById(R.id.icon);
        this.mJudul = itemView.findViewById(R.id.judul);
        this.mdes = itemView.findViewById(R.id.deskripsi);

    }
}
