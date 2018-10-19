package com.prom.dev.mk.pasodeparametros;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class Ejer2 extends AppCompatActivity {
    private ListView lista;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);

        lista = (ListView) findViewById( R.id.lista );
        Link[] datos = {
                new Link("https://www.google.com", getDrawable( R.mipmap.ic_google ),"Google" ),
                new Link( "https://www.instagram.com", getDrawable( R.mipmap.ic_insta ), "Instagram" ),
                new Link( "https://www.youtube.com", getDrawable( R.mipmap.ic_you) , "Youtube")
        };

        WebAdapter ad = new WebAdapter( this, datos );

        lista.setAdapter( ad );
    }
}
