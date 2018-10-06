package com.prom.dev.mk.pasodeparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Act3b extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3b);

        txt = ( TextView )  findViewById( R.id.act3_msg );
        setString( getIntent().getExtras() );

    }
    private void setString( Bundle b ){

        String[] str = getString( R.string.act3_msg ).split("%");
        String out = b.getString("NOMBRE") + str[0];
        out+= b.getString( "AP" ) + str[1];
        out += b.getString("SEXO" ) + str[2];
        ArrayList<String> ls = b.getStringArrayList("OCIO");
        out +=  (  ( ls.size() == 1 )? ls.get(0):ls.size() ) + str[3];
        if ( ls.size() != 1 )
            for( String o : ls )
                out+= o +" ";
        txt.setText( out );

    }
}
