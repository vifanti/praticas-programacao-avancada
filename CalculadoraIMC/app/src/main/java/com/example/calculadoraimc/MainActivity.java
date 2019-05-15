package com.example.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

public class MainActivity extends AppCompatActivity {

    private EditText etPeso;
    private EditText etAltura;
    private TextView etIMC;
    private Button btCalcular;
    private TextView resultadoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso =  findViewById(R.id.etPeso);
        etAltura =  findViewById(R.id.etAltura);
        etIMC = findViewById(R.id.etIMC);
        resultadoview = findViewById(R.id.resultadoview);
        btCalcular = findViewById(R.id.btCalcular);

        this.btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.valueOf(etPeso.getText().toString());
                double altura = Double.valueOf(etAltura.getText().toString());
                double calc = peso/(altura*altura);
                double resultado = calc;

                if(resultado <= 19.1) {
                    etIMC.setText(String.format("%.2f",calc));
                    resultadoview.setText(String.format("está abaixo do peso",resultado));
                }



            }
        });
    }
}