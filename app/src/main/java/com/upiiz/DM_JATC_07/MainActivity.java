package com.upiiz.DM_JATC_07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Variables
    Button btnBasicLV, btnListVP, btnBasicRV, btnRecyclerVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initComponents();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnBasicListView) {
            iniciarBasicListView();
        } else if (id == R.id.btnListViewPersonalizado) {
            iniciarCustomListView();
        } else if (id == R.id.btnBasicRecyclerView) {
            iniciarBasicRecyclerView();
        } else if (id == R.id.btnRecyclerViewP) {
            iniciarCustomRecyclerView();
        }
    }

    public void iniciarBasicListView() {
        // En los intent podemos usar parámetros
        Intent intentBLV = new Intent(this, BasicListActivity.class);
        startActivity(intentBLV);
    }

    public void iniciarCustomListView() {
        Intent intentCLV = new Intent(this, CustomListView.class);
        startActivity(intentCLV);
    }

    public void iniciarBasicRecyclerView() {
        Intent intentBRV = new Intent(this, BasicRecyclerViewActivity.class);
        startActivity(intentBRV);
    }

    public void iniciarCustomRecyclerView() {
        Intent intentCRV = new Intent(this, CustomRecyclerViewActivity.class);
        startActivity(intentCRV);
    }

    public void initComponents() {
        // Enlazar
        btnBasicLV = findViewById(R.id.btnBasicListView);
        btnListVP = findViewById(R.id.btnListViewPersonalizado);
        btnBasicRV = findViewById(R.id.btnBasicRecyclerView);
        btnRecyclerVP = findViewById(R.id.btnRecyclerViewP);

        // Listener
        btnBasicLV.setOnClickListener(this);
        btnListVP.setOnClickListener(this);
        btnBasicRV.setOnClickListener(this);
        btnRecyclerVP.setOnClickListener(this);
    }
}