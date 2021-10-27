package com.example.tgsprak4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.java,
            R.drawable.javascript,R.drawable.kotlin,R.drawable.ruby};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.bahasa_pemograman);
        s2 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recylerView.setAdapter(myAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}