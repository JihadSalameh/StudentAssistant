package com.example.studentassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner elementsSpinner;
    TextView characteristics;
    DAElements elements = new DAElements();
    ArrayList<String> elementNames = elements.getElementsName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementsSpinner = findViewById(R.id.elementsSpinner);
        characteristics = findViewById(R.id.characteristics);

        ArrayAdapter<String> ad = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,elementNames);
        elementsSpinner.setAdapter(ad);
    }

    public void SearchElements(View view) {
        Elements ex = elements.getElement(elementsSpinner.getSelectedItem().toString());
        characteristics.setText(ex.toString());
        characteristics.setTextSize(40);
    }
}