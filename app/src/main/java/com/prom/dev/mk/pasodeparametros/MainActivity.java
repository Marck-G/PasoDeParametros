package com.prom.dev.mk.pasodeparametros;
/* Actividad 4*/
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void act1(View view) {
        Intent i = new Intent( this, Ejer1.class );
        startActivity( i );
    }

    public void act2(View view) {
        Intent i = new Intent( this, Ejer2.class );
        startActivity( i );
    }
}
