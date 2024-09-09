package com.example.as;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class practica_1de1 extends AppCompatActivity {


    private String actividadAnterior;
    private TextView text;
    private Cuerdas hola;
    private double[][] cuerdas;
    private boolean[][] tabs;
    private int segprac = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practica1de1);


        actividadAnterior = getIntent().getStringExtra("actividad_anterior");
        text = findViewById(R.id.textView9000);
        hola = new Cuerdas();
        tabs = new boolean[6][12];

        new Handler().postDelayed(() -> {
            for (int i = 0; i < 6; i++) {
                for (int o = 0; o < 12; o++) {
                    if (tabs[i][o]) {
                        text.setText(String.valueOf(cuerdas[i][o]));
                        break;
                    }
                }
            }
        }, segprac);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}