package com.example.as;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class principal extends AppCompatActivity {

    private Spinner spinner;
    Button practicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        spinner = findViewById(R.id.spinner);
        practicar = findViewById(R.id.practicar);
        practicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(principal.this, seleccion2.class);
                startActivity(intent);
            }
        });

        String[] opciones = {"Tutoriales", "tutorial 1", "tutorial 2","tutorial 3","tutorial 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 1:

                        Intent intent1 = new Intent(principal.this, video_leccion.class);
                        startActivity(intent1);
                        break;

                    case 2:

                        Intent intent2 = new Intent(principal.this, video_leccion2.class);
                        startActivity(intent2);
                        break;
                    case 3:

                        Intent intent3 = new Intent(principal.this, video_leccion3.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(principal.this, video_leccion4.class);
                        startActivity(intent4);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}