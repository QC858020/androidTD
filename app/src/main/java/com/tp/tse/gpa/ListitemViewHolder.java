package com.tp.tse.gpa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListitemViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;

    public ListitemViewHolder(@NonNull View itemView){
        super(itemView);
        this.textViewName = itemView.findViewById(R.id.Listitem_textView_name);
    }

    public void setContent(String name){
        textViewName.setText(name);
    }
}
