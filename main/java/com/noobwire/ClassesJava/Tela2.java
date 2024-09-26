package com.noobwire.aula1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void avancarT3(View view) {
        //AVANÇA PARA A TELA 3
        Intent in = new Intent(Tela2.this, Tela3.class);
        startActivity(in);
    }

    public void voltarTp(View view) {
        //VOLTA PARA A TELA PRINCIPAL
        Intent in = new Intent(Tela2.this, MainActivity.class);
        startActivity(in);
    }
}