package com.example.homework_3_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityViewHolder> {

    private  ArrayList<String> CityList;

    public CityAdapter(ArrayList<String> cityList) {
        this.CityList = cityList;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_city,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
    holder.bind(CityList.get(position));
    }

    @Override
    public int getItemCount() {
        return CityList.size();
    }
}
