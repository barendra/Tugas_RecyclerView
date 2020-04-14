package com.example.recyclerviewmotor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter = new MyAdapter(this, getMyList());

        mRecyclerView.setAdapter(MyAdapter);
    }

    private ArrayList<Model>getMyList(){

        ArrayList<Model>models = new ArrayList<>();

        Model m = new Model();
        m.setJudul("Harley Davidson 48");
        m.setDeskripsi("Besar CC : 1200 CC");
        m.setImg(R.drawable.harley);
        models.add(m);

        m = new Model();
        m.setJudul("Yamaha R6");
        m.setDeskripsi("Besar CC : 600 CC");
        m.setImg(R.drawable.r6);
        models.add(m);

        m = new Model();
        m.setJudul("Kawasaki Z1000");
        m.setDeskripsi("Besar CC : 1000 CC");
        m.setImg(R.drawable.z1000);
        models.add(m);

        m = new Model();
        m.setJudul("Honda CBR 1000RR");
        m.setDeskripsi("Besar CC : 1000 CC");
        m.setImg(R.drawable.cbr1000);
        models.add(m);

        m = new Model();
        m.setJudul("Ducati Panigale 1299");
        m.setDeskripsi("Besar CC : 1299 CC");
        m.setImg(R.drawable.ducati);
        models.add(m);

        m = new Model();
        m.setJudul("Suzuki GSX-R 1000");
        m.setDeskripsi("Besar CC : 1000 CC");
        m.setImg(R.drawable.gsxr1000);
        models.add(m);


        return models;

    }
}