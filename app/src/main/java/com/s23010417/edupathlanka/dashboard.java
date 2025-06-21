package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    }
}
