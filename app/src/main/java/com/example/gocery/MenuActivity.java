package com.example.gocery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button btnAddStore, btnAddProduct, btnGenerateQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Initialize buttons
        btnAddStore = findViewById(R.id.btnAddStore);
        btnAddProduct = findViewById(R.id.btnAddProduct);
        btnGenerateQR = findViewById(R.id.btnGenerateQR);

        // Set onClickListeners for navigation
        btnAddStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AddStore activity
                Intent intent = new Intent(MenuActivity.this, AddStore.class);
                startActivity(intent);
            }
        });

        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to AddProduct activity
                Intent intent = new Intent(MenuActivity.this, AddProduct.class);
                startActivity(intent);
            }
        });

        btnGenerateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to GenerateQR activity
                Intent intent = new Intent(MenuActivity.this, GenerateQrActivity.class);
                startActivity(intent);
            }
        });
    }
}
