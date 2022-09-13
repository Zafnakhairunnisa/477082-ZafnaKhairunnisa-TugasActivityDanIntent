package com.example.tugaspertrmuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView jenis, replyMenu;
    EditText jumlah;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        jenis = findViewById(R.id.text_jenis);
        replyMenu = findViewById(R.id.reply_menu);
        jumlah = findViewById(R.id.inp_jumlah);
        ok = findViewById(R.id.btn_ok);

        Intent terima = getIntent();
        String terimaMenu = terima.getStringExtra("namaMenu");
        replyMenu.setText(terimaMenu);

        jenis.setText("Makanan");

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                String jml = jumlah.getText().toString();
                intent.putExtra("jumlahMenu", jml);
                startActivity(intent);
            }
        });

    }
}