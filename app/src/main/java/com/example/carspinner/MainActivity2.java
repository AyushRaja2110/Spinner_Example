package com.example.carspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;

public class MainActivity2 extends AppCompatActivity {

    ImageView im1;
    ListView ln1;
    Integer maruti[] = {R.drawable.baleno,R.drawable.swift,R.drawable.wagonr,R.drawable.alto,R.drawable.ertiga,R.drawable.vitarabrezza,R.drawable.dzire,R.drawable.celerio,R.drawable.spresso,R.drawable.suzukixl6,R.drawable.ciaz,R.drawable.scross,R.drawable.eeco};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ln1 = findViewById(R.id.lin);

        Intent i1 = getIntent();
        Integer maruti = i1.getIntExtra("Image",0);
    }
}