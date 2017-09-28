package com.example.alfonso.jara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtPeso, edtCantidad, edtHuesos, edtCarnes, edtVegetales, edtCereales, edtVisceras;
    private TextView txvCantidad, txvHuesos, txvCarnes, txvVegetales, txvCereales, txvVisceras,
                    canCantidad, canHuesos, canCarnes, canVegetales, canCereales, canVisceras;
    private double numCantidad, numHuesos, numCarnes, numVegetales, numCereales, numVisceras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso = (EditText)findViewById(R.id.edtPeso);
        edtPeso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Actualizar();
            }
        });

        edtCantidad = (EditText)findViewById(R.id.edtCantidad);
        edtCantidad.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canCantidad.setText(Raciones(txvCantidad.getText().toString(), edtCantidad.getText().toString()));
            }
        });

        edtHuesos = (EditText)findViewById(R.id.edtHuesos);
        edtHuesos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canHuesos.setText(Raciones(txvHuesos.getText().toString(), edtHuesos.getText().toString()));
            }
        });

        edtCarnes = (EditText)findViewById(R.id.edtCarnes);
        edtCarnes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canCarnes.setText(Raciones(txvCarnes.getText().toString(), edtCarnes.getText().toString()));
            }
        });

        edtVegetales = (EditText)findViewById(R.id.edtVegetales);
        edtVegetales.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canVegetales.setText(Raciones(txvVegetales.getText().toString(), edtVegetales.getText().toString()));
            }
        });

        edtCereales = (EditText)findViewById(R.id.edtCereales);
        edtCereales.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canCereales.setText(Raciones(txvCereales.getText().toString(), edtCereales.getText().toString()));
            }
        });

        edtVisceras = (EditText)findViewById(R.id.edtVisceras);
        edtVisceras.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                canVisceras.setText(Raciones(txvVisceras.getText().toString(), edtVisceras.getText().toString()));
            }
        });

        txvCantidad = (TextView)findViewById(R.id.txvCantidad);
        txvHuesos = (TextView)findViewById(R.id.txvHuesos);
        txvCarnes = (TextView)findViewById(R.id.txvCarnes);
        txvVegetales = (TextView)findViewById(R.id.txvVegetales);
        txvCereales = (TextView)findViewById(R.id.txvCereales);
        txvVisceras = (TextView)findViewById(R.id.txvVisceras);

        canCantidad = (TextView)findViewById(R.id.canCantidad);
        canHuesos = (TextView)findViewById(R.id.canHuesos);
        canCarnes = (TextView)findViewById(R.id.canCarnes);
        canVegetales = (TextView)findViewById(R.id.canVegetales);
        canCereales = (TextView)findViewById(R.id.canCereales);
        canVisceras = (TextView)findViewById(R.id.canVisceras);

        Actualizar();
    }

    private void Actualizar() {
        double peso = 0;
        try {
            peso = Double.parseDouble(edtPeso.getText().toString());
        } catch (Exception e) {}

        numCantidad = peso*25;
        txvCantidad.setText(numCantidad+"");
        numHuesos = numCantidad*65/100;
        txvHuesos.setText(numHuesos+"");
        numCarnes = numCantidad*20/100;
        txvCarnes.setText(numCarnes+"");
        numVegetales = numCantidad*5/100;
        txvVegetales.setText(numVegetales+"");
        numCereales = numCantidad*2/100;
        txvCereales.setText(numCereales+"");
        numVisceras = numCantidad*8/100;
        txvVisceras.setText(numVisceras+"");

        canCantidad.setText(Raciones(txvCantidad.getText().toString(), edtCantidad.getText().toString()));
        canHuesos.setText(Raciones(txvHuesos.getText().toString(), edtHuesos.getText().toString()));
        canCarnes.setText(Raciones(txvCarnes.getText().toString(), edtCarnes.getText().toString()));
        canVegetales.setText(Raciones(txvVegetales.getText().toString(), edtVegetales.getText().toString()));
        canCereales.setText(Raciones(txvCereales.getText().toString(), edtCereales.getText().toString()));
        canVisceras.setText(Raciones(txvVisceras.getText().toString(), edtVisceras.getText().toString()));
    }

    private String Raciones(String necesario, String total) {
        try {
            return String.format("%.2f", (Double.parseDouble(total)/Double.parseDouble(necesario)) )+" veces";
        } catch (Exception e) {}
        return "";
    }
}