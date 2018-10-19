package com.prom.dev.mk.pasodeparametros;

import android.graphics.drawable.Drawable;

import java.net.URL;

public class Link {
    private String url;
    private Drawable img;
    private String nombre;

    public Link(String url, Drawable img, String nombre) {
        this.url = url;
        this.img = img;
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public Drawable getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }
}
