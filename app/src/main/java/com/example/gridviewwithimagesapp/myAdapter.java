package com.example.gridviewwithimagesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends BaseAdapter {
    private final String character[];
    private final int image[];
    Context context;

    public myAdapter(String[] character, int[] image, Context context) {
        this.character = character;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return character.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.singlerowitem, null);

        ImageView img = (ImageView) convertView.findViewById(R.id.imgview);
        TextView txt = (TextView) convertView.findViewById(R.id.textview);

        img.setImageResource(image[position]);
        txt.setText(character[position]);

        return convertView;
    }
}
