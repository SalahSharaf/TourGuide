package com.example.bios.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
        MyFragmentPagerApabter fragmentPagerApabter=new MyFragmentPagerApabter(this);
        fragmentPagerApabter.addFragment("About");
        fragmentPagerApabter.addFragment("El Tahrir");
        fragmentPagerApabter.addFragment("Alazhar");
        fragmentPagerApabter.addFragment("Pyramids");
        viewPager.setAdapter(fragmentPagerApabter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
