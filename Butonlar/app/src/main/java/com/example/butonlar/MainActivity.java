package com.example.butonlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn,silmebutonu;

    TextView textgöster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn = findViewById(R.id.buton1);
        textgöster = findViewById(R.id.göster);
        silmebutonu = findViewById(R.id.deletebtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textgöster.setText("Şampiyon BEŞİKTAŞ");
            }
        });

        silmebutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textgöster.setText("");
            }
        });


    }
}