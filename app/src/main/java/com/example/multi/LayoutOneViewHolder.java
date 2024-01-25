package com.example.multi;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multi.databinding.LayoutOneBinding;

class LayoutOneViewHolder extends RecyclerView.ViewHolder {

    private final LayoutOneBinding binding;

    public LayoutOneViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = LayoutOneBinding.bind(itemView);
    }

    public void setView(ItemOne item) {
        binding.tvContent.setText(item.getTitle());
    }

    public LayoutOneBinding getBinding() {
        return binding;
    }
}