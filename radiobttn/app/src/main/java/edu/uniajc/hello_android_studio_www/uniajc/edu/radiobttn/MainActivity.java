package edu.uniajc.hello_android_studio_www.uniajc.edu.radiobttn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtVal1, edtVal2;
    private TextView txtResult;
    private RadioButton rSum, rRest, rExp, rRad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtVal1= findViewById(R.id.edtV1);
        edtVal2= findViewById(R.id.edtV2);
        txtResult= findViewById(R.id.txtResult);
        rSum= findViewById(R.id.rdbSum);
        rRest= findViewById(R.id.rdbResta);
        rExp =findViewById(R.id.rdbExp);
        rRad= findViewById(R.id.rdbRad);

    }
    public void operar(View view){
        String val1= edtVal1.getText().toString();
        String val2= edtVal2.getText().toString();
        int nro1= Integer.parseInt(val1);
        int nro2= Integer.parseInt(val2);
        if (rSum.isChecked()==true){
            int suma= nro1+nro2;
            String resu=String.valueOf(suma);
            txtResult.setText(resu);
        }else if(rRest.isChecked()==true){
            int resta= nro1-nro2;
            String resu=String.valueOf(resta);
            txtResult.setText(resu);
        }
        else if(rExp.isChecked()==true){ //exponente
            int potencia= (int) Math.pow(nro1, nro2);
            String resu=String.valueOf(potencia);
            txtResult.setText(resu);
        }
        else if(rRad.isChecked()==true){ //radicacion
            double raiz= Math.pow(nro1, (double) 1/nro2);
            String resu=String.valueOf(raiz);
            txtResult.setText(resu);
        }
    }

}