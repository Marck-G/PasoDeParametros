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

        lista = (ListView) findViewById( R.id.lista );
        final Link[] datos = {
                new Link("https://www.google.com", getDrawable( R.mipmap.ic_google ),"Google" ),
                new Link( "https://www.instagram.com", getDrawable( R.mipmap.ic_insta ), "Instagram" ),
                new Link( "https://www.youtube.com", getDrawable( R.mipmap.ic_you) , "Youtube")
        };

        WebAdapter ad = new WebAdapter( this, datos );

        lista.setAdapter( ad );

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent( Intent.ACTION_VIEW,  Uri.parse( datos[position].getUrl() ) );
                System.out.println( "=========| " +  Uri.parse( datos[position].getUrl() ).toString() );
                //i.setData(Uri.parse( datos[position].getUrl() ) );
                startActivity( i );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
