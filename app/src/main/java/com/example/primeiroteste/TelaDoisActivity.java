package com.example.primeiroteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaDoisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);
    }

    public void voltaPaginaUm (View view){
        Intent intent = new Intent(this,PaginaUmActivity.class);
        startActivity(intent);

    }

    public void abrePaginaTres (View view){
        Intent intent = new Intent(this,PaginaTresActivity.class);
        //intent.putExtra(name: "textPersonName")

        EditText editNome = (EditText)findViewById(R.id.editTextTextPersonName);

        EditText editSenha = (EditText)findViewById(R.id.editTextTextPassword);
        if (editNome == editSenha) {

        }
        startActivity(intent);

    }
}