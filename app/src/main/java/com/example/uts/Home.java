package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    private ImageView jadwal, daftar, kasir, farmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        jadwal = (ImageView) findViewById(R.id.jadwal);
        daftar = (ImageView) findViewById(R.id.daftar);
        kasir = (ImageView) findViewById(R.id.kasir);
        farmasi = (ImageView) findViewById(R.id.farmasi);


        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, JadwalDokter.class);
                startActivity(intent);

            }
        });


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Pendaftaran.class);
                startActivity(intent);

            }
        });

        kasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Kasir.class);
                startActivity(intent);

            }
        });

        farmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Farmasi.class);
                startActivity(intent);

            }
        });
    }
}
