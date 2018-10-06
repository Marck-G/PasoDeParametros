package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class Act3 extends AppCompatActivity {
    private EditText nombre, ap;
    private RadioButton mas, fem;
    private CheckBox[] checks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        checks = new CheckBox[4];
        checks[0] = ( CheckBox ) findViewById( R.id.mus );
        checks[1] = ( CheckBox ) findViewById( R.id.dep );
        checks[2] = ( CheckBox ) findViewById( R.id.via );
        checks[3] = ( CheckBox ) findViewById( R.id.lec );
        nombre    = ( EditText ) findViewById( R.id.act3_name );

        ap  = ( EditText )    findViewById( R.id.act3_ap );
        mas = ( RadioButton ) findViewById( R.id.mas );
        fem = ( RadioButton ) findViewById( R.id.fem );
    }

    public void enviar(View view) {
        if( nombre.getText().toString().isEmpty() || ap.getText().toString().isEmpty() ){
            Toast.makeText(getApplicationContext(), "Rellena todos los campos", Toast.LENGTH_SHORT ).show();
            return;
        }
        Bundle b        = new Bundle();
        String nombre   = this.nombre.getText().toString();
        String ap       = this.ap.getText().toString();
        String sexo     = ( mas.isChecked() )? "Masculino":"Femenino" ;

        ArrayList<String> ocio = new ArrayList<String>();
        for( CheckBox c : checks ){
            if ( c.isChecked() )
                ocio.add( c.getText().toString() );
        }

        if ( ocio.isEmpty() )
            ocio.add( "Nimguno" );

        b.putString( "NOMBRE", nombre );
        b.putString( "AP", ap );
        b.putString( "SEXO", sexo );
        b.putStringArrayList( "OCIO", ocio );

        Intent i = new Intent( this, Act3b.class );
        i.putExtras( b );
        startActivity( i );

    }
}
