package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    DAElements elements = new DAElements();
    ArrayList<Elements> elementsList = new ArrayList<>();
    RecyclerView recyclerView;
    ElementsAdapter adapter;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getApplicationContext().getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        savingData();
        initializing();
    }

    private void savingData() {
        String json = gson.toJson(elements.getElements());
        editor.putString("Elements", json);
        editor.apply();
    }

    private void initializing() {
        recyclerView = findViewById(R.id.elements_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String elementsFromGson = sharedPreferences.getString("Elements", "");
        elementsList.addAll(Arrays.asList(gson.fromJson(elementsFromGson, Elements[].class)));
        adapter = new ElementsAdapter(elementsList);
        adapter.setOnItemClickListener(position -> {
            Elements element = elementsList.get(position);
            editor.putString("Element", element.getName());
            editor.apply();
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        });
        recyclerView.setAdapter(adapter);
    }

}