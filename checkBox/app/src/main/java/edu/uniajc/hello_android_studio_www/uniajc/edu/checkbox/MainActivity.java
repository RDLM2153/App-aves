package edu.uniajc.hello_android_studio_www.uniajc.edu.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtVal1, edtVal2;
    private TextView txtResult;
    private CheckBox cSum, cRest, cExp, cRad, cTodas, cNinguno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1= findViewById(R.id.edtV1);
        edtVal2= findViewById(R.id.edtV2);
        txtResult= findViewById(R.id.txtResult);
        cSum= findViewById(R.id.checkSum);
        cRest= findViewById(R.id.checkResta);
        cExp =findViewById(R.id.checkExp);
        cRad= findViewById(R.id.checkRad);
    }
    public void operar(View view){
        String val1= edtVal1.getText().toString();
        String val2= edtVal2.getText().toString();
        int nro1= Integer.parseInt(val1);
        int nro2= Integer.parseInt(val2);
        if (cSum.isChecked()==true){
            int suma= nro1+nro2;
            String resu=String.valueOf(suma);
            txtResult.setText(resu);
        }else if(cRest.isChecked()==true){
            int resta= nro1-nro2;
            String resu=String.valueOf(resta);
            txtResult.setText(resu);
        }
        else if(cExp.isChecked()==true){ //exponente
            int potencia= (int) Math.pow(nro1, nro2);
            String resu=String.valueOf(potencia);
            txtResult.setText(resu);
        }
        else if(cRad.isChecked()==true){ //radicacion
            double raiz= Math.pow(nro1, (double) 1/nro2);
            String resu=String.valueOf(raiz);
            txtResult.setText(resu);
        } else if(){

        }
    }
}