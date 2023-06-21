package com.example.studentassistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsAdapter extends RecyclerView.Adapter<ElementsViewHolder> {

    private final List<Elements> elementsList;
    private OnItemClickListener listener;

    public ElementsAdapter(List<Elements> elementsList) {
        this.elementsList = elementsList;
    }

    @NonNull
    @Override
    public ElementsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElementsViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.activity_elements_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElementsViewHolder holder, int position) {
        holder.title.setText(elementsList.get(position).getName());
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return elementsList.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

}
