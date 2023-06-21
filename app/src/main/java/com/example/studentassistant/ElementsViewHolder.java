package com.example.studentassistant;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ElementsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public ElementsViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
    }
}
