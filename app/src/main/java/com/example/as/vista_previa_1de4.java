package com.example.as;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class vista_previa_1de4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vista_previa1de4);

        Button b = findViewById(R.id.leccion1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(vista_previa_1de4.this, practica.class);

                i.putExtra("actividad_anterior", getLocalClassName());
                startActivity(i);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Literalmente las tablaturas:
    boolean[][] tabs = new boolean[6][12];



    public boolean[][] getTabs() {
        //Justo ahora estoy pensando en como hacer que un dato marque dos veces true, pero aún no se como:(

        tabs[6][0] = true;
        tabs[6][0] = true;

        tabs[6][0] = true;
        tabs[6][0] = true;
        tabs[6][3] = true;

        tabs[5][0] = true;
        tabs[5][0] = true;

        tabs[5][2] = true;
        tabs[5][2] = true;

        tabs[5][2] = true;
        tabs[5][2] = true;
        tabs[6][3] = true;

        tabs[6][4] = false;
        return tabs;
    }
}