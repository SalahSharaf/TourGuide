package com.example.bios.tourguide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class AboutFragment extends Fragment {
    public static AboutFragment instance = null;

    public static AboutFragment getInstance() {
        if (instance == null) {
            instance = new AboutFragment();
        }
        return instance;
    }
    private AboutFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.aboutfragment_layout,null);
        return view;

    }
}
