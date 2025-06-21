// ✅ 1. MainActivity.java - Updated to navigate to Signup and sign_in
package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Navigate to Sign Up page
        Button signUpButton = findViewById(R.id.btn_signup);
        signUpButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Signup.class);
            startActivity(intent);
        });

        // Navigate to Sign In page
        Button signInButton = findViewById(R.id.btn_signin);
        signInButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, sign_in.class);
            startActivity(intent);
        });
    }
}
