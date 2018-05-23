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
import java.util.ArrayList;

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
        View view = inflater.inflate(R.layout.listview, null);
        ListView listView=view.findViewById(R.id.listview);
        ArrayList<Attraction> attractions=new ArrayList<>();
        attractions.add(new Attraction(fragmentModel.getBackground(),fragmentModel.getResources(),fragmentModel.getPageText(),fragmentModel.getContent()));
        ListViewAdapter adapter=new ListViewAdapter(getContext(),attractions);
        listView.setAdapter(adapter);

        return view;
    }
}
