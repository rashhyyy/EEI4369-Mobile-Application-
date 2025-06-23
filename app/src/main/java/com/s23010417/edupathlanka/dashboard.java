package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Handle map icon click
        ImageView mapIcon = findViewById(R.id.mapIcon);
        mapIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, FindUniversity.class);
                startActivity(intent);
            }
        });

        // Handle profile picture click
        ImageView profileImage = findViewById(R.id.img_profile);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, profile.class);
                startActivity(intent);
            }
        });

        // Handle "Start Exploring" button
        Button btnExplore = findViewById(R.id.btn_explore);
        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, customize_path.class);
                startActivity(intent);
            }
        });

        // ✅ Handle "Browse Now" button to navigate to vocational_courses
        Button btnBrowse = findViewById(R.id.btn_browse);
        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, vocational_courses.class);
                startActivity(intent);
            }
        });
    }
}
