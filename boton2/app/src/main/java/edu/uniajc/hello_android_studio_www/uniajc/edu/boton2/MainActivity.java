package edu.uniajc.hello_android_studio_www.uniajc.edu.boton2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtVal1, edtVal2;
    private TextView txtvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1 = findViewById(R.id.edtval1);
        edtVal2 = findViewById(R.id.edtVal2);
        txtvResultado = findViewById(R.id.txtvResultado);

    }
    public void sumar (View view){
        String val1=edtVal1.getText().toString();
        String val2=edtVal2.getText().toString();
        int nro1=Integer.parseInt(val1);
        int nro2=Integer.parseInt(val2);
        int suma=nro1+nro2;
        String result= String.valueOf(suma);
        txtvResultado.setText(result);
    }

}