package com.s23010417.edupathlanka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {

    EditText inputName, inputEmail, inputPassword;
    Button signupButton;
    TextView backText;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // ✅ Apply padding for system UI
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.whiteBox), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ✅ Initialize views
        inputName = findViewById(R.id.input_name);           // Must match your XML EditText ID
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);
        signupButton = findViewById(R.id.btn_signin);        // Already used in your layout
        backText = findViewById(R.id.backText);

        // ✅ Initialize database helper
        dbHelper = new DatabaseHelper(this);

        // ✅ Sign Up Button Click
        signupButton.setOnClickListener(view -> {
            String name = inputName.getText().toString().trim();
            String email = inputEmail.getText().toString().trim();
            String password = inputPassword.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(Signup.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                boolean isInserted = dbHelper.insertUser(name, email, password);
                if (isInserted) {
                    Toast.makeText(Signup.this, "Successfully registered!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Signup.this, dashboard.class));
                    finish();
                } else {
                    Toast.makeText(Signup.this, "Failed to register. Please try again.", Toast.LENGTH_LONG).show();
                }
            }
        });

        // ✅ Back Text Click
        backText.setOnClickListener(view -> {
            startActivity(new Intent(Signup.this, MainActivity.class));
            finish(); // Optional: close this screen
        });
    }
}
