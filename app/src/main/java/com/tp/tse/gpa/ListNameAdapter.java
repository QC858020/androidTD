package com.tp.tse.gpa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListNameAdapter extends RecyclerView.Adapter<ListitemViewHolder> {
    private List<String> nameList;

    public ListNameAdapter(){
        nameList = new ArrayList<>();
    }
    @NonNull
    @Override
    public ListitemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListitemViewHolder listitemViewHolder, int i) {
        listitemViewHolder.setContent(nameList.get(i));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
