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

    private String actividadAnterior;
    private TextView text;
    private Cuerdas hola;
    private double[][] cuerdas;
    private boolean[][] tabs;
    private int segprac =3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_practica);




        actividadAnterior = getIntent().getStringExtra("actividad_anterior");

              if (actividadAnterior.equalsIgnoreCase("vista_previa1de1")){
                  tabs = new vista_previa_1de1().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa2de1")){
                  tabs = new vista_previa_2de1().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa3de1")){
                  tabs = new vista_previa_3de1().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa1de2")){
                  tabs = new vista_previa_1de2().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa2de2")){
                  tabs = new vista_previa_2de2().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa3de2")){
                  tabs = new vista_previa_3de2().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa1de3")){
                  tabs = new vista_previa_1de3().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa2de3")){
                  tabs = new vista_previa_2de3().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa3de3")){
                  tabs = new vista_previa_3de3().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa1de4")){
                  tabs = new vista_previa_1de3().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa2de4")){
                  tabs = new vista_previa_2de3().getTabs();
        }else if (actividadAnterior.equalsIgnoreCase("vista_previa3de4")){
                  tabs = new vista_previa_3de3().getTabs();
        }




        text = findViewById(R.id.textView8);
        hola = new Cuerdas();
        tabs = new boolean[6][12];

        new Handler().postDelayed(() -> {
            for (int i = 0; i < 6; i++) {
                for (int o = 0; o < 12; o++) {
                    if (tabs[i][o] = true) {
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
