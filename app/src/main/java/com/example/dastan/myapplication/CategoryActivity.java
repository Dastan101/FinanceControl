package com.example.dastan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CategoryActivity extends AppCompatActivity {

    private String[] categories = {"1","2","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        ArrayAdapter<String> categoriesAdapter = new ArrayAdapter<String>(this,
                                                     android.R.layout.simple_spinner_item,categories);

        categoriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spCategories = (Spinner) findViewById(R.id.spCategories);

        spCategories.setAdapter(categoriesAdapter);

        spCategories.setOnItemClickListener(new );
    }
}
