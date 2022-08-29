package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Saludo extends AppCompatActivity {

    public TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_saludo);
        mensaje= findViewById(R.id.txtSaludo);
    }
    public void Saludar (View v){
        mensaje.setText("hola xd");
    }
}