package com.example.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

         loadData ();
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        names = new ArrayList<>();
    names.add("Murat");
    names.add("Bakai");
    names.add("Munu");
    names.add("Talgat");
    names.add("kanat");
    }
}