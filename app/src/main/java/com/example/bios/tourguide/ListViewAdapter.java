package com.example.bios.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Attraction> {

    ArrayList<Attraction> attractions;
    public ListViewAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context,0,attractions);
        this.attractions = attractions;
    }

    @Override
    public int getCount() {
        return attractions.size();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.thepyramidsfragment_layout, null);
        }
        ImageView imageView = convertView.findViewById(R.id.picture1);
        ImageView imageView2 = convertView.findViewById(R.id.picture2);
        ImageView imageView3 = convertView.findViewById(R.id.picture3);

        imageView.setImageResource(attractions.get(position).getResources().get(0));
        imageView2.setImageResource(attractions.get(position).getResources().get(1));
        imageView3.setImageResource(attractions.get(position).getResources().get(2));

        ImageView background=convertView.findViewById(R.id.background);
        TextView basic=convertView.findViewById(R.id.basic);
        TextView content=convertView.findViewById(R.id.content);
        background.setImageResource(attractions.get(position).getBackground());
        basic.setText(attractions.get(position).getBasic());
        content.setText(attractions.get(position).getContent());
        return convertView;
    }
}
