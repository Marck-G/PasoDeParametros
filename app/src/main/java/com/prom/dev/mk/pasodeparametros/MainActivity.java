package com.prom.dev.mk.pasodeparametros;
/* Actividad 4*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private  String[] poblaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById( R.id.spiner );
        String[] st = { "España", "Irak", "China", "Estados Unidos"  };
        String[] poblaciones = {"46 766 000","40 364 000", "1 395 261 000", "329 071 000"};
    }
    
}
