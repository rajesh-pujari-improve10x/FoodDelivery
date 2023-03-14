package com.improve10x.fooddelivery;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodItemsAdapter extends RecyclerView.Adapter<FoodItemViewHolder> {

    public ArrayList<FoodItem> foodItems;

    void setData(ArrayList<FoodItem> foodItems) {
        this.foodItems = foodItems;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return foodItems.size();
    }
}
