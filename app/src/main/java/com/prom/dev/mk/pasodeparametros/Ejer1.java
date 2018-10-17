package com.prom.dev.mk.pasodeparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Ejer1 extends AppCompatActivity {
    private Spinner sp;
    private TextView label;
    private  long[] poblaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1);
        sp = (Spinner) findViewById( R.id.spiner );
        label = (TextView) findViewById( R.id.label );
        String[] st = { "España", "Irak", "China", "Estados Unidos", "Mexico"  };
        poblaciones = new long[] {46766000,40364000, 1395261000, 329071000, 125357000 };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , st );
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = String.format( getString( R.string.textView ), poblaciones[ sp.getSelectedItemPosition() ]  );
                label.setText( text );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
