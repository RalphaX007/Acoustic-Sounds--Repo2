package com.example.as;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class practica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practica);
        String actividadAnterior = getIntent().getStringExtra("actividad_anterior");

        TextView text = findViewById(R.id.textView8);

        Cuerdas hola = new Cuerdas();
        double[][] cuerdas = hola.getCuerdas();
        boolean[][] tabs = new boolean[0][0];
        int segprac = 0;

        boolean[][] finalTabs = tabs;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i >= 6; i++){
                    for (int o = 0; o >= 12; o++){
                        if (finalTabs[i][o]){
                            text.setText(getString((int) cuerdas[i][o]));
                            break;
                        }
                    }
                }
                finish();
            }
        }, segprac);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}