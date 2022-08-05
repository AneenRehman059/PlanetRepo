package com.devifysolutions.planets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        ArrayList<Model> list = new ArrayList<>();
        list.add(new Model(R.drawable.jupiter,"Jupiter"));
        list.add(new Model(R.drawable.jupiter,""));
        list.add(new Model(R.drawable.planet1,""));
        list.add(new Model(R.drawable.planet1,"Mercury"));
        list.add(new Model(R.drawable.planet2,"Venus"));
        list.add(new Model(R.drawable.planet2,"Venus"));
        list.add(new Model(R.drawable.planet3,"Earth"));
        list.add(new Model(R.drawable.planet6,"Staurn"));
        list.add(new Model(R.drawable.planet9,"Uranus"));
        list.add(new Model(R.drawable.saturn,"Neptune"));
        list.add(new Model(R.drawable.uranus,"Jupiter"));
        list.add(new Model(R.drawable.venus,"Mercury"));
        list.add(new Model(R.drawable.worldwide,"Venus"));


        Adapter adapter = new Adapter(list,this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch (position){
                            case 0:
                                Toast.makeText(MainActivity.this, "Jupiter", Toast.LENGTH_SHORT).show();
                                break;

                            case 1:
                                Toast.makeText(MainActivity.this, "Mercury", Toast.LENGTH_SHORT).show();
                                break;

                            case 2:
                                Toast.makeText(MainActivity.this, "Venus", Toast.LENGTH_SHORT).show();
                                break;

                            case 3:
                                Toast.makeText(MainActivity.this, "Earth", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }
                ));

    }
}