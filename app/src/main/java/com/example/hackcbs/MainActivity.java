package com.example.hackcbs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        TODO get crops from database
        Crop presentCrops[] = {new Crop("Wheat",R.drawable.wheat)};
        adapter = new CropRecyclerViewAdapter(presentCrops, MainActivity.this);
        recyclerView.setAdapter(adapter);

        FloatingActionButton addNewCrop = (FloatingActionButton) findViewById(R.id.crop_add_button);
        addNewCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddNewCropActivity.class);
                startActivity(intent);
            }
        });
    }
}
