package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act1 extends AppCompatActivity {
    private EditText nombre;
    private EditText ap;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);

        nombre  = ( EditText )  findViewById( R.id.nombre );
        ap      = ( EditText )  findViewById( R.id.ap );
        text    = ( TextView )  findViewById( R.id.condiciones );
    }
    public void verificar( View v ){
        Bundle b = new Bundle();
        //si no ha introducido datos no hacemos nada
        if ( nombre.getText().toString().isEmpty() || ap.getText().toString().isEmpty() ){
            Toast.makeText( getApplicationContext(), "Debes rellenar los dos campos", Toast.LENGTH_SHORT ).show();
            return;
        }

        b.putString( "NOMBRE", nombre.getText().toString() );
        b.putString( "AP", ap.getText().toString() );

        Intent n = new Intent( this, Act1b.class );
        n.putExtras( b );
        startActivityForResult( n, 23 );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if( requestCode == 23 && resultCode == RESULT_OK ){
            //recuperamos la informacion
            text.setText( "Acepta condiciones: " + data.getExtras().get( "RESULTADO" ) );
        }
    }

    public void volver(View view) {
        finish();
    }
}
