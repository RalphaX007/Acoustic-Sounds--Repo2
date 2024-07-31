package com.example.as;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class crear_cuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_cuenta);

        EditText nombre = findViewById(R.id.nombre);
        EditText pass = findViewById(R.id.contaseña);

        Button b = findViewById(R.id.prodeguir);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = nombre.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if (text.isEmpty() || password.isEmpty()){
                    if (text.isEmpty()){
                        nombre.setText("Ingresa tu correo");
                    } else {
                        pass.setText("Ingresa la contraseña");
                    }
                } else if (!text.isEmpty() && !password.isEmpty()){
                    Intent i = new Intent(crear_cuenta.this, informacion_1.class);

                    startActivity(i);
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