package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Act4b extends AppCompatActivity {

    private TextView text;
    private int num1, num2, resul;
    private boolean correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4b);
        Bundle b = getIntent().getExtras();
        num1 = b.getInt("NUM1");
        num2 = b.getInt( "NUM2" );
        resul = b.getInt( "RESULT" );
        text = (TextView)  findViewById( R.id.act4_msgOut );
        correct = num1 * num2 == resul;
        text.setText( "El resultado de la operación es " + ( ( correct )? "CORRECTA": "INCORRECTA" ) );
    }

    public void back( View v ){
        Intent i = new Intent();
        i.putExtra("REQUEST", correct );
        setResult( RESULT_OK, i );
        finish();
    }
}
