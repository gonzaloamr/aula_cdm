package com.example.primeiroteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaginaUmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_um);
    }
    public void abrePaginaTres (View view){
        Intent intent = new Intent(this,PaginaTresActivity.class);
        startActivity(intent);
    //public void abreTelaDois (View view){
       // Intent intent = new Intent(this,TelaDoisActivity.class);
       // startActivity(intent);

    }
}



