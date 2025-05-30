package com.example.carracer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MeasureActivity extends AppCompatActivity {

    TextView currentSpeed;
    Button startButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        currentSpeed = findViewById(R.id.currentSpeed);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);

        // Placeholder logic – replace with GPS backend
        startButton.setOnClickListener(v -> {
            currentSpeed.setText("Speed: 45 km/h");
        });

        stopButton.setOnClickListener(v -> {
            currentSpeed.setText("Speed: 0 km/h");
        });
    }
}
