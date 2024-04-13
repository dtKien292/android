package com.example.petapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.Firebase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    private RecyclerView recyclerView;
    private TttpAdapter tttpAdapter;
    private List<tttp> tttpList;
    
    
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // khai báo intent
                Intent statistical = new Intent(MainActivity.this,statistical.class);
                startActivity(statistical);
            }
        });



        ImageButton insert_tttp = findViewById(R.id.insert_tttp);
        insert_tttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent:
                Intent intent = new Intent(MainActivity.this, insert_tttp.class);
                startActivity(intent);
            }
        });

        // Khởi tạo danh sách

        tttpList = new ArrayList<>();
        tttpList.add(new tttp("06/12", "Tiêm phòng dại"));
        tttpList.add(new tttp("11/12", "Tiêm PHPP"));
        tttpList.add(new tttp("10/12", "Tiêm phòng ký sinh trùng"));
        
        
        recyclerView = findViewById(R.id.tttp);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tttpAdapter = new TttpAdapter(tttpList);
        recyclerView.setAdapter(tttpAdapter);
    }
}
