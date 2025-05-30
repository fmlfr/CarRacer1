package com.example.carracer;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StatsActivity extends AppCompatActivity {

    TextView speedStat, avgSpeedStat, distanceStat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        speedStat = findViewById(R.id.speedStat);
        avgSpeedStat = findViewById(R.id.avgSpeedStat);
        distanceStat = findViewById(R.id.distanceStat);

        // Placeholder for backend data
        speedStat.setText("Top Speed: 142 km/h");
        avgSpeedStat.setText("Average Speed: 76 km/h");
        distanceStat.setText("Total Distance: 213 km");
    }
}
