package edu.uniajc.hello_android_studio_www.uniajc.edu.apppajaros;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickCambiarAve (View view) {
        //Casteo casting
        Spinner aves = (Spinner) findViewById(R.id.spinAves);
        String ave= String.valueOf(aves.getSelectedItem());
        ImageView imgAve= (ImageView) findViewById(R.id.imgAve);
        MediaPlayer sonido;
        if (ave.equals("Barranquero Bocon")){
            imgAve.setImageResource(R.drawable.berraquero);
            sonido= MediaPlayer.create(this,R.raw.pajaro);
            sonido.start();

        }else if (ave.equals("Colibrí Sietecolores")){
            imgAve.setImageResource(R.drawable.colibris);
            sonido= MediaPlayer.create(this,R.raw.colibri);
            sonido.start();

            }else if (ave.equals("Colibrí Paramuno")){
            imgAve.setImageResource(R.drawable.colibrip);
            sonido= MediaPlayer.create(this,R.raw.colibrip);
            sonido.start();
        }else if (ave.equals("Compás")){
            imgAve.setImageResource(R.drawable.compas);

        }else if (ave.equals("Frutero de Cabeza Negra")){
            imgAve.setImageResource(R.drawable.frutero);
            sonido= MediaPlayer.create(this,R.raw.frutero);
            sonido.start();

        }else if (ave.equals("Inca de Frontino")){
            imgAve.setImageResource(R.drawable.inca);
            sonido= MediaPlayer.create(this,R.raw.inca);
            sonido.start();

        }else if (ave.equals("Mielero Pechirrufo")){
            imgAve.setImageResource(R.drawable.mielero);

            sonido= MediaPlayer.create(this,R.raw.mielero);
            sonido.start();
        }else if (ave.equals("Pato de los Torrentes")){
            imgAve.setImageResource(R.drawable.pato);
            sonido= MediaPlayer.create(this,R.raw.pato);
            sonido.start();
        }else if (ave.equals("Tángara Multicolor")){
            imgAve.setImageResource(R.drawable.tangara);
            sonido= MediaPlayer.create(this,R.raw.tangara);
            sonido.start();
        }else if (ave.equals("Buhíto Andino")){
            imgAve.setImageResource(R.drawable.buhito);
            sonido= MediaPlayer.create(this,R.raw.buho);
            sonido.start();
        }
    }
}