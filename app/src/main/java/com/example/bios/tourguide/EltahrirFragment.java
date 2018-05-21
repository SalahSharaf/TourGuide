package com.example.bios.tourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.security.PublicKey;

@SuppressLint("ValidFragment")
public class EltahrirFragment extends Fragment {

    FragmentModel fragmentModel;

    @SuppressLint("ValidFragment")
    public EltahrirFragment(FragmentModel fragmentModel) {
        this.fragmentModel = fragmentModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thepyramidsfragment_layout, null);
        TextView basic,content;
        ImageView picture1,picture2,picture3,background;
        basic=view.findViewById(R.id.basic);
        content=view.findViewById(R.id.content);
        ListView listView=view.findViewById(R.id.listview);
        ListViewAdapter adapter=new ListViewAdapter(getContext(),fragmentModel.getResources());
        listView.setAdapter(adapter);

        basic.setText(fragmentModel.getPageText());
        content.setText(fragmentModel.getContent());
        background=view.findViewById(R.id.background);
        background.setImageResource(fragmentModel.getBackground());

        return view;
    }
}
