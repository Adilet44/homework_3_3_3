package com.example.homework_3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder {

    private  TextView tvCity;

    public CityViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCity = itemView.findViewById(R.id.tv_city);
    }
    void bind(String city){
        tvCity.setText(city);

    }
}
