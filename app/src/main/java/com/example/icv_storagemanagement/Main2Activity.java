package com.example.icv_storagemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button BotonRNM, BotonES, BotonVI, BotonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AdminSQLiteOpenHelper conn=new AdminSQLiteOpenHelper(this, "bd_materiales",null,1);

        BotonRNM = (Button)findViewById(R.id.B12);
        BotonES = (Button)findViewById(R.id.B22);
        BotonVI = (Button)findViewById(R.id.B32);
        BotonSalir = (Button)findViewById(R.id.B42);

        BotonRNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nuevoprod = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(Nuevoprod);
            }
        });

        BotonVI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ventanainv = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(Ventanainv);
            }
        });

        BotonES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VentanaES = new Intent(Main2Activity.this, entradas_salidas.class);
                startActivity(VentanaES);
            }
        });

        BotonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sesion Cerrada", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
