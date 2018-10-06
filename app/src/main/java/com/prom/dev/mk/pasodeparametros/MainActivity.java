package com.prom.dev.mk.pasodeparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void act1(View view) {
        Intent i = new Intent(this, Act1.class );
        startActivity( i );
    }

    public void act2(View view) {
        Intent i = new Intent(this, Act2.class );
        startActivity( i );
    }

    public void act3(View view) {
        Intent i = new Intent(this, Act3.class );
        startActivity( i );
    }

    public void salir( View v ){
        finish();
    }

    public void act4(View view) {
        Intent i = new Intent(this, Act4.class );
        startActivity( i );
    }

}
