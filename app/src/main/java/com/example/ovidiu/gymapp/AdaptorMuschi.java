package com.example.ovidiu.gymapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class AdaptorMuschi extends ArrayAdapter<muschi> {



    private View view;
    private muschi obiect;
    private int layoutResource;

    public AdaptorMuschi(Context context, int resource, List<muschi> objects) {
        super(context, resource, objects);
        this.layoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }
        obiect = getItem(position);
        if (obiect != null) {

            ImageView imagine = (ImageView) view.findViewById(R.id.imagine);
            TextView nume = (TextView) view.findViewById(R.id.numeexercitiu);
            nume.setText(obiect.a);
            imagine.setImageDrawable(obiect.b);
        }
        return view;


    }
}
