package com.example.foodmenucardviewapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Food> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        list = new ArrayList<>();

        list.add(new Food(R.drawable.burger,
                "Burger",
                "Cheesy Chicken Burger",
                "$10"));

        list.add(new Food(R.drawable.pizza,
                "Pizza",
                "Large Pepperoni Pizza",
                "$15"));

        list.add(new Food(R.drawable.fries,
                "Fries",
                "Crispy French Fries",
                "$5"));

        list.add(new Food(R.drawable.pasta,
                "Pasta",
                "Italian White Sauce Pasta",
                "$12"));

        list.add(new Food(R.drawable.sandwich,
                "Sandwich",
                "Club Sandwich",
                "$8"));

        FoodAdapter adapter = new FoodAdapter(list);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}