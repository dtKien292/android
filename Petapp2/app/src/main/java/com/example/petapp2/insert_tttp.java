package com.example.petapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class insert_tttp extends AppCompatActivity {

    private TttpAdapter tttpAdapter;

    private List<tttp> tttpList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_insert_tttp);

        ImageView imageView = findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(insert_tttp.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button back1 = findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity
                Intent intent = new Intent(insert_tttp.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity

                EditText editTime = findViewById(R.id.edit_time);
                EditText editDetail = findViewById(R.id.edit_detail);

                String timeText = editTime.getText().toString().trim();
                String detailText = editDetail.getText().toString().trim();

                if (!timeText.isEmpty() && !detailText.isEmpty()) {
                    // Tạo một đối tượng mới của lớp chứa thông tin time_tttp và detail_tttp
                    tttpList = new ArrayList<>();
                    tttpList.add(new tttp(timeText, detailText));

                    // Xóa nội dung của EditText sau khi thêm vào danh sách
                    editTime.setText("");
                    editDetail.setText("");
                }
                Intent intent = new Intent(insert_tttp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}