package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {
    private int correct;
    private int incorrect;
    private TextView text;
    private EditText num1;
    private EditText num2;
    private EditText resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        correct = 0;
        incorrect = 0;

        text = ( TextView )  findViewById( R.id.act4_history );
        num1 = ( EditText ) findViewById( R.id.act4_num1 );
        num2 = ( EditText ) findViewById( R.id.act4_num2 );
        resul = ( EditText ) findViewById( R.id.act4_resul );
        refresHystory();
        setNumbers();
    }

    private void setNumbers(){
        int i = ( int ) Math.floor( Math.random() * 100  + 1);
        int j = ( int ) Math.floor( Math.random() * 100  + 1);
        num1.setText( String.valueOf( i ) );
        num2.setText( String.valueOf( j ) );
    }

    public void validar( View v ){
        if( resul.getText().toString().isEmpty() ){
            Toast.makeText( getApplicationContext(), "Introduce el resultado", Toast.LENGTH_SHORT ).show();
            return;
        }
        Intent i = new Intent( this, Act2b.class );
        i.putExtra("NUM1", Integer.parseInt( num1.getText().toString() ) );
        i.putExtra("NUM2", Integer.parseInt( num2.getText().toString() ) );
        i.putExtra("RESULT", Integer.parseInt( resul.getText().toString() ) );

        startActivityForResult( i, 1997 );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if( requestCode == 1997 && resultCode == RESULT_OK ){
            boolean corrects = data.getExtras().getBoolean("REQUEST");
            if ( corrects )
                correct++;
            else
                incorrect++;
            setNumbers();
            refresHystory();
            resul.requestFocus();
        }

    }

    private void refresHystory(){
        String str = getString( R.string.act2_history );
        text.setText( str.split("%")[0] + correct + str.split("%")[1] + incorrect );
    }
}
