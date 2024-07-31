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

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        Button b = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);

        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);

        //Desactivar los botones del abanico antes de que el usuario lo toque
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);

        //Botón vídeos
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(principal.this, videos.class);

                startActivity(p);
            }
        });

        //Botón textos
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(principal.this, textos.class);

                startActivity(t);
            }
        });

        //Botón practicas
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent prac = new Intent(principal.this, seleccion.class);

              startActivity(prac);
            }
        });


        //Pulsar en el abanico:
        b.setOnClickListener(new View.OnClickListener() {
            boolean F = false;
            @Override
            public void onClick(View v) {

                if (F==false){

                    //Activar y hacer visibles los botones del abanico:
                    b2.setVisibility(View.VISIBLE);
                    b3.setVisibility(View.VISIBLE);
                    b4.setVisibility(View.VISIBLE);

                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);

                    //Reestablecer la variable para cambiar el botón
                    F = true;
                }


                else if (F==true){

                    //Hacer lo contrario:
                    b2.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.INVISIBLE);
                    b4.setVisibility(View.INVISIBLE);

                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);

                    //Reestablecer la variable para cambiar el botón
                    F = false;
                }
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}