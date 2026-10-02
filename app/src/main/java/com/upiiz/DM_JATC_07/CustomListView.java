package com.upiiz.DM_JATC_07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.upiiz.DM_JATC_07.model.CustomAdapter;
import com.upiiz.DM_JATC_07.model.User;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity
        implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    // Variables
    ListView lvUsuarios;
    Button btnRegresar;
    ArrayList<User> listaUsuarios;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Enlazar
        lvUsuarios = findViewById(R.id.lvCustom);
        btnRegresar = findViewById(R.id.btnRegresar);
        cargarUsuarios();
        adapter = new CustomAdapter(this, listaUsuarios);
        lvUsuarios.setAdapter(adapter);

        // Acciones
        btnRegresar.setOnClickListener(this);
        lvUsuarios.setOnItemLongClickListener(this);
    }

    private void cargarUsuarios() {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new User(1L, "Juan", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(2L, "JoseJose", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(3L, "Juan Carlos", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(4L, "Ignacio", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(5L, "Fer", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(6L, "Dany", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(7L, "Sus", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(8L, "lel", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(9L, "MarioBros", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(10L, "RedBird", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(11L, "Sepa", "Amén", "09/29/2026", "5:20", R.drawable.sonic_logo));
        listaUsuarios.add(new User(12L, "SantaClaus", "CTM", "09/29/2026", "5:20", R.drawable.sonic_logo));
    }

    @Override
    public void onClick(View view) {
        // Regresar a MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        // Touch presionado durante cierto tiempo
        Toast.makeText(this, "Diste touch largo", Toast.LENGTH_LONG).show();
        return true;
    }
}