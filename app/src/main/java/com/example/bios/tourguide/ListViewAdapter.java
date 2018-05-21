package com.example.bios.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Integer> {

    ArrayList<Integer> resources;
    public ListViewAdapter(Context context, ArrayList<Integer> resources) {
        super(context,0,resources);
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return resources.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem_layout, null);
        }
        ImageView imageView = convertView.findViewById(R.id.picture);
        imageView.setImageResource(resources.get(position));
        return convertView;
    }
}
