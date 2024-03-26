package com.example.petapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    private RecyclerView recyclerView;
    private HdtnAdapter hdtnAdapter;
    private HsbaAdapter hsbaAdapter;
    private ThskAdapter thskAdapter;
    private TttpAdapter tttpAdapter;
    private List<hdtn> hdtnList;
    private List<hsba> hsbaList;
    private List<thsk> thskList;
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


        ImageButton insert_hdtn = findViewById(R.id.insert_hdtn);
        insert_hdtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent:
                Intent intent = new Intent(MainActivity.this, insert_hdtn.class);
                startActivity(intent);
            }
        });

        ImageButton insert_thsk = findViewById(R.id.insert_thsk);
        insert_thsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent:
                Intent intent = new Intent(MainActivity.this, insert_thsk.class);
                startActivity(intent);
            }
        });

        ImageButton insert_hsba = findViewById(R.id.insert_hsba);
        insert_hsba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity using an Intent:
                Intent intent = new Intent(MainActivity.this, insert_hsba.class);
                startActivity(intent);
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
        hdtnList = new ArrayList<>();
        hdtnList.add(new hdtn("8:30", "Ăn sáng"));
        hdtnList.add(new hdtn("6:00", "Cho đi dạo"));

        thskList = new ArrayList<>();
        thskList.add(new thsk("04/02", "Bình thường"));
        thskList.add(new thsk("02/01", "Ho"));
        thskList.add(new thsk("01/01", "Tăng 1kg"));

        hsbaList = new ArrayList<>();
        hsbaList.add(new hsba("02/01", "Uống thuốc ho"));
        hsbaList.add(new hsba("02/01", "Ho"));
        hsbaList.add(new hsba("06/12", "Tiêm phòng dại"));

        tttpList = new ArrayList<>();
        tttpList.add(new tttp("06/12", "Tiêm phòng dại"));
        tttpList.add(new tttp("11/12", "Tiêm PHPP"));
        tttpList.add(new tttp("10/12", "Tiêm phòng ký sinh trùng"));


        // Khởi tạo RecyclerView
        recyclerView = findViewById(R.id.hdtn);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        hdtnAdapter = new HdtnAdapter(hdtnList);
        recyclerView.setAdapter(hdtnAdapter);

        recyclerView = findViewById(R.id.thsk);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        thskAdapter = new ThskAdapter(thskList);
        recyclerView.setAdapter(thskAdapter);

        recyclerView = findViewById(R.id.hsba);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        hsbaAdapter = new HsbaAdapter(hsbaList);
        recyclerView.setAdapter(hsbaAdapter);

        recyclerView = findViewById(R.id.tttp);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tttpAdapter = new TttpAdapter(tttpList);
        recyclerView.setAdapter(tttpAdapter);
    }
}
