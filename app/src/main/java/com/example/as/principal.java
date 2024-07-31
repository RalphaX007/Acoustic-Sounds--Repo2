package com.example.as;

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
        b.setOnClickListener(new View.OnClickListener() {
            boolean F = false;
            @Override
            public void onClick(View v) {

                if (F==false){
                    b2.setBackgroundColor(getColor(R.color.white));
                    b3.setBackgroundColor(getColor(R.color.white));
                    b4.setBackgroundColor(getColor(R.color.white));

                    F = true;
                } else if (F==true){
                    b2.setBackgroundColor(getColor(R.color.black));
                    b3.setBackgroundColor(getColor(R.color.black));
                    b4.setBackgroundColor(getColor(R.color.black));

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