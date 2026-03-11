package com.example.smarttrip;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnStartTrip;
    Button btnViewTrips;
    Button btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartTrip = findViewById(R.id.btnStartTrip);
        btnViewTrips = findViewById(R.id.btnViewTrips);
        btnSettings = findViewById(R.id.btnSettings);

        btnStartTrip.setOnClickListener(v ->
                Toast.makeText(this, "Fonction 'Démarrer voyage' à venir", Toast.LENGTH_SHORT).show()
        );

        btnViewTrips.setOnClickListener(v ->
                Toast.makeText(this, "Liste des voyages vide pour l'instant", Toast.LENGTH_SHORT).show()
        );

        btnSettings.setOnClickListener(v ->
                Toast.makeText(this, "Page paramètres bientôt disponible", Toast.LENGTH_SHORT).show()
        );
    }
}