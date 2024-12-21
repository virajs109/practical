package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class second2Activity extends AppCompatActivity {

    Button btnprv;
    TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnprv=findViewById(R.id.btnprv);
        tvname=findViewById(R.id.tvname);

        Intent intent=getIntent();
        intent.getStringExtra("NAME");

        btnprv.setOnClickListener(v -> {
            Intent I2= new Intent(this,MainActivity.class);
            startActivity(I2);
        });
    }
}