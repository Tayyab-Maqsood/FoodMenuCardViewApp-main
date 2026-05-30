package com.example.foodmenucardviewapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    ArrayList<Food> list;

    public FoodAdapter(ArrayList<Food> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Food food = list.get(position);

        holder.imageFood.setImageResource(food.getImage());
        holder.textName.setText(food.getName());
        holder.textDesc.setText(food.getDesc());
        holder.textPrice.setText(food.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageFood;
        TextView textName, textDesc, textPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageFood = itemView.findViewById(R.id.imageFood);
            textName = itemView.findViewById(R.id.textName);
            textDesc = itemView.findViewById(R.id.textDesc);
            textPrice = itemView.findViewById(R.id.textPrice);
        }
    }
}
