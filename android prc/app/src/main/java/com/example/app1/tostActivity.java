package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tostActivity extends AppCompatActivity {
    Button btn,btnn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tost);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.etage), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn = findViewById(R.id.btn1);
        btnn = findViewById(R.id.btn2);

        btn.setOnClickListener(view -> {
        Toast.makeText(this,"Button click",Toast.LENGTH_SHORT ).show();
        });
        btnn.setOnClickListener(v -> {
            Toast.makeText(this,"Viraj Patel",Toast.LENGTH_SHORT ).show();


        });
    }
}