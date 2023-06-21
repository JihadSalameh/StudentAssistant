package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    TextView characteristics;
    ArrayList<Elements> elementsList = new ArrayList<>();
    Gson gson = new Gson();
    Elements element;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initializing();
        settingText();
    }

    private void settingText() {
        if(element != null) {
            characteristics.setText(element.getCharacteristics());
            characteristics.setTextSize(40.0F);
        }
    }

    private void initializing() {
        characteristics = findViewById(R.id.characteristics);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        String elementsFromGson = sharedPreferences.getString("Elements", "");
        elementsList.addAll(Arrays.asList(gson.fromJson(elementsFromGson, Elements[].class)));
        String e = sharedPreferences.getString("Element", "");
        System.out.println(e);
        for (Elements e1: elementsList) {
            if(e1.getName().equals(e)) {
                element = e1;
            }
        }
    }

}