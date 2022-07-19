package com.example.a3month3hw;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> contact = new ArrayList<>();
    private ArrayList<String> destination = new ArrayList<>();
    private MainAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecycler();
    }

    private void initData() {
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
        name.add("Who's");
        contact.add("+996755555555");
        destination.add("Описание человека который был во времени");
    }

    private void initRecycler() {
        adapter = new MainAdapter(name, contact, destination);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
    }
}