package com.example.gridviewwithimagesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int[] images =
            {
                    R.drawable.ariel,
                    R.drawable.bambi,
                    R.drawable.beast,
                    R.drawable.bell,
                    R.drawable.cinderella,
                    R.drawable.dumbo,
                    R.drawable.goofy,
                    R.drawable.jasmine,
                    R.drawable.mickey,
                    R.drawable.mulan,
                    R.drawable.olaf,
                    R.drawable.pocahontas,
                    R.drawable.simba,
                    R.drawable.stitch,
                    R.drawable.tinkerbell,
            };

    String[] characters =
            {
                    "Ariel",
                    "Bambi",
                    "Beast",
                    "Bell",
                    "Cinderella",
                    "Dumbo",
                    "Goofy",
                    "Jasmine",
                    "Mickey",
                    "Mulan",
                    "Olaf",
                    "Pocahontas",
                    "Simba",
                    "Stitch",
                    "Tinkerbell"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView = (GridView) findViewById(R.id.datagrid);

        myAdapter ma = new myAdapter(characters, images, this);
        gridView.setAdapter(ma);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, characters[position] + " was clicked on!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}