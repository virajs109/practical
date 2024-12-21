package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class prccActivity extends AppCompatActivity {

    EditText etage;

    Button btnage;

    TextView tvage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prcc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnage=findViewById(R.id.btnage);
        tvage=findViewById(R.id.tvage);
        etage=findViewById(R.id.etage);

        btnage.setOnClickListener(v -> {
            String name=etage.getText().toString();
            tvage.setText("the age  is "+name);
            Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show();


        });




    }
}