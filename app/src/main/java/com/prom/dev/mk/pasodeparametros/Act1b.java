package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act1b extends AppCompatActivity {
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1b);
        msg = ( TextView )  findViewById( R.id.msg );

        Bundle b = getIntent().getExtras();

        String content = "Hola "+ b.get( "NOMBRE" ) +" "+ b.get( "AP" ) +
                " ¿Aceptas las condiciones?";
        msg.setText( content );

    }


    public void comprobar(View view) {
        Intent i = new Intent();
        if( view.getId() == R.id.acpt ){
            i.putExtra("RESULTADO", "ACEPTADO");
        }
        if ( view.getId() == R.id.recha )
            i.putExtra( "RESULTADO", "RECHAZADO");
        setResult( RESULT_OK, i );
        finish();
    }
}
