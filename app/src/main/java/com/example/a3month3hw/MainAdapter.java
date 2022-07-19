package com.example.a3month3hw;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<String> name, contact, destination;
    @SuppressLint("StaticFieldLeak")
    static TextView tvName, tvContact, tvDestination;

    public MainAdapter(ArrayList<String> name, ArrayList<String> contact, ArrayList<String> destination) {
        this.name = name;
        this.contact = contact;
        this.destination = destination;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(name.get(position), contact.get(position), destination.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvContact = itemView.findViewById(R.id.tv_age);
            tvDestination = itemView.findViewById(R.id.destination);
        }

        public void onBind(String s, String s1, String s2) {
            tvName.setText(s);
            tvContact.setText(s1);
            tvDestination.setText(s2);
        }
    }
}
