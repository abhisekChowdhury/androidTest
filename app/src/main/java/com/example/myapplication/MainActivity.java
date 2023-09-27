package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] attraction = {"place1"
            ,"place2"
            ,"place3"};

        List<String> attractionNames = Arrays.asList("Place 1",
                "Place 2",
                "Place 3");
        List<Integer> attractionPictures = Arrays.asList(R.drawable.beach,
                R.drawable.mountain,
                R.drawable.pier);

        ListView listViewMain = (ListView)findViewById(R.id.listViewMain);
        //listViewMain.setAdapter(new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, attraction));

        listViewMain.setAdapter(new customAdapter(attractionNames, attractionPictures, this));

        listViewMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        listViewMain.setOnItemClickListener((customAdapter,listViewMain,i,l){
                switch (i){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
        });
    }
}
