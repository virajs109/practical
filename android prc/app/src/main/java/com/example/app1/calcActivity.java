package com.example.app1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calcActivity extends AppCompatActivity {
    Button btnplus;

    Button btnminus;

    Button btnmul;

    Button  btndiv;

    EditText edttxt1;

    EditText edtxt2;

    TextView txt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnminus);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        edttxt1=findViewById(R.id.edttxt1);
        edtxt2=findViewById(R.id.edttxt2);
        txt4=findViewById(R.id.txt4);







    }
}