package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class course_details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        // ✅ Find the "Find Near You" button
        Button findNearButton = findViewById(R.id.btn_find_near);

        // ✅ Set click listener to open FindUniversity page
        findNearButton.setOnClickListener(v -> {
            Intent intent = new Intent(course_details.this, FindUniversity.class);
            startActivity(intent);
        });
    }
}
