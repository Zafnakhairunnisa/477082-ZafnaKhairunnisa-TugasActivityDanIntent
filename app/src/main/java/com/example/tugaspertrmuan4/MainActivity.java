package com.example.tugaspertrmuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button makanan, minuman;
    EditText menu;
    TextView replyJumlah;
//    public static final String DAFTAR_EXTRA = "DAFTAR_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.inp_menu);
        makanan = findViewById(R.id.btn_makanan);
        minuman = findViewById(R.id.btn_minuman);
        replyJumlah = findViewById(R.id.reply_jml);

//        Intent terimaJml = getIntent();
//        String rplyJml = terimaJml.getStringExtra("jumlahMenu");
//        replyJumlah.setText((CharSequence) terimaJml);

        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String menuMakanan = menu.getText().toString();
                intent.putExtra("namaMenu", menuMakanan);
                startActivity(intent);
            }
        });

        minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                String menuMinuman = menu.getText().toString();
                intent.putExtra("namaMenu", menuMinuman);
                startActivity(intent);
            }
        });


    }

}