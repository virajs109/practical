package com.example.app1;

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

public class NameActivity extends AppCompatActivity {

    EditText etname;

    TextView tvName;

    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_name);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.etage), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnClick=findViewById(R.id.btnClick);
        tvName=findViewById(R.id.tvans);
        etname=findViewById(R.id.etName);

        btnClick.setOnClickListener(v -> {
            String name=etname.getText().toString();
            tvName.setText("the name is "+name);
            Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show();

        });
    }
}