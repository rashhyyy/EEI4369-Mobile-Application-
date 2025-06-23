package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class customize_path extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_customize_path);

        // Handle system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Back icon navigation to dashboard
        ImageView backIcon = findViewById(R.id.backIcon);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(customize_path.this, dashboard.class);
                startActivity(intent);
                finish(); // optional
            }
        });

        // ✅ Home icon navigation to dashboard
        ImageView homeIcon = findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(customize_path.this, dashboard.class);
                startActivity(intent);
                finish(); // optional
            }
        });

        // ✅ Populate District Spinner
        Spinner districtSpinner = findViewById(R.id.districtSpinner);
        String[] districts = {
                "Colombo", "Gampaha", "Kalutara", "Kandy", "Matale", "Nuwara Eliya",
                "Galle", "Matara", "Hambantota", "Jaffna", "Kilinochchi", "Mannar",
                "Vavuniya", "Mullaitivu", "Batticaloa", "Ampara", "Trincomalee",
                "Kurunegala", "Puttalam", "Anuradhapura", "Polonnaruwa",
                "Badulla", "Monaragala", "Ratnapura", "Kegalle"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, districts);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        districtSpinner.setAdapter(adapter);

        // ✅ Navigate to suggest_oopurnities when button is clicked
        Button findOpportunities = findViewById(R.id.btn_find_oopurnities);
        findOpportunities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(customize_path.this, suggest_oopurnities.class);
                startActivity(intent);
            }
        });
    }
}
