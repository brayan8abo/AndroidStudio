package com.example.miproyecto001;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText entero1;
    private EditText entero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        entero1 = findViewById(R.id.entero1);
        entero2 = findViewById(R.id.entero2);
        resultado = findViewById(R.id.resultado);


    }

    public void Sumar(View view) {
        int num1 = Integer.parseInt(entero1.getText().toString());
        int num2 = Integer.parseInt(entero2.getText().toString());
        int suma = num1 + num2;
        // resultado.setText(String.valueOf(suma));
        resultado.setText(String.valueOf(suma));

    }

    public void Restar(View view) {
        int num1 = Integer.parseInt(entero1.getText().toString());
        int num2 = Integer.parseInt(entero2.getText().toString());
        int suma = num1 - num2;
        // resultado.setText(String.valueOf(suma));
        resultado.setText(String.valueOf(suma));

    }

    public void Multiplicar(View view) {
        int num1 = Integer.parseInt(entero1.getText().toString());
        int num2 = Integer.parseInt(entero2.getText().toString());
        int suma = num1 * num2;
        // resultado.setText(String.valueOf(suma));
        resultado.setText(String.valueOf(suma));

    }

    public void Dividir(View view) {
        int num1 = Integer.parseInt(entero1.getText().toString());
        int num2 = Integer.parseInt(entero2.getText().toString());
        int suma = num1 / num2;
        // resultado.setText(String.valueOf(suma));
        resultado.setText(String.valueOf(suma));

    }
}