package com.example.multi;

import static com.example.multi.Constant.LayoutOne;
import static com.example.multi.Constant.LayoutTwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter {

    private final List<ItemWrapper> items;

    public ItemAdapter(List<ItemWrapper> items) {
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        switch (items.get(position).getViewType()) {
            case 0:
                return LayoutOne;
            case 1:
                return LayoutTwo;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case LayoutOne:
                View layoutOne = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_one, parent, false);
                return new LayoutOneViewHolder(layoutOne);
            case LayoutTwo:
                View layoutTwo = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_two, parent, false);
                return new LayoutTwoViewHolder(layoutTwo);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (items.get(position).getViewType()) {
            case LayoutOne:
                LayoutOneViewHolder holderOne = ((LayoutOneViewHolder) holder);
                holderOne.setView(items.get(position).getItemOne());
                holderOne.getBinding().cvOne.setOnClickListener(view -> {
                    showToast(view, items.get(position).getItemOne().getTitle());
                });
                break;

            case LayoutTwo:
                LayoutTwoViewHolder holderTwo = ((LayoutTwoViewHolder) holder);
                holderTwo.setViews(items.get(position).getItemTwo());
                holderTwo.getBinding().cvTwo.setOnClickListener(view -> {
                    showToast(view, items.get(position).getItemTwo().getSubTitle());
                });
                break;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private void showToast(View view, String message) {
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
