package com.vikas.takeattendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Details> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        words.add(new Details("Vikas", "05720902715"));
        words.add(new Details("Ashish", "05720902715"));
        words.add(new Details("Mayank", "05720902715"));
        words.add(new Details("Yash", "05720902715"));
        words.add(new Details("Rathi", "05720902715"));
        words.add(new Details("Vikarsh", "05720902715"));
        words.add(new Details("Sumit", "05720902715"));
        words.add(new Details("Eminem", "05720902715"));
        words.add(new Details("Rick Ross", "05720902715"));
        words.add(new Details("Wayne", "05720902715"));
        words.add(new Details("Flash", "05720902715"));
        words.add(new Details("cisco", "05720902715"));
        words.add(new Details("ice", "05720902715"));
        words.add(new Details("fire", "05720902715"));
        words.add(new Details("water", "05720902715"));
        words.add(new Details("earth", "05720902715"));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
