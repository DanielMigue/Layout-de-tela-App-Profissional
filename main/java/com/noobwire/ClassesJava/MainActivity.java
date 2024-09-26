package com.noobwire.aula1_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void avancarT2(View view) {
        Intent in = new Intent(MainActivity.this, Tela2.class);
        startActivity(in);
    }
}