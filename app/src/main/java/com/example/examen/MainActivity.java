package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

// NO SE COMO HACERLO
// falta mas practica

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // identificamos lista
        // listView = findViewById(R.id.list);

        // creamos array para probar
        String[] arrayNombre = {"primero", "segundo", "tercero", "cuarto"};

        // declaramos i iniciamos arrayAdapter
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.list_content, arrayNombre);

        // agregamos adapter
        //listView.setAdapter(arrayAdapter);

    }
}