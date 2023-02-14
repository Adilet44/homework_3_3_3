package com.example.homework_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> cityList;
    private CityAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_city);
        loadData();
         adapter = new CityAdapter(cityList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        cityList = new ArrayList<>();
        cityList.add("Bishkek");
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Galal-Abat");
        cityList.add("Osh");
        cityList.add("Kazakhstan");
        cityList.add("Almaty");
        cityList.add("Talas");
        cityList.add("Astana");
        cityList.add("Evropa");

    }
}