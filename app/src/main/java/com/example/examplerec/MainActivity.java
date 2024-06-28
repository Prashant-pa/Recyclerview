package com.example.examplerec;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rcv=(RecyclerView) findViewById(R.id.recycle);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String[]arr={"java","sql","c","c++","python","java","sql","c","c++","python"};
        rcv.setAdapter(new MyAdapter(arr));
    }
}