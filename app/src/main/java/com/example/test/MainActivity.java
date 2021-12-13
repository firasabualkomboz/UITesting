package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<String> dates = new ArrayList<>();

    MYAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dates.add("#1 feras");
        dates.add("#2 feras");
        dates.add("#3 feras");
        dates.add("#4 feras");
        dates.add("#5 feras");
        dates.add("#6 feras");
        dates.add("#7 feras");
        dates.add("#8 feras");
        dates.add("#9 feras");
        dates.add("#10 feras");
        dates.add("#11 feras");
        dates.add("#12 feras");
        dates.add("#13 feras");
        dates.add("#14 feras");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleMain);
        adapter = new MYAdapter(dates , this);
        recyclerView.setAdapter(adapter);




    }
}