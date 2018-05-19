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
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class ALazharFragment extends Fragment {
    FragmentModel fragmentModel;

    @SuppressLint("ValidFragment")
    public ALazharFragment(FragmentModel fragmentModel) {
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
        TextView basic, content;
        ImageView picture1, picture2, picture3,background;
        basic = view.findViewById(R.id.basic);
        content = view.findViewById(R.id.content);
        picture1 = view.findViewById(R.id.picture1);
        picture2 = view.findViewById(R.id.picture2);
        ((ViewManager)picture2.getParent()).removeView(picture2);
        picture3 = view.findViewById(R.id.picture3);
        ((ViewManager)picture3.getParent()).removeView(picture3);
        basic.setText(fragmentModel.getPageText());
        content.setText(fragmentModel.getContent());
        picture1.setImageResource(fragmentModel.getImageView1());
        picture2.setImageResource(fragmentModel.getImageView2());
        picture3.setImageResource(fragmentModel.getImageView3());
        background=view.findViewById(R.id.background);
        background.setImageResource(fragmentModel.getBackground());

        return view;
    }
}
