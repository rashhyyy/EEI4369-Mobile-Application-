package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Apply padding for system UI
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.whiteBox), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Navigate to Dashboard on Sign up button click
        Button signupButton = findViewById(R.id.btn_signin); // Matches your XML ID
        signupButton.setOnClickListener(view -> {
            Intent intent = new Intent(Signup.this, dashboard.class);
            startActivity(intent);
        });
    }
}
