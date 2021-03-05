package com.example.parcial;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = (ImageView) findViewById(R.id.ivgallery);
    }


    public void selecImg(View v)
    {

        final CharSequence[] opciones ={"Tomar Foto","Buscar Imagen"};
        final AlertDialog.Builder alertOpciones = new AlertDialog.Builder(MainActivity.this);
        alertOpciones.setTitle("Seleccione...");
        alertOpciones.setItems(opciones, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                switch (opciones[i].toString()){
                    case "Tomar Foto":
                        tomarFoto();
                        break;

                    case "Buscar Imagen":
                        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                        intent.setType("image/");
                        startActivityForResult(intent.createChooser(intent,"Seleccione la app"),10);
                        break;
                }
            }
        });
        alertOpciones.show();

    }
}