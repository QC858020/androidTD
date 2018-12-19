package com.tp.tse.gpa;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListitemViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    private String name;

    public ListitemViewHolder(@NonNull View itemView, final NameItemListener nameItemListener){
        super(itemView);
        CardView cardView = itemView.findViewById(R.id.item_view_card);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                nameItemListener.clickOnItem(name);
            }
        });

        this.textViewName = itemView.findViewById(R.id.Listitem_textView_name);
    }

    public void setContent(String name){
        this.name = name;
        textViewName.setText(name);
    }
}
