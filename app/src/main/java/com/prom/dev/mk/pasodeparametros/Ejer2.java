package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Browser;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class Ejer2 extends AppCompatActivity {
    private ListView lista;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);

        //cogemos la lista de la vista
        lista = (ListView) findViewById( R.id.lista );
        //Creamos el array con los datos
        final Link[] datos = {
                new Link("https://www.google.com", getDrawable( R.mipmap.ic_google ),"Google" ),
                new Link( "https://www.instagram.com", getDrawable( R.mipmap.ic_insta ), "Instagram" ),
                new Link( "https://www.youtube.com", getDrawable( R.mipmap.ic_you) , "Youtube")
        };
        //creamos nuestro adaptador con el array de dtaos
        WebAdapter ad = new WebAdapter( this, datos );

        // Asignamos el adaptador a la lista
        lista.setAdapter( ad );
        //colocamos el listener 
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent( Intent.ACTION_VIEW,  Uri.parse( datos[position].getUrl() ) );
                startActivity( i );
            }
        });
    }
}
