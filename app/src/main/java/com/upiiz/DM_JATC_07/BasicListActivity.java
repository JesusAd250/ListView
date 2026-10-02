package com.upiiz.DM_JATC_07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class BasicListActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegresar;
    ListView tvBasico;
    ArrayList<String> listadoProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 2.- Enlazar
        btnRegresar = findViewById(R.id.btnRegresar);
        tvBasico = findViewById(R.id.tvBasico);

        // Acciones
        btnRegresar.setOnClickListener(this);
        cargarDatos();

        // Cargamos el adaptador
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listadoProductos);
        tvBasico.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        regresar();
    }

    public void regresar() {
        Intent intentRegresar = new Intent(this, MainActivity.class);
        startActivity(intentRegresar);
    }

    public void cargarDatos() {
        // Memoria - Array
        // Base de datos - SQLite - ROOM
        // API REST desarrollada con Arquitectura Hexagonal
        // Puertos y Adaptadores
        listadoProductos = new ArrayList<>();
        listadoProductos.add("Fabuloso");
        listadoProductos.add("Cloro");
        listadoProductos.add("Pinol");
        listadoProductos.add("Jabon Zote");
        listadoProductos.add("Maestro Limpio");
        listadoProductos.add("Pato Purific");
        listadoProductos.add("AJAX");
        listadoProductos.add("Mister Musculo");
        listadoProductos.add("Vel Rosita");
        listadoProductos.add("Vinagre de manzana");
        listadoProductos.add("Salvo");
        listadoProductos.add("Jabon Foca");
        listadoProductos.add("Blanca Nieves");
        listadoProductos.add("Downy");
    }
}