package com.example.bios.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
        ArrayList<Fragment> fragments = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        MyFragmentPagerApabter fragmentPagerApabter = new MyFragmentPagerApabter(getSupportFragmentManager(), fragments, titles);
        ArrayList<Integer> resources1= new ArrayList<>();
        resources1.add(R.drawable.map_of_cairo);
        resources1.add(0);
        resources1.add(0);
        AboutCairoFragment aboutCairoFragment = new AboutCairoFragment(new FragmentModel(getString(R.string.about_cairo), getString(R.string.string1) + getString(R.string.string2), resources1, R.drawable.background2));
        fragments.add(aboutCairoFragment);
        ArrayList<Integer> resources2=new ArrayList<>();
        resources2.add(R.drawable.tahrirsquare);
        resources2.add(R.drawable.a800px_tahrir_square___february_9__2011);
        resources2.add(R.drawable.a____________);
        EltahrirFragment eltahrirFragment = new EltahrirFragment(new FragmentModel(getString(R.string.el_tahrir_square),getString(R.string.string3),resources2, R.drawable.a80060));
        fragments.add(eltahrirFragment);
        ArrayList<Integer> resources3=new ArrayList<>();
        resources3.add(R.drawable.cairo___islamic);
        resources3.add(0);
        resources3.add(0);
        ALazharFragment aLazharFragment = new ALazharFragment(new FragmentModel(getString(R.string.alazhar), getString(R.string.string4),
                resources3, R.drawable.aazhar1));
        fragments.add(aLazharFragment);
        ArrayList<Integer> resources4=new ArrayList<>();
        resources4.add(R.drawable.private_tour_giza_pyramids_and_sphinx_in_cairo_124917);
        resources4.add(R.drawable.pyramids_of_giza);
        resources4.add(R.drawable.egypt_pyramids_of_giza_great_pyramid_with_tomb_of_senegemib_inti_in_front);
        ThePyramidsFragment thePyramidsFragment = new ThePyramidsFragment(new FragmentModel(getString(R.string.the_pyramids_of_giza), getString(R.string.string5),
                resources4, R.drawable.egypt_cairo_pyramids_of_giza_and_camels_2));
        fragments.add(thePyramidsFragment);
        titles.add(getString(R.string.about));
        titles.add(getString(R.string.eltahrir));
        titles.add(getString(R.string.alazhar));
        titles.add(getString(R.string.pyramids));
        viewPager.setAdapter(fragmentPagerApabter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
