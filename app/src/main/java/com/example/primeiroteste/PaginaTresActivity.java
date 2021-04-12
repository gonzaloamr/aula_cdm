package com.example.primeiroteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaTresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_tres);
    }

    public void voltaPaginaUm (View view){
        Intent intent = new Intent(this,PaginaUmActivity.class);
        startActivity(intent);

    }
}