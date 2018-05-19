package com.example.bios.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyFragmentPagerApabter extends FragmentPagerAdapter {
    // ArrayList<Integer> picture1 = new ArrayList<>();
    // ArrayList<Integer> picture2 = new ArrayList<>();
    // ArrayList<Integer> picture3 = new ArrayList<>();
    ArrayList<Fragment> fragments;
    ArrayList<String> titles;

    public MyFragmentPagerApabter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    public void addFragment(Fragment model, String title) {
        fragments.add(model);
        titles.add(title);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

}
