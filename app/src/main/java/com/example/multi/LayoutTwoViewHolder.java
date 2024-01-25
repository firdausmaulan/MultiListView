package com.example.multi;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multi.databinding.LayoutTwoBinding;

class LayoutTwoViewHolder extends RecyclerView.ViewHolder {

    private final LayoutTwoBinding binding;

    public LayoutTwoViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = LayoutTwoBinding.bind(itemView);
    }

    public void setViews(ItemTwo item) {
        binding.ivContent.setImageResource(item.getImage());
        binding.tvContent.setText(item.getTitle());
        binding.tvSubContent.setText(item.getSubTitle());
    }

    public LayoutTwoBinding getBinding() {
        return binding;
    }
}