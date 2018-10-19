package com.prom.dev.mk.pasodeparametros;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WebAdapter extends ArrayAdapter {
    private Link[] data;
    public WebAdapter(Context context, Link[] data ){
        super(context, R.layout.listitem_web,data);
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from( getContext() );
        View item = inflater.inflate( R.layout.listitem_web, null );
        ImageView img = (ImageView) item.findViewById( R.id.itemImg );
        img.setImageDrawable( data[position].getImg() );
        TextView titulo = ( TextView ) item.findViewById( R.id.itemName );
        titulo.setText( data[position].getNombre() );
        TextView link = ( TextView ) item.findViewById( R.id.itemLink );
        link.setText( data[position].getUrl() );
        return item;
    }
}
