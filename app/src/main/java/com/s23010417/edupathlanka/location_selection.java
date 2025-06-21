package com.s23010417.edupathlanka;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class location_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_selection);

        EditText etStudyLocation = findViewById(R.id.et_study_location);
        Button btnNewLocation = findViewById(R.id.btn_new_location);

        btnNewLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = etStudyLocation.getText().toString().trim();
                if (!location.isEmpty()) {
                    Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(location));
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    if (mapIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(mapIntent);
                    } else {
                        startActivity(new Intent(Intent.ACTION_VIEW, gmmIntentUri));
                    }
                } else {
                    etStudyLocation.setError("Please enter a location to search");
                }
            }
        });
    }
}
