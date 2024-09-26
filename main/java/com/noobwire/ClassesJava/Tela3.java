package com.noobwire.aula1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }

    public void voltarT2(View view) {
        Intent in = new Intent(Tela3.this, Tela2.class);
        startActivity(in);
    }

    public void avancarT3(View view) {
        Intent in = new Intent(Tela3.this,Tela4.class);
        startActivity(in);
    }
}